package com.fc.test.model.auto;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 页面链接
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 12:13:35
 */
public class CmsHtmlLink implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**
	 * 
	 */
		private String id;
		
	/**
	 * 编码
	 */
		private String code;
		
	/**
	 * 页面链接地址
	 */
		private String htmlUrl;
		
	/**
	 * 链接显示内容
	 */
		private String title;
		
	/**
	 * 链接显示内容中文
	 */
		private String titleZh;
		
	/**
	 * 链接显示内容英文
	 */
		private String titleEn;
		
	/**
	 * 链接打开方式
	 */
		private String target;
	
	
			
		public String getId() {
	        return id;
	    }
	
	    public void setId(String id){
	        this.id = id == null ? null : id.trim();
	    }
			
				
		public String getCode() {
	        return code;
	    }
	
	    public void setCode(String code){
	        this.code = code == null ? null : code.trim();
	    }
			
				
		public String getHtmlUrl() {
	        return htmlUrl;
	    }
	
	    public void setHtmlUrl(String htmlUrl){
	        this.htmlUrl = htmlUrl == null ? null : htmlUrl.trim();
	    }
			
				
		public String getTitle() {
	        return title;
	    }
	
	    public void setTitle(String title){
	        this.title = title == null ? null : title.trim();
	    }
			
				
		public String getTitleZh() {
	        return titleZh;
	    }
	
	    public void setTitleZh(String titleZh){
	        this.titleZh = titleZh == null ? null : titleZh.trim();
	    }
			
				
		public String getTitleEn() {
	        return titleEn;
	    }
	
	    public void setTitleEn(String titleEn){
	        this.titleEn = titleEn == null ? null : titleEn.trim();
	    }
			
				
		public String getTarget() {
	        return target;
	    }
	
	    public void setTarget(String target){
	        this.target = target == null ? null : target.trim();
	    }
			
			
}