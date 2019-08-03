package com.fc.test.model.auto;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 页面模块
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 13:02:38
 */
public class CmsHtmlModule implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**
	 * 
	 */
		private String id;
		
	/**
	 * 页面链接编码
	 */
		private String cmsHtmlLinkCode;
		
	/**
	 * 编码
	 */
		private String code;
		
	/**
	 * 父编码
	 */
		private String parentCode;
		
	/**
	 * 图片显示
	 */
		private String cmsFileCode;
		
	/**
	 * 标题显示内容
	 */
		private String title;
		
	/**
	 * 标题显示内容中文
	 */
		private String titleZh;
		
	/**
	 * 标题显示内容英文
	 */
		private String titleEn;
		
	/**
	 * 描述显示内容
	 */
		private String descri;
		
	/**
	 * 描述显示内容中文
	 */
		private String descriZh;
		
	/**
	 * 描述显示内容英文
	 */
		private String descriEn;
		
	/**
	 * 更多显示内容
	 */
		private String more;
		
	/**
	 * 更多显示内容中文
	 */
		private String moreZh;
		
	/**
	 * 更多显示内容英文
	 */
		private String moreEn;
		
	/**
	 * 图片链接地址
	 */
		private String imgHtmlUrl;
		
	/**
	 * 图片链接打开方式
	 */
		private String imgTarget;
		
	/**
	 * 标题链接地址
	 */
		private String titleHtmlUrl;
		
	/**
	 * 标题链接打开方式
	 */
		private String titleTarget;
		
	/**
	 * 描述链接地址
	 */
		private String descriHtmlUrl;
		
	/**
	 * 描述链接打开方式
	 */
		private String descriTarget;
		
	/**
	 * 更多链接地址
	 */
		private String moreHtmlUrl;
		
	/**
	 * 更多链接打开方式
	 */
		private String moreTarget;
		
	/**
	 * 描述内容分割
	 */
		private String descriSplitTxt;
		
	/**
	 * 分割前缀
	 */
		private String beforeSplitTxt;
		
	/**
	 * 分割后缀
	 */
		private String afterSplitTxt;
		
	/**
	 * 顺序
	 */
		private Integer orderNum;
		
	/**
	 * 层级
	 */
		private Integer levelNum;
	
	
			
		public String getId() {
	        return id;
	    }
	
	    public void setId(String id){
	        this.id = id == null ? null : id.trim();
	    }
			
				
		public String getCmsHtmlLinkCode() {
	        return cmsHtmlLinkCode;
	    }
	
	    public void setCmsHtmlLinkCode(String cmsHtmlLinkCode){
	        this.cmsHtmlLinkCode = cmsHtmlLinkCode == null ? null : cmsHtmlLinkCode.trim();
	    }
			
				
		public String getCode() {
	        return code;
	    }
	
	    public void setCode(String code){
	        this.code = code == null ? null : code.trim();
	    }
			
				
		public String getParentCode() {
	        return parentCode;
	    }
	
	    public void setParentCode(String parentCode){
	        this.parentCode = parentCode == null ? null : parentCode.trim();
	    }
			
				
		public String getCmsFileCode() {
	        return cmsFileCode;
	    }
	
	    public void setCmsFileCode(String cmsFileCode){
	        this.cmsFileCode = cmsFileCode == null ? null : cmsFileCode.trim();
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
			
				
		public String getDescri() {
	        return descri;
	    }
	
	    public void setDescri(String descri){
	        this.descri = descri == null ? null : descri.trim();
	    }
			
				
		public String getDescriZh() {
	        return descriZh;
	    }
	
	    public void setDescriZh(String descriZh){
	        this.descriZh = descriZh == null ? null : descriZh.trim();
	    }
			
				
		public String getDescriEn() {
	        return descriEn;
	    }
	
	    public void setDescriEn(String descriEn){
	        this.descriEn = descriEn == null ? null : descriEn.trim();
	    }
			
				
		public String getMore() {
	        return more;
	    }
	
	    public void setMore(String more){
	        this.more = more == null ? null : more.trim();
	    }
			
				
		public String getMoreZh() {
	        return moreZh;
	    }
	
	    public void setMoreZh(String moreZh){
	        this.moreZh = moreZh == null ? null : moreZh.trim();
	    }
			
				
		public String getMoreEn() {
	        return moreEn;
	    }
	
	    public void setMoreEn(String moreEn){
	        this.moreEn = moreEn == null ? null : moreEn.trim();
	    }
			
				
		public String getImgHtmlUrl() {
	        return imgHtmlUrl;
	    }
	
	    public void setImgHtmlUrl(String imgHtmlUrl){
	        this.imgHtmlUrl = imgHtmlUrl == null ? null : imgHtmlUrl.trim();
	    }
			
				
		public String getImgTarget() {
	        return imgTarget;
	    }
	
	    public void setImgTarget(String imgTarget){
	        this.imgTarget = imgTarget == null ? null : imgTarget.trim();
	    }
			
				
		public String getTitleHtmlUrl() {
	        return titleHtmlUrl;
	    }
	
	    public void setTitleHtmlUrl(String titleHtmlUrl){
	        this.titleHtmlUrl = titleHtmlUrl == null ? null : titleHtmlUrl.trim();
	    }
			
				
		public String getTitleTarget() {
	        return titleTarget;
	    }
	
	    public void setTitleTarget(String titleTarget){
	        this.titleTarget = titleTarget == null ? null : titleTarget.trim();
	    }
			
				
		public String getDescriHtmlUrl() {
	        return descriHtmlUrl;
	    }
	
	    public void setDescriHtmlUrl(String descriHtmlUrl){
	        this.descriHtmlUrl = descriHtmlUrl == null ? null : descriHtmlUrl.trim();
	    }
			
				
		public String getDescriTarget() {
	        return descriTarget;
	    }
	
	    public void setDescriTarget(String descriTarget){
	        this.descriTarget = descriTarget == null ? null : descriTarget.trim();
	    }
			
				
		public String getMoreHtmlUrl() {
	        return moreHtmlUrl;
	    }
	
	    public void setMoreHtmlUrl(String moreHtmlUrl){
	        this.moreHtmlUrl = moreHtmlUrl == null ? null : moreHtmlUrl.trim();
	    }
			
				
		public String getMoreTarget() {
	        return moreTarget;
	    }
	
	    public void setMoreTarget(String moreTarget){
	        this.moreTarget = moreTarget == null ? null : moreTarget.trim();
	    }
			
				
		public String getDescriSplitTxt() {
	        return descriSplitTxt;
	    }
	
	    public void setDescriSplitTxt(String descriSplitTxt){
	        this.descriSplitTxt = descriSplitTxt == null ? null : descriSplitTxt.trim();
	    }
			
				
		public String getBeforeSplitTxt() {
	        return beforeSplitTxt;
	    }
	
	    public void setBeforeSplitTxt(String beforeSplitTxt){
	        this.beforeSplitTxt = beforeSplitTxt == null ? null : beforeSplitTxt.trim();
	    }
			
				
		public String getAfterSplitTxt() {
	        return afterSplitTxt;
	    }
	
	    public void setAfterSplitTxt(String afterSplitTxt){
	        this.afterSplitTxt = afterSplitTxt == null ? null : afterSplitTxt.trim();
	    }
			
			
		public Integer getOrderNum () {
	        return orderNum;
	    }
	
	    public void setOrderNum (Integer orderNum) {
	        this.orderNum = orderNum;
	    }
	 
			
		public Integer getLevelNum () {
	        return levelNum;
	    }
	
	    public void setLevelNum (Integer levelNum) {
	        this.levelNum = levelNum;
	    }
	 
			
}