package com.fc.test.service;

import java.util.ArrayList;
import java.util.List;

import com.fc.test.common.conf.LanguageUtil;
import com.fc.test.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.CmsHtmlModuleMapper;
import com.fc.test.model.auto.CmsHtmlModule;
import com.fc.test.model.auto.CmsHtmlModuleExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 页面模块Service
* @Title: CmsHtmlModuleService.java 
* @Package com.fc.test.service 
* @author fuce
* @email 87766867@qq.com
* @date 2019-07-11 13:02:38  
 */
@Service
public class CmsHtmlModuleService implements BaseService<CmsHtmlModule, CmsHtmlModuleExample>{
	@Autowired
	private CmsHtmlModuleMapper cmsHtmlModuleMapper;
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<CmsHtmlModule> list(Tablepar tablepar,String name){
	        CmsHtmlModuleExample testExample=new CmsHtmlModuleExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
				testExample.createCriteria().andCodeLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<CmsHtmlModule> list= cmsHtmlModuleMapper.selectByExample(testExample);
	        PageInfo<CmsHtmlModule> pageInfo = new PageInfo<CmsHtmlModule>(list);
	        return  pageInfo;
	 }


	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<CmsHtmlModule> listBylanguage(Tablepar tablepar,String name){
		CmsHtmlModuleExample testExample=new CmsHtmlModuleExample();
		testExample.setOrderByClause("id ASC");
		if(name!=null&&!"".equals(name)){
			testExample.createCriteria().andCodeLike("%"+name+"%");
		}

		String language = LanguageUtil.getCurrentLang();
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<CmsHtmlModule> list= new ArrayList<>();
		if(StringUtils.isEmpty(language)){
			list= cmsHtmlModuleMapper.selectByExampleEn(testExample);
		}else if("zh_CN".toLowerCase().equals(language.toLowerCase())){
			list= cmsHtmlModuleMapper.selectByExampleZh(testExample);
		}else if("en".toLowerCase().equals(language.toLowerCase())){
			list= cmsHtmlModuleMapper.selectByExampleEn(testExample);
		}else {
			list= cmsHtmlModuleMapper.selectByExampleEn(testExample);
		}

		PageInfo<CmsHtmlModule> pageInfo = new PageInfo<CmsHtmlModule>(list);
		return  pageInfo;
	}

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<CmsHtmlModule> getPagelist(Tablepar tablepar,CmsHtmlModuleExample testExample){
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<CmsHtmlModule> list= cmsHtmlModuleMapper.selectByExample(testExample);
		PageInfo<CmsHtmlModule> pageInfo = new PageInfo<CmsHtmlModule>(list);
		return  pageInfo;
	}


	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<CmsHtmlModule> getPagelistBylanguage(Tablepar tablepar,CmsHtmlModuleExample testExample){
		String language = LanguageUtil.getCurrentLang();
		PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
		List<CmsHtmlModule> list= new ArrayList<>();
		if(StringUtils.isEmpty(language)){
			list= cmsHtmlModuleMapper.selectByExampleEn(testExample);
		}else if("zh_CN".toLowerCase().equals(language.toLowerCase())){
			list= cmsHtmlModuleMapper.selectByExampleZh(testExample);
		}else if("en".toLowerCase().equals(language.toLowerCase())){
			list= cmsHtmlModuleMapper.selectByExampleEn(testExample);
		}else {
			list= cmsHtmlModuleMapper.selectByExampleEn(testExample);
		}

		PageInfo<CmsHtmlModule> pageInfo = new PageInfo<CmsHtmlModule>(list);
		return  pageInfo;
	}

