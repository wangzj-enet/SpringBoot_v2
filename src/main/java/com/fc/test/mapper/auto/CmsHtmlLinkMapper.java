package com.fc.test.mapper.auto;

import com.fc.test.model.auto.CmsHtmlLink;
import com.fc.test.model.auto.CmsHtmlLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 页面链接
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 12:13:35
 */
public interface CmsHtmlLinkMapper {
    long countByExample(CmsHtmlLinkExample example);

    int deleteByExample(CmsHtmlLinkExample example);
		
    int deleteByPrimaryKey(String id);
		
    int insert(CmsHtmlLink record);

    int insertSelective(CmsHtmlLink record);

    List<CmsHtmlLink> selectByExample(CmsHtmlLinkExample example);
		
    CmsHtmlLink selectByPrimaryKey(String id);
		
    int updateByExampleSelective(@Param("record") CmsHtmlLink record, @Param("example") CmsHtmlLinkExample example);

    int updateByExample(@Param("record") CmsHtmlLink record, @Param("example") CmsHtmlLinkExample example); 
		
    int updateByPrimaryKeySelective(CmsHtmlLink record);

    int updateByPrimaryKey(CmsHtmlLink record);
  	  	
}