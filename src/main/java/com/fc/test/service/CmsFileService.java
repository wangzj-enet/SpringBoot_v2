package com.fc.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.CmsFileMapper;
import com.fc.test.model.auto.CmsFile;
import com.fc.test.model.auto.CmsFileExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * 文件存储Service
* @Title: CmsFileService.java 
* @Package com.fc.test.service 
* @author fuce
* @email 87766867@qq.com
* @date 2019-07-11 12:16:52  
 */
@Service
public class CmsFileService implements BaseService<CmsFile, CmsFileExample>{
	@Autowired
	private CmsFileMapper cmsFileMapper;
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<CmsFile> list(Tablepar tablepar,String name){
	        CmsFileExample testExample=new CmsFileExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andFileNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<CmsFile> list= cmsFileMapper.selectByExample(testExample);
	        PageInfo<CmsFile> pageInfo = new PageInfo<CmsFile>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		List<String> lista=Convert.toListStrArray(ids);
		CmsFileExample example=new CmsFileExample();
		example.createCriteria().andIdIn(lista);
		return cmsFileMapper.deleteByExample(example);
	}
	
	
	@Override
	public CmsFile selectByPrimaryKey(String id) {
		
		return cmsFileMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public int updateByPrimaryKeySelective(CmsFile record) {
		return cmsFileMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(CmsFile record) {
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
		return cmsFileMapper.insertSelective(record);
	}
	
	

	

	
	
	

	
	@Override
	public int updateByExampleSelective(CmsFile record, CmsFileExample example) {
		
		return cmsFileMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(CmsFile record, CmsFileExample example) {
		
		return cmsFileMapper.updateByExample(record, example);
	}

	@Override
	public List<CmsFile> selectByExample(CmsFileExample example) {
		
		return cmsFileMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(CmsFileExample example) {
		
		return cmsFileMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(CmsFileExample example) {
		
		return cmsFileMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param CmsFile
	 * @return
	 */
	public int checkNameUnique(CmsFile cmsFile){
		CmsFileExample example=new CmsFileExample();
		example.createCriteria().andFileNameEqualTo(cmsFile.getFileName());
		List<CmsFile> list=cmsFileMapper.selectByExample(example);
		return list.size();
	}


}