	@Override
	public int deleteByPrimaryKey(String ids) {
		List<String> lista=Convert.toListStrArray(ids);
		CmsHtmlModuleExample example=new CmsHtmlModuleExample();
		example.createCriteria().andIdIn(lista);
		return cmsHtmlModuleMapper.deleteByExample(example);
	}
	
	
	@Override
	public CmsHtmlModule selectByPrimaryKey(String id) {
		
		return cmsHtmlModuleMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public int updateByPrimaryKeySelective(CmsHtmlModule record) {
		return cmsHtmlModuleMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(CmsHtmlModule record) {
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
		return cmsHtmlModuleMapper.insertSelective(record);
	}
	
	

	

	
	
	

	
	@Override
	public int updateByExampleSelective(CmsHtmlModule record, CmsHtmlModuleExample example) {
		
		return cmsHtmlModuleMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(CmsHtmlModule record, CmsHtmlModuleExample example) {
		
		return cmsHtmlModuleMapper.updateByExample(record, example);
	}

	@Override
	public List<CmsHtmlModule> selectByExample(CmsHtmlModuleExample example) {
		
		return cmsHtmlModuleMapper.selectByExample(example);
	}

	public List<CmsHtmlModule> selectByExampleLanguage(CmsHtmlModuleExample example) {
		String language = LanguageUtil.getCurrentLang();
		example.setOrderByClause("order_num");
		if(StringUtils.isEmpty(language)){
			return cmsHtmlModuleMapper.selectByExampleEn(example);
		}else if("zh_CN".toLowerCase().equals(language.toLowerCase())){
            return cmsHtmlModuleMapper.selectByExampleZh(example);
		}else if("en".toLowerCase().equals(language.toLowerCase())){
            return cmsHtmlModuleMapper.selectByExampleEn(example);
        }else {
			return cmsHtmlModuleMapper.selectByExampleEn(example);
        }
	}





	public CmsHtmlModuleExample getCmsHtmlModuleExampleByCmsHtmlModule(CmsHtmlModule cmsHtmlModule) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		CmsHtmlModuleExample.Criteria criteria = example.createCriteria();
		CmsHtmlModuleExample.Criteria criteria_zh = example.createCriteria();
		CmsHtmlModuleExample.Criteria criteria_en = example.createCriteria();
		if(StringUtils.isNotEmpty(cmsHtmlModule.getCmsHtmlLinkCode())){
			criteria.andCmsHtmlLinkCodeEqualTo(cmsHtmlModule.getCmsHtmlLinkCode());
			criteria_zh.andCmsHtmlLinkCodeEqualTo(cmsHtmlModule.getCmsHtmlLinkCode());
			criteria_en.andCmsHtmlLinkCodeEqualTo(cmsHtmlModule.getCmsHtmlLinkCode());
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getCode())){
			criteria.andCodeEqualTo(cmsHtmlModule.getCode());
			criteria_zh.andCodeEqualTo(cmsHtmlModule.getCode());
			criteria_en.andCodeEqualTo(cmsHtmlModule.getCode());
		}
		if(cmsHtmlModule.getLevelNum() != null && cmsHtmlModule.getLevelNum() >-1){
			criteria.andLevelNumEqualTo(cmsHtmlModule.getLevelNum());
			criteria_zh.andLevelNumEqualTo(cmsHtmlModule.getLevelNum());
			criteria_en.andLevelNumEqualTo(cmsHtmlModule.getLevelNum());
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getParentCode())){
			criteria.andParentCodeEqualTo(cmsHtmlModule.getParentCode());
			criteria_zh.andParentCodeEqualTo(cmsHtmlModule.getParentCode());
			criteria_en.andParentCodeEqualTo(cmsHtmlModule.getParentCode());

		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getTitle())){
			criteria.andTitleEqualTo(cmsHtmlModule.getTitle());
			criteria_zh.andTitleZhEqualTo(cmsHtmlModule.getTitle());
			criteria_en.andTitleEnEqualTo(cmsHtmlModule.getTitle());
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getDescri())){
			criteria.andDescriEqualTo(cmsHtmlModule.getDescri());
			criteria_zh.andDescriZhEqualTo(cmsHtmlModule.getDescri());
			criteria_en.andDescriEnEqualTo(cmsHtmlModule.getDescri());
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getMore())){
			criteria.andMoreEqualTo(cmsHtmlModule.getMore());
			criteria_zh.andMoreZhEqualTo(cmsHtmlModule.getMore());
			criteria_en.andMoreEnEqualTo(cmsHtmlModule.getMore());
		}
		example.or(criteria);
		example.or(criteria_zh);
		example.or(criteria_en);
		example.setOrderByClause("order_num");
		return example;
	}



	public CmsHtmlModuleExample getCmsHtmlModuleExampleByCmsHtmlModuleLike(CmsHtmlModule cmsHtmlModule) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		CmsHtmlModuleExample.Criteria criteria = example.createCriteria();
		CmsHtmlModuleExample.Criteria criteria_zh = example.createCriteria();
		CmsHtmlModuleExample.Criteria criteria_en = example.createCriteria();
		if(StringUtils.isNotEmpty(cmsHtmlModule.getCmsHtmlLinkCode())){
			criteria.andCmsHtmlLinkCodeEqualTo(cmsHtmlModule.getCmsHtmlLinkCode());
			criteria_zh.andCmsHtmlLinkCodeEqualTo(cmsHtmlModule.getCmsHtmlLinkCode());
			criteria_en.andCmsHtmlLinkCodeEqualTo(cmsHtmlModule.getCmsHtmlLinkCode());
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getCode())){
			criteria.andCodeEqualTo(cmsHtmlModule.getCode());
			criteria_zh.andCodeEqualTo(cmsHtmlModule.getCode());
			criteria_en.andCodeEqualTo(cmsHtmlModule.getCode());
		}
		if(cmsHtmlModule.getLevelNum() != null && cmsHtmlModule.getLevelNum() >-1){
			criteria.andLevelNumEqualTo(cmsHtmlModule.getLevelNum());
			criteria_zh.andLevelNumEqualTo(cmsHtmlModule.getLevelNum());
			criteria_en.andLevelNumEqualTo(cmsHtmlModule.getLevelNum());
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getParentCode())){
			criteria.andParentCodeEqualTo(cmsHtmlModule.getParentCode());
			criteria_zh.andParentCodeEqualTo(cmsHtmlModule.getParentCode());
			criteria_en.andParentCodeEqualTo(cmsHtmlModule.getParentCode());

		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getTitle())){
			criteria.andTitleLike("%"+cmsHtmlModule.getTitle()+"%");
			criteria_zh.andTitleZhLike("%"+cmsHtmlModule.getTitle()+"%");
			criteria_en.andTitleEnLike("%"+cmsHtmlModule.getTitle()+"%");
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getDescri())){
			criteria.andDescriLike("%"+cmsHtmlModule.getDescri()+"%");
			criteria_zh.andDescriZhLike("%"+cmsHtmlModule.getDescri()+"%");
			criteria_en.andDescriEnLike("%"+cmsHtmlModule.getDescri()+"%");
		}
		if(StringUtils.isNotEmpty(cmsHtmlModule.getMore())){
			criteria.andMoreLike("%"+cmsHtmlModule.getMore()+"%");
			criteria_zh.andMoreZhLike("%"+cmsHtmlModule.getMore()+"%");
			criteria_en.andMoreEnLike("%"+cmsHtmlModule.getMore()+"%");
		}
		example.or(criteria);
		example.or(criteria_zh);
		example.or(criteria_en);
		example.setOrderByClause("order_num");
		return example;
	}


	@Override
	public long countByExample(CmsHtmlModuleExample example) {
		
		return cmsHtmlModuleMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(CmsHtmlModuleExample example) {
		
		return cmsHtmlModuleMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param CmsHtmlModule
	 * @return
	 */
	public int checkNameUnique(CmsHtmlModule cmsHtmlModule){
		CmsHtmlModuleExample example=new CmsHtmlModuleExample();
		example.createCriteria().andCodeEqualTo(cmsHtmlModule.getCode());
		List<CmsHtmlModule> list=cmsHtmlModuleMapper.selectByExample(example);
		return list.size();
	}


}
