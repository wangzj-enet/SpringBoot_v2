package com.fc.test.mapper.auto;

import com.fc.test.model.auto.CmsFile;
import com.fc.test.model.auto.CmsFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 文件存储
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 12:16:52
 */
public interface CmsFileMapper {
    long countByExample(CmsFileExample example);

    int deleteByExample(CmsFileExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(CmsFile record);

    int insertSelective(CmsFile record);

    List<CmsFile> selectByExample(CmsFileExample example);
		
    CmsFile selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") CmsFile record, @Param("example") CmsFileExample example);

    int updateByExample(@Param("record") CmsFile record, @Param("example") CmsFileExample example); 
		
    int updateByPrimaryKeySelective(CmsFile record);

    int updateByPrimaryKey(CmsFile record);
  	  	
}