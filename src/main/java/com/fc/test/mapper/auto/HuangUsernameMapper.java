package com.fc.test.mapper.auto;

import com.fc.test.model.auto.HuangUsername;
import com.fc.test.model.auto.HuangUsernameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-29 18:25:25
 */
public interface HuangUsernameMapper {
    long countByExample(HuangUsernameExample example);

    int deleteByExample(HuangUsernameExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(HuangUsername record);

    int insertSelective(HuangUsername record);

    List<HuangUsername> selectByExample(HuangUsernameExample example);
		
    HuangUsername selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") HuangUsername record, @Param("example") HuangUsernameExample example);

    int updateByExample(@Param("record") HuangUsername record, @Param("example") HuangUsernameExample example); 
		
    int updateByPrimaryKeySelective(HuangUsername record);

    int updateByPrimaryKey(HuangUsername record);
  	  	
}