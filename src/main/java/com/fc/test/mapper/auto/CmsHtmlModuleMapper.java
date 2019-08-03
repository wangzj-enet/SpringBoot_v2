package com.fc.test.mapper.auto;

import com.fc.test.model.auto.CmsHtmlModule;
import com.fc.test.model.auto.CmsHtmlModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 页面模块
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 13:02:38
 */
public interface CmsHtmlModuleMapper {
    long countByExample(CmsHtmlModuleExample example);

    int deleteByExample(CmsHtmlModuleExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(CmsHtmlModule record);

    int insertSelective(CmsHtmlModule record);

    List<CmsHtmlModule> selectByExample(CmsHtmlModuleExample example);
    List<CmsHtmlModule> selectByExampleEn(CmsHtmlModuleExample example);
    List<CmsHtmlModule> selectByExampleZh(CmsHtmlModuleExample example);
		
    CmsHtmlModule selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") CmsHtmlModule record, @Param("example") CmsHtmlModuleExample example);

    int updateByExample(@Param("record") CmsHtmlModule record, @Param("example") CmsHtmlModuleExample example); 
		
    int updateByPrimaryKeySelective(CmsHtmlModule record);

    int updateByPrimaryKey(CmsHtmlModule record);
  	  	
}