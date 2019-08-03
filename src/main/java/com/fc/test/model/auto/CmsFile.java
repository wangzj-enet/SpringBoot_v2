package com.fc.test.model.auto;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 文件存储
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 12:16:52
 */
public class CmsFile implements Serializable {

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
	 * 文件名称
	 */
		private String fileName;
		
	/**
	 * 图片地址
	 */
		private String adress;
		
	/**
	 * 操作时间
	 */
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
		private Date operTime;
	
	
			
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
			
				
		public String getFileName() {
	        return fileName;
	    }
	
	    public void setFileName(String fileName){
	        this.fileName = fileName == null ? null : fileName.trim();
	    }
			
				
		public String getAdress() {
	        return adress;
	    }
	
	    public void setAdress(String adress){
	        this.adress = adress == null ? null : adress.trim();
	    }
			
			
		public Date getOperTime () {
	        return operTime;
	    }
	
	    public void setOperTime (Date operTime) {
	        this.operTime = operTime;
	    }
	 
			
}