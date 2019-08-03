package com.fc.test.model.auto;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-29 18:25:25
 */
public class HuangUsername implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**
	 * 
	 */
		private String id;
		
	/**
	 * 用户名
	 */
		private String userName;
		
	/**
	 * 用户时常
	 */
		private String timeLong;
		
	/**
	 * 开始时间
	 */
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
		private Date startTime;
		
	/**
	 * 结束时间
	 */
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
		private Date endTime;
		
	/**
	 * 是否禁用，0正常启用，1禁用，2其他
	 */
		private String status;
	
	
			
		public String getId() {
	        return id;
	    }
	
	    public void setId(String id){
	        this.id = id == null ? null : id.trim();
	    }
			
				
		public String getUserName() {
	        return userName;
	    }
	
	    public void setUserName(String userName){
	        this.userName = userName == null ? null : userName.trim();
	    }
			
				
		public String getTimeLong() {
	        return timeLong;
	    }
	
	    public void setTimeLong(String timeLong){
	        this.timeLong = timeLong == null ? null : timeLong.trim();
	    }
			
			
		public Date getStartTime () {
	        return startTime;
	    }
	
	    public void setStartTime (Date startTime) {
	        this.startTime = startTime;
	    }
	 
			
		public Date getEndTime () {
	        return endTime;
	    }
	
	    public void setEndTime (Date endTime) {
	        this.endTime = endTime;
	    }
	 
				
		public String getStatus() {
	        return status;
	    }
	
	    public void setStatus(String status){
	        this.status = status == null ? null : status.trim();
	    }
			
			
}