package com.fc.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.CmsHtmlLinkMapper;
import com.fc.test.model.auto.CmsHtmlLink;
import com.fc.test.model.auto.CmsHtmlLinkExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 页面链接Service
* @Title: CmsHtmlLinkService.java 
* @Package com.fc.test.service 
* @author fuce
* @email 87766867@qq.com
* @date 2019-07-11 12:13:35  
 */
@Service
public class CmsHtmlLinkService implements BaseService<CmsHtmlLink, CmsHtmlLinkExample>{
	@Autowired
	private CmsHtmlLinkMapper cmsHtmlLinkMapper;
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<CmsHtmlLink> list(Tablepar tablepar,String name){
	        CmsHtmlLinkExample testExample=new CmsHtmlLinkExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
				testExample.createCriteria().andCodeLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<CmsHtmlLink> list= cmsHtmlLinkMapper.selectByExample(testExample);
	        PageInfo<CmsHtmlLink> pageInfo = new PageInfo<CmsHtmlLink>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		List<String> lista=Convert.toListStrArray(ids);
		CmsHtmlLinkExample example=new CmsHtmlLinkExample();
		example.createCriteria().andIdIn(lista);
		return cmsHtmlLinkMapper.deleteByExample(example);
	}
	
	
	@Override
	public CmsHtmlLink selectByPrimaryKey(String id) {
		
		return cmsHtmlLinkMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public int updateByPrimaryKeySelective(CmsHtmlLink record) {
		return cmsHtmlLinkMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(CmsHtmlLink record) {
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
		return cmsHtmlLinkMapper.insertSelective(record);
	}
	
	

	

	
	
	

	
	@Override
	public int updateByExampleSelective(CmsHtmlLink record, CmsHtmlLinkExample example) {
		
		return cmsHtmlLinkMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(CmsHtmlLink record, CmsHtmlLinkExample example) {
		
		return cmsHtmlLinkMapper.updateByExample(record, example);
	}

	@Override
	public List<CmsHtmlLink> selectByExample(CmsHtmlLinkExample example) {
		
		return cmsHtmlLinkMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(CmsHtmlLinkExample example) {
		
		return cmsHtmlLinkMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(CmsHtmlLinkExample example) {
		
		return cmsHtmlLinkMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param CmsHtmlLink
	 * @return
	 */
	public int checkNameUnique(CmsHtmlLink cmsHtmlLink){
		CmsHtmlLinkExample example=new CmsHtmlLinkExample();
		example.createCriteria().andCodeEqualTo(cmsHtmlLink.getCode());
		List<CmsHtmlLink> list=cmsHtmlLinkMapper.selectByExample(example);
		return list.size();
	}


}
