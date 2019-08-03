package com.fc.test.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 页面模块
 * 
 * @author fuce
 * @email 87766867@qq.com
 * @date 2019-07-11 13:02:38
 */
public class CmsHtmlModuleExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsHtmlModuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
				
        public Criteria andIdIsNull() {
            addCriterion("id  is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id  is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id  =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id  <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id  >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id  >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id  <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id  <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id  not  like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id   in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id  not   in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id  between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id  not  between", value1, value2, "id");
            return (Criteria) this;
        }
        
        		
        public Criteria andCmsHtmlLinkCodeIsNull() {
            addCriterion("cms_html_link_code  is null");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeIsNotNull() {
            addCriterion("cms_html_link_code  is not null");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeEqualTo(String value) {
            addCriterion("cms_html_link_code  =", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeNotEqualTo(String value) {
            addCriterion("cms_html_link_code  <>", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeGreaterThan(String value) {
            addCriterion("cms_html_link_code  >", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cms_html_link_code  >=", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeLessThan(String value) {
            addCriterion("cms_html_link_code  <", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeLessThanOrEqualTo(String value) {
            addCriterion("cms_html_link_code <=", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeLike(String value) {
            addCriterion("cms_html_link_code like", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeNotLike(String value) {
            addCriterion("cms_html_link_code not  like", value, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeIn(List<String> values) {
            addCriterion("cms_html_link_code  in", values, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeNotIn(List<String> values) {
            addCriterion("cms_html_link_code not   in", values, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeBetween(String value1, String value2) {
            addCriterion("cms_html_link_code between", value1, value2, "cmsHtmlLinkCode");
            return (Criteria) this;
        }

        public Criteria andCmsHtmlLinkCodeNotBetween(String value1, String value2) {
            addCriterion("cms_html_link_code not  between", value1, value2, "cmsHtmlLinkCode");
            return (Criteria) this;
        }
        
        		
        public Criteria andCodeIsNull() {
            addCriterion("code  is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code  is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code  =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code  <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code  >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code  >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code  <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code  <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code  like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code  not  like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code   in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code  not   in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code  between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code  not  between", value1, value2, "code");
            return (Criteria) this;
        }
        
        		
        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not  like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code  in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not   in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not  between", value1, value2, "parentCode");
            return (Criteria) this;
        }
        
        		
        public Criteria andCmsFileCodeIsNull() {
            addCriterion("cms_file_code is null");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeIsNotNull() {
            addCriterion("cms_file_code is not null");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeEqualTo(String value) {
            addCriterion("cms_file_code =", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeNotEqualTo(String value) {
            addCriterion("cms_file_code <>", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeGreaterThan(String value) {
            addCriterion("cms_file_code >", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cms_file_code >=", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeLessThan(String value) {
            addCriterion("cms_file_code <", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeLessThanOrEqualTo(String value) {
            addCriterion("cms_file_code <=", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeLike(String value) {
            addCriterion("cms_file_code like", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeNotLike(String value) {
            addCriterion("cms_file_code not  like", value, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeIn(List<String> values) {
            addCriterion("cms_file_code  in", values, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeNotIn(List<String> values) {
            addCriterion("cms_file_code not   in", values, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeBetween(String value1, String value2) {
            addCriterion("cms_file_code between", value1, value2, "cmsFileCode");
            return (Criteria) this;
        }

        public Criteria andCmsFileCodeNotBetween(String value1, String value2) {
            addCriterion("cms_file_code not  between", value1, value2, "cmsFileCode");
            return (Criteria) this;
        }
        
        		
        public Criteria andTitleIsNull() {
            addCriterion("title  is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title  is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title  =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title  <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title  >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title  >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title  <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title  <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title  like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title  not  like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title   in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title  not   in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title  between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title  not  between", value1, value2, "title");
            return (Criteria) this;
        }
        
        		
        public Criteria andTitleZhIsNull() {
            addCriterion("title_zh is null");
            return (Criteria) this;
        }

        public Criteria andTitleZhIsNotNull() {
            addCriterion("title_zh is not null");
            return (Criteria) this;
        }

        public Criteria andTitleZhEqualTo(String value) {
            addCriterion("title_zh =", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotEqualTo(String value) {
            addCriterion("title_zh <>", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhGreaterThan(String value) {
            addCriterion("title_zh >", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhGreaterThanOrEqualTo(String value) {
            addCriterion("title_zh >=", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhLessThan(String value) {
            addCriterion("title_zh <", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhLessThanOrEqualTo(String value) {
            addCriterion("title_zh <=", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhLike(String value) {
            addCriterion("title_zh like", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotLike(String value) {
            addCriterion("title_zh not  like", value, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhIn(List<String> values) {
            addCriterion("title_zh  in", values, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotIn(List<String> values) {
            addCriterion("title_zh not   in", values, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhBetween(String value1, String value2) {
            addCriterion("title_zh between", value1, value2, "titleZh");
            return (Criteria) this;
        }

        public Criteria andTitleZhNotBetween(String value1, String value2) {
            addCriterion("title_zh not  between", value1, value2, "titleZh");
            return (Criteria) this;
        }
        
        		
        public Criteria andTitleEnIsNull() {
            addCriterion("title_en  is null");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNotNull() {
            addCriterion("title_en  is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEnEqualTo(String value) {
            addCriterion("title_en  =", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotEqualTo(String value) {
            addCriterion("title_en  <>", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThan(String value) {
            addCriterion("title_en  >", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("title_en  >=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThan(String value) {
            addCriterion("title_en  <", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThanOrEqualTo(String value) {
            addCriterion("title_en  <=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLike(String value) {
            addCriterion("title_en  like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotLike(String value) {
            addCriterion("title_en  not  like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnIn(List<String> values) {
            addCriterion("title_en   in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotIn(List<String> values) {
            addCriterion("title_en  not   in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnBetween(String value1, String value2) {
            addCriterion("title_en  between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotBetween(String value1, String value2) {
            addCriterion("title_en  not  between", value1, value2, "titleEn");
            return (Criteria) this;
        }
        
        		
        public Criteria andDescriIsNull() {
            addCriterion("descri  is null");
            return (Criteria) this;
        }

        public Criteria andDescriIsNotNull() {
            addCriterion("descri  is not null");
            return (Criteria) this;
        }

        public Criteria andDescriEqualTo(String value) {
            addCriterion("descri  =", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriNotEqualTo(String value) {
            addCriterion("descri  <>", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriGreaterThan(String value) {
            addCriterion("descri  >", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriGreaterThanOrEqualTo(String value) {
            addCriterion("descri  >=", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriLessThan(String value) {
            addCriterion("descri  <", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriLessThanOrEqualTo(String value) {
            addCriterion("descri  <=", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriLike(String value) {
            addCriterion("descri  like", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriNotLike(String value) {
            addCriterion("descri  not  like", value, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriIn(List<String> values) {
            addCriterion("descri  in", values, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriNotIn(List<String> values) {
            addCriterion("descri not  in", values, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriBetween(String value1, String value2) {
            addCriterion("descri  between", value1, value2, "descri");
            return (Criteria) this;
        }

        public Criteria andDescriNotBetween(String value1, String value2) {
            addCriterion("descri  not  between", value1, value2, "descri");
            return (Criteria) this;
        }
        
        		
        public Criteria andDescriZhIsNull() {
            addCriterion("descri_zh  is null");
            return (Criteria) this;
        }

        public Criteria andDescriZhIsNotNull() {
            addCriterion("descri_zh  is not null");
            return (Criteria) this;
        }

        public Criteria andDescriZhEqualTo(String value) {
            addCriterion("descri_zh  =", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhNotEqualTo(String value) {
            addCriterion("descri_zh  <>", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhGreaterThan(String value) {
            addCriterion("descri_zh  >", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhGreaterThanOrEqualTo(String value) {
            addCriterion("descri_zh  >=", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhLessThan(String value) {
            addCriterion("descri_zh  <", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhLessThanOrEqualTo(String value) {
            addCriterion("descri_zh  <=", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhLike(String value) {
            addCriterion("descri_zh  like", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhNotLike(String value) {
            addCriterion("descri_zh  not  like", value, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhIn(List<String> values) {
            addCriterion("descri_zh  in", values, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhNotIn(List<String> values) {
            addCriterion("descri_zh not  in", values, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhBetween(String value1, String value2) {
            addCriterion("descri_zh  between", value1, value2, "descriZh");
            return (Criteria) this;
        }

        public Criteria andDescriZhNotBetween(String value1, String value2) {
            addCriterion("descri_zh  not  between", value1, value2, "descriZh");
            return (Criteria) this;
        }
        
        		
        public Criteria andDescriEnIsNull() {
            addCriterion("descri_en  is null");
            return (Criteria) this;
        }

        public Criteria andDescriEnIsNotNull() {
            addCriterion("descri_en  is not null");
            return (Criteria) this;
        }

        public Criteria andDescriEnEqualTo(String value) {
            addCriterion("descri_en  =", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnNotEqualTo(String value) {
            addCriterion("descri_en  <>", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnGreaterThan(String value) {
            addCriterion("descri_en  >", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnGreaterThanOrEqualTo(String value) {
            addCriterion("descri_en  >=", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnLessThan(String value) {
            addCriterion("descri_en  <", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnLessThanOrEqualTo(String value) {
            addCriterion("descri_en  <=", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnLike(String value) {
            addCriterion("descri_en  like", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnNotLike(String value) {
            addCriterion("descri_en  not  like", value, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnIn(List<String> values) {
            addCriterion("descri_en  in", values, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnNotIn(List<String> values) {
            addCriterion("descri_en not  in", values, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnBetween(String value1, String value2) {
            addCriterion("descri_en  between", value1, value2, "descriEn");
            return (Criteria) this;
        }

        public Criteria andDescriEnNotBetween(String value1, String value2) {
            addCriterion("descri_en  not  between", value1, value2, "descriEn");
            return (Criteria) this;
        }
        
        		
        public Criteria andMoreIsNull() {
            addCriterion("more  is null");
            return (Criteria) this;
        }

        public Criteria andMoreIsNotNull() {
            addCriterion("more  is not null");
            return (Criteria) this;
        }

        public Criteria andMoreEqualTo(String value) {
            addCriterion("more  =", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotEqualTo(String value) {
            addCriterion("more  <>", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreGreaterThan(String value) {
            addCriterion("more  >", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreGreaterThanOrEqualTo(String value) {
            addCriterion("more  >=", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLessThan(String value) {
            addCriterion("more  <", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLessThanOrEqualTo(String value) {
            addCriterion("more  <=", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLike(String value) {
            addCriterion("more  like", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotLike(String value) {
            addCriterion("more  not  like", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreIn(List<String> values) {
            addCriterion("more  in", values, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotIn(List<String> values) {
            addCriterion("more not  in", values, "more");
            return (Criteria) this;
        }

        public Criteria andMoreBetween(String value1, String value2) {
            addCriterion("more  between", value1, value2, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotBetween(String value1, String value2) {
            addCriterion("more  not  between", value1, value2, "more");
            return (Criteria) this;
        }
        
        		
        public Criteria andMoreZhIsNull() {
            addCriterion("more_zh  is null");
            return (Criteria) this;
        }

        public Criteria andMoreZhIsNotNull() {
            addCriterion("more_zh  is not null");
            return (Criteria) this;
        }

        public Criteria andMoreZhEqualTo(String value) {
            addCriterion("more_zh  =", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhNotEqualTo(String value) {
            addCriterion("more_zh  <>", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhGreaterThan(String value) {
            addCriterion("more_zh  >", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhGreaterThanOrEqualTo(String value) {
            addCriterion("more_zh  >=", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhLessThan(String value) {
            addCriterion("more_zh  <", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhLessThanOrEqualTo(String value) {
            addCriterion("more_zh  <=", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhLike(String value) {
            addCriterion("more_zh  like", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhNotLike(String value) {
            addCriterion("more_zh  not  like", value, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhIn(List<String> values) {
            addCriterion("more_zh  in", values, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhNotIn(List<String> values) {
            addCriterion("more_zh not  in", values, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhBetween(String value1, String value2) {
            addCriterion("more_zh  between", value1, value2, "moreZh");
            return (Criteria) this;
        }

        public Criteria andMoreZhNotBetween(String value1, String value2) {
            addCriterion("more_zh  not  between", value1, value2, "moreZh");
            return (Criteria) this;
        }
        
        		
        public Criteria andMoreEnIsNull() {
            addCriterion("more_en  is null");
            return (Criteria) this;
        }

        public Criteria andMoreEnIsNotNull() {
            addCriterion("more_en  is not null");
            return (Criteria) this;
        }

        public Criteria andMoreEnEqualTo(String value) {
            addCriterion("more_en  =", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnNotEqualTo(String value) {
            addCriterion("more_en  <>", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnGreaterThan(String value) {
            addCriterion("more_en  >", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnGreaterThanOrEqualTo(String value) {
            addCriterion("more_en  >=", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnLessThan(String value) {
            addCriterion("more_en  <", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnLessThanOrEqualTo(String value) {
            addCriterion("more_en  <=", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnLike(String value) {
            addCriterion("more_en  like", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnNotLike(String value) {
            addCriterion("more_en  not  like", value, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnIn(List<String> values) {
            addCriterion("more_en  in", values, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnNotIn(List<String> values) {
            addCriterion("more_en not  in", values, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnBetween(String value1, String value2) {
            addCriterion("more_en  between", value1, value2, "moreEn");
            return (Criteria) this;
        }

        public Criteria andMoreEnNotBetween(String value1, String value2) {
            addCriterion("more_en  not  between", value1, value2, "moreEn");
            return (Criteria) this;
        }
        
        		
        public Criteria andImgHtmlUrlIsNull() {
            addCriterion("img_html_url  is null");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlIsNotNull() {
            addCriterion("img_html_url  is not null");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlEqualTo(String value) {
            addCriterion("img_html_url  =", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlNotEqualTo(String value) {
            addCriterion("img_html_url  <>", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlGreaterThan(String value) {
            addCriterion("img_html_url  >", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_html_url  >=", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlLessThan(String value) {
            addCriterion("img_html_url  <", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlLessThanOrEqualTo(String value) {
            addCriterion("img_html_url  <=", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlLike(String value) {
            addCriterion("img_html_url  like", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlNotLike(String value) {
            addCriterion("img_html_url  not  like", value, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlIn(List<String> values) {
            addCriterion("img_html_url  in", values, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlNotIn(List<String> values) {
            addCriterion("img_html_url not  in", values, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlBetween(String value1, String value2) {
            addCriterion("img_html_url  between", value1, value2, "imgHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andImgHtmlUrlNotBetween(String value1, String value2) {
            addCriterion("img_html_url  not  between", value1, value2, "imgHtmlUrl");
            return (Criteria) this;
        }
        
        		
        public Criteria andImgTargetIsNull() {
            addCriterion("img_target  is null");
            return (Criteria) this;
        }

        public Criteria andImgTargetIsNotNull() {
            addCriterion("img_target  is not null");
            return (Criteria) this;
        }

        public Criteria andImgTargetEqualTo(String value) {
            addCriterion("img_target  =", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetNotEqualTo(String value) {
            addCriterion("img_target  <>", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetGreaterThan(String value) {
            addCriterion("img_target  >", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetGreaterThanOrEqualTo(String value) {
            addCriterion("img_target  >=", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetLessThan(String value) {
            addCriterion("img_target  <", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetLessThanOrEqualTo(String value) {
            addCriterion("img_target  <=", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetLike(String value) {
            addCriterion("img_target  like", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetNotLike(String value) {
            addCriterion("img_target  not  like", value, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetIn(List<String> values) {
            addCriterion("img_target  in", values, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetNotIn(List<String> values) {
            addCriterion("img_target not  in", values, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetBetween(String value1, String value2) {
            addCriterion("img_target  between", value1, value2, "imgTarget");
            return (Criteria) this;
        }

        public Criteria andImgTargetNotBetween(String value1, String value2) {
            addCriterion("img_target  not  between", value1, value2, "imgTarget");
            return (Criteria) this;
        }
        
        		
        public Criteria andTitleHtmlUrlIsNull() {
            addCriterion("title_html_url  is null");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlIsNotNull() {
            addCriterion("title_html_url  is not null");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlEqualTo(String value) {
            addCriterion("title_html_url  =", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlNotEqualTo(String value) {
            addCriterion("title_html_url  <>", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlGreaterThan(String value) {
            addCriterion("title_html_url  >", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("title_html_url  >=", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlLessThan(String value) {
            addCriterion("title_html_url  <", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlLessThanOrEqualTo(String value) {
            addCriterion("title_html_url  <=", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlLike(String value) {
            addCriterion("title_html_url  like", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlNotLike(String value) {
            addCriterion("title_html_url  not  like", value, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlIn(List<String> values) {
            addCriterion("title_html_url  in", values, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlNotIn(List<String> values) {
            addCriterion("title_html_url not  in", values, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlBetween(String value1, String value2) {
            addCriterion("title_html_url  between", value1, value2, "titleHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andTitleHtmlUrlNotBetween(String value1, String value2) {
            addCriterion("title_html_url  not  between", value1, value2, "titleHtmlUrl");
            return (Criteria) this;
        }
        
        		
        public Criteria andTitleTargetIsNull() {
            addCriterion("title_target  is null");
            return (Criteria) this;
        }

        public Criteria andTitleTargetIsNotNull() {
            addCriterion("title_target  is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTargetEqualTo(String value) {
            addCriterion("title_target  =", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetNotEqualTo(String value) {
            addCriterion("title_target  <>", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetGreaterThan(String value) {
            addCriterion("title_target  >", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetGreaterThanOrEqualTo(String value) {
            addCriterion("title_target  >=", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetLessThan(String value) {
            addCriterion("title_target  <", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetLessThanOrEqualTo(String value) {
            addCriterion("title_target  <=", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetLike(String value) {
            addCriterion("title_target  like", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetNotLike(String value) {
            addCriterion("title_target  not  like", value, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetIn(List<String> values) {
            addCriterion("title_target  in", values, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetNotIn(List<String> values) {
            addCriterion("title_target not  in", values, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetBetween(String value1, String value2) {
            addCriterion("title_target  between", value1, value2, "titleTarget");
            return (Criteria) this;
        }

        public Criteria andTitleTargetNotBetween(String value1, String value2) {
            addCriterion("title_target  not  between", value1, value2, "titleTarget");
            return (Criteria) this;
        }
        
        		
        public Criteria andDescriHtmlUrlIsNull() {
            addCriterion("descri_html_url  is null");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlIsNotNull() {
            addCriterion("descri_html_url  is not null");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlEqualTo(String value) {
            addCriterion("descri_html_url  =", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlNotEqualTo(String value) {
            addCriterion("descri_html_url  <>", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlGreaterThan(String value) {
            addCriterion("descri_html_url  >", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("descri_html_url  >=", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlLessThan(String value) {
            addCriterion("descri_html_url  <", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlLessThanOrEqualTo(String value) {
            addCriterion("descri_html_url  <=", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlLike(String value) {
            addCriterion("descri_html_url  like", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlNotLike(String value) {
            addCriterion("descri_html_url  not  like", value, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlIn(List<String> values) {
            addCriterion("descri_html_url  in", values, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlNotIn(List<String> values) {
            addCriterion("descri_html_url not  in", values, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlBetween(String value1, String value2) {
            addCriterion("descri_html_url  between", value1, value2, "descriHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andDescriHtmlUrlNotBetween(String value1, String value2) {
            addCriterion("descri_html_url  not  between", value1, value2, "descriHtmlUrl");
            return (Criteria) this;
        }
        
        		
        public Criteria andDescriTargetIsNull() {
            addCriterion("descri_target  is null");
            return (Criteria) this;
        }

        public Criteria andDescriTargetIsNotNull() {
            addCriterion("descri_target  is not null");
            return (Criteria) this;
        }

        public Criteria andDescriTargetEqualTo(String value) {
            addCriterion("descri_target  =", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetNotEqualTo(String value) {
            addCriterion("descri_target  <>", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetGreaterThan(String value) {
            addCriterion("descri_target  >", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetGreaterThanOrEqualTo(String value) {
            addCriterion("descri_target  >=", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetLessThan(String value) {
            addCriterion("descri_target  <", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetLessThanOrEqualTo(String value) {
            addCriterion("descri_target  <=", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetLike(String value) {
            addCriterion("descri_target  like", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetNotLike(String value) {
            addCriterion("descri_target  not  like", value, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetIn(List<String> values) {
            addCriterion("descri_target  in", values, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetNotIn(List<String> values) {
            addCriterion("descri_target not  in", values, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetBetween(String value1, String value2) {
            addCriterion("descri_target  between", value1, value2, "descriTarget");
            return (Criteria) this;
        }

        public Criteria andDescriTargetNotBetween(String value1, String value2) {
            addCriterion("descri_target  not  between", value1, value2, "descriTarget");
            return (Criteria) this;
        }
        
        		
        public Criteria andMoreHtmlUrlIsNull() {
            addCriterion("more_html_url  is null");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlIsNotNull() {
            addCriterion("more_html_url  is not null");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlEqualTo(String value) {
            addCriterion("more_html_url  =", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlNotEqualTo(String value) {
            addCriterion("more_html_url  <>", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlGreaterThan(String value) {
            addCriterion("more_html_url  >", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("more_html_url  >=", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlLessThan(String value) {
            addCriterion("more_html_url  <", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlLessThanOrEqualTo(String value) {
            addCriterion("more_html_url  <=", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlLike(String value) {
            addCriterion("more_html_url  like", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlNotLike(String value) {
            addCriterion("more_html_url  not  like", value, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlIn(List<String> values) {
            addCriterion("more_html_url  in", values, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlNotIn(List<String> values) {
            addCriterion("more_html_url not  in", values, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlBetween(String value1, String value2) {
            addCriterion("more_html_url  between", value1, value2, "moreHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andMoreHtmlUrlNotBetween(String value1, String value2) {
            addCriterion("more_html_url  not  between", value1, value2, "moreHtmlUrl");
            return (Criteria) this;
        }
        
        		
        public Criteria andMoreTargetIsNull() {
            addCriterion("more_target  is null");
            return (Criteria) this;
        }

        public Criteria andMoreTargetIsNotNull() {
            addCriterion("more_target  is not null");
            return (Criteria) this;
        }

        public Criteria andMoreTargetEqualTo(String value) {
            addCriterion("more_target  =", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetNotEqualTo(String value) {
            addCriterion("more_target  <>", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetGreaterThan(String value) {
            addCriterion("more_target  >", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetGreaterThanOrEqualTo(String value) {
            addCriterion("more_target  >=", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetLessThan(String value) {
            addCriterion("more_target  <", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetLessThanOrEqualTo(String value) {
            addCriterion("more_target  <=", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetLike(String value) {
            addCriterion("more_target  like", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetNotLike(String value) {
            addCriterion("more_target  not  like", value, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetIn(List<String> values) {
            addCriterion("more_target  in", values, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetNotIn(List<String> values) {
            addCriterion("more_target not  in", values, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetBetween(String value1, String value2) {
            addCriterion("more_target  between", value1, value2, "moreTarget");
            return (Criteria) this;
        }

        public Criteria andMoreTargetNotBetween(String value1, String value2) {
            addCriterion("more_target  not  between", value1, value2, "moreTarget");
            return (Criteria) this;
        }
        
        		
        public Criteria andDescriSplitTxtIsNull() {
            addCriterion("descri_split_txt  is null");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtIsNotNull() {
            addCriterion("descri_split_txt  is not null");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtEqualTo(String value) {
            addCriterion("descri_split_txt  =", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtNotEqualTo(String value) {
            addCriterion("descri_split_txt  <>", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtGreaterThan(String value) {
            addCriterion("descri_split_txt  >", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtGreaterThanOrEqualTo(String value) {
            addCriterion("descri_split_txt  >=", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtLessThan(String value) {
            addCriterion("descri_split_txt  <", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtLessThanOrEqualTo(String value) {
            addCriterion("descri_split_txt  <=", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtLike(String value) {
            addCriterion("descri_split_txt  like", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtNotLike(String value) {
            addCriterion("descri_split_txt  not  like", value, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtIn(List<String> values) {
            addCriterion("descri_split_txt  in", values, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtNotIn(List<String> values) {
            addCriterion("descri_split_txt not  in", values, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtBetween(String value1, String value2) {
            addCriterion("descri_split_txt  between", value1, value2, "descriSplitTxt");
            return (Criteria) this;
        }

        public Criteria andDescriSplitTxtNotBetween(String value1, String value2) {
            addCriterion("descri_split_txt  not  between", value1, value2, "descriSplitTxt");
            return (Criteria) this;
        }
        
        		
        public Criteria andBeforeSplitTxtIsNull() {
            addCriterion("before_split_txt  is null");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtIsNotNull() {
            addCriterion("before_split_txt  is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtEqualTo(String value) {
            addCriterion("before_split_txt  =", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtNotEqualTo(String value) {
            addCriterion("before_split_txt  <>", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtGreaterThan(String value) {
            addCriterion("before_split_txt  >", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtGreaterThanOrEqualTo(String value) {
            addCriterion("before_split_txt  >=", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtLessThan(String value) {
            addCriterion("before_split_txt  <", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtLessThanOrEqualTo(String value) {
            addCriterion("before_split_txt  <=", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtLike(String value) {
            addCriterion("before_split_txt  like", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtNotLike(String value) {
            addCriterion("before_split_txt  not  like", value, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtIn(List<String> values) {
            addCriterion("before_split_txt  in", values, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtNotIn(List<String> values) {
            addCriterion("before_split_txt not  in", values, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtBetween(String value1, String value2) {
            addCriterion("before_split_txt  between", value1, value2, "beforeSplitTxt");
            return (Criteria) this;
        }

        public Criteria andBeforeSplitTxtNotBetween(String value1, String value2) {
            addCriterion("before_split_txt  not  between", value1, value2, "beforeSplitTxt");
            return (Criteria) this;
        }
        
        		
        public Criteria andAfterSplitTxtIsNull() {
            addCriterion("after_split_txt  is null");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtIsNotNull() {
            addCriterion("after_split_txt  is not null");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtEqualTo(String value) {
            addCriterion("after_split_txt  =", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtNotEqualTo(String value) {
            addCriterion("after_split_txt  <>", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtGreaterThan(String value) {
            addCriterion("after_split_txt  >", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtGreaterThanOrEqualTo(String value) {
            addCriterion("after_split_txt  >=", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtLessThan(String value) {
            addCriterion("after_split_txt  <", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtLessThanOrEqualTo(String value) {
            addCriterion("after_split_txt  <=", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtLike(String value) {
            addCriterion("after_split_txt  like", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtNotLike(String value) {
            addCriterion("after_split_txt  not  like", value, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtIn(List<String> values) {
            addCriterion("after_split_txt  in", values, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtNotIn(List<String> values) {
            addCriterion("after_split_txt not  in", values, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtBetween(String value1, String value2) {
            addCriterion("after_split_txt  between", value1, value2, "afterSplitTxt");
            return (Criteria) this;
        }

        public Criteria andAfterSplitTxtNotBetween(String value1, String value2) {
            addCriterion("after_split_txt  not  between", value1, value2, "afterSplitTxt");
            return (Criteria) this;
        }
        
        		
        public Criteria andOrderNumIsNull() {
            addCriterion("order_num  is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num  is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num  =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num  <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num  >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num  >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num  <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num  <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(Integer value) {
            addCriterion("order_num  like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(Integer value) {
            addCriterion("order_num  not  like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num  in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not  in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num  between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num  not  between", value1, value2, "orderNum");
            return (Criteria) this;
        }
        
        		
        public Criteria andLevelNumIsNull() {
            addCriterion("level_num is null");
            return (Criteria) this;
        }

        public Criteria andLevelNumIsNotNull() {
            addCriterion("level_num is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNumEqualTo(Integer value) {
            addCriterion("level_num =", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotEqualTo(Integer value) {
            addCriterion("level_num <>", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumGreaterThan(Integer value) {
            addCriterion("level_num >", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_num >=", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumLessThan(Integer value) {
            addCriterion("level_num <", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumLessThanOrEqualTo(Integer value) {
            addCriterion("level_num <=", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumLike(Integer value) {
            addCriterion("level_num like", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotLike(Integer value) {
            addCriterion("level_num not  like", value, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumIn(List<Integer> values) {
            addCriterion("level_num in", values, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotIn(List<Integer> values) {
            addCriterion("level_numnot  in", values, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumBetween(Integer value1, Integer value2) {
            addCriterion("level_num between", value1, value2, "levelNum");
            return (Criteria) this;
        }

        public Criteria andLevelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("level_num not  between", value1, value2, "levelNum");
            return (Criteria) this;
        }
        
                
       
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}