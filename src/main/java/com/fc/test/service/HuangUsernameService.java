package com.fc.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.HuangUsernameMapper;
import com.fc.test.model.auto.HuangUsername;
import com.fc.test.model.auto.HuangUsernameExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 * Service
* @Title: HuangUsernameService.java 
* @Package com.fc.test.service 
* @author fuce
* @email 87766867@qq.com
* @date 2019-07-29 18:25:25  
 */
@Service
public class HuangUsernameService implements BaseService<HuangUsername, HuangUsernameExample>{
	@Autowired
	private HuangUsernameMapper huangUsernameMapper;
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<HuangUsername> list(Tablepar tablepar,String name){
	        HuangUsernameExample testExample=new HuangUsernameExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andUserNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<HuangUsername> list= huangUsernameMapper.selectByExample(testExample);
	        PageInfo<HuangUsername> pageInfo = new PageInfo<HuangUsername>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		List<String> lista=Convert.toListStrArray(ids);
		HuangUsernameExample example=new HuangUsernameExample();
		example.createCriteria().andIdIn(lista);
		return huangUsernameMapper.deleteByExample(example);
	}
	
	
	@Override
	public HuangUsername selectByPrimaryKey(String id) {
		
		return huangUsernameMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public int updateByPrimaryKeySelective(HuangUsername record) {
		return huangUsernameMapper.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(HuangUsername record) {
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
		return huangUsernameMapper.insertSelective(record);
	}
	
	

	

	
	
	

	
	@Override
	public int updateByExampleSelective(HuangUsername record, HuangUsernameExample example) {
		
		return huangUsernameMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(HuangUsername record, HuangUsernameExample example) {
		
		return huangUsernameMapper.updateByExample(record, example);
	}

	@Override
	public List<HuangUsername> selectByExample(HuangUsernameExample example) {
		
		return huangUsernameMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(HuangUsernameExample example) {
		
		return huangUsernameMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(HuangUsernameExample example) {
		
		return huangUsernameMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param HuangUsername
	 * @return
	 */
	public int checkNameUnique(HuangUsername huangUsername){
		HuangUsernameExample example=new HuangUsernameExample();
		example.createCriteria().andUserNameEqualTo(huangUsername.getUserName());
		List<HuangUsername> list=huangUsernameMapper.selectByExample(example);
		return list.size();
	}


}
