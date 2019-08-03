package com.fc.test.controller.cms;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.conf.LanguageUtil;
import com.fc.test.model.auto.CmsHtmlModule;
import com.fc.test.model.auto.CmsHtmlModuleExample;
import com.fc.test.model.auto.TsysUser;
import com.fc.test.model.custom.BootstrapTree;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.CmsHtmlModuleService;
import com.fc.test.shiro.util.ShiroUtils;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageInfo;
import com.google.code.kaptcha.Constants;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CmsController extends BaseController{
	private static Logger logger=LoggerFactory.getLogger(CmsController.class);
	@Autowired
	private CmsHtmlModuleService cmsHtmlModuleService;

	@ApiOperation(value="首页",notes="首页")
	@GetMapping("/index.html")
	public String index(Model model) {
		System.out.println(LanguageUtil.getCurrentLang());
		String html_code = "HOME";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		return "cms/index";
	}

	@ApiOperation(value="首页",notes="首页")
	@GetMapping("/")
	public String index2(Model model) {
		System.out.println(LanguageUtil.getCurrentLang());
		String html_code = "HOME";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		return "cms/index";
	}




	@ApiOperation(value="关于我们",notes="关于我们")
	@GetMapping("/about.html")
	public String about(Model model) {
		String html_code = "ABOUT_US";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());
		return "cms/about";
	}

	@ApiOperation(value="关于产品",notes="关于产品")
	@GetMapping("/product.html")
	public String product(Model model,Tablepar tablepar,String title) {
		String html_code = "PRODUCTS";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());

		List<CmsHtmlModule> banner_nav2_list = new ArrayList<>();
		List<CmsHtmlModule> banner_nav3_list = new ArrayList<>();
		List<String> procut_param_list = new ArrayList<>();


		if(StringUtils.isEmpty(title)){
			String html_parent_code = "banner_nav";
			banner_nav2_list = getNextLevelListByParentCodeEq(html_code, html_parent_code, 2);
			List<String> code_level2_list = getCodeListByCmsHtmlModuleList(banner_nav2_list);
			List<CmsHtmlModule> banner_nav_list3 = getNextLevelListByParentCodeIn(html_code, code_level2_list, 3);
			banner_nav3_list = banner_nav_list3;

		}else{
			//2 level判断
			List<CmsHtmlModule> banner_nav_list2 = getListByTitleEq(html_code, title, 2);
			if(banner_nav_list2.size()>0){
				CmsHtmlModule banner_nav_2 = banner_nav_list2.get(0);
				banner_nav2_list.add(banner_nav_2);
				banner_nav3_list = getNextLevelListByParentCodeEq(html_code, banner_nav_2.getCode(), 3);
			}else{

				List<CmsHtmlModule> banner_nav_list3 = getListByTitleEq(html_code, title, 3);
				if(banner_nav_list3.size()>0){
					CmsHtmlModule banner_nav_3 = banner_nav_list3.get(0);
					banner_nav3_list.add(banner_nav_3);
					String code = banner_nav_3.getParentCode();
					List<CmsHtmlModule> banner_nav_list3_2 = getListByCodeEq(html_code, code, 2);
					CmsHtmlModule banner_nav_3_2 = banner_nav_list3_2.get(0);
					banner_nav2_list.add(banner_nav_3_2);

				}

			}

		}

		for(CmsHtmlModule cmsHtmlModule3:banner_nav3_list){
			procut_param_list.add(cmsHtmlModule3.getCode());
		}



		model.addAttribute("banner_nav2_list",banner_nav2_list);
		model.addAttribute("banner_nav3_list",banner_nav3_list);


		tablepar.setPageSize(12);
		CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
		example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(4).andParentCodeIn(procut_param_list);
		example2.setOrderByClause("order_num");

		PageInfo<CmsHtmlModule> page=cmsHtmlModuleService.getPagelistBylanguage(tablepar,example2);
		model.addAttribute("page",page);
		model.addAttribute("title",title);
		return "cms/product";
	}

	private List<CmsHtmlModule> getListByCodeEq(String html_code, String code, int level) {
		CmsHtmlModuleExample example_5 = new CmsHtmlModuleExample();
		example_5.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andCodeEqualTo(code).andLevelNumEqualTo(level);
		return cmsHtmlModuleService.selectByExampleLanguage(example_5);
	}

	private List<CmsHtmlModule> getListByTitleEq(String html_code, String title, int level) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		CmsHtmlModuleExample.Criteria criteria_1=example.createCriteria();
		criteria_1.andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(level).andTitleZhEqualTo(title);
		CmsHtmlModuleExample.Criteria criteria_2=example.createCriteria();
		criteria_2.andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(level).andTitleEnEqualTo(title);
		example.or(criteria_1);
		example.or(criteria_2);
		return cmsHtmlModuleService.selectByExampleLanguage(example);
	}



	@ApiOperation(value="关于产品详情",notes="关于产品详情")
	@GetMapping("/product-detail.html")
	public String productDetail(Model model,Tablepar tablepar,String title) {
		String html_code = "PRODUCTS";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());

		List<CmsHtmlModule> banner_nav2_list  = getNextLevelListByParentCodeEq(html_code, "banner_nav", 2);
		List<String> code_level2_list = getCodeListByCmsHtmlModuleList(banner_nav2_list);
		List<CmsHtmlModule> banner_nav3_list = getNextLevelListByParentCodeIn(html_code, code_level2_list, 3);

		model.addAttribute("banner_nav2_list",banner_nav2_list);
		model.addAttribute("banner_nav3_list",banner_nav3_list);



		CmsHtmlModule product_item = new CmsHtmlModule();
		CmsHtmlModule product_descri = new CmsHtmlModule();
		CmsHtmlModule product_detail = new CmsHtmlModule();

		List<CmsHtmlModule> product_descri_img_list = new ArrayList<>();
		if(StringUtils.isEmpty(title)){

		}else{
			List<CmsHtmlModule> product_item_list = getListByTitleEq(html_code, title, 4);
			if(product_item_list.size()>0){
				product_item = product_item_list.get(0);
				List<CmsHtmlModule> product_descri_list = this.getDetailListByParentCodeEq("PRODUCTS_DETAIL",product_item.getCode(),5,1);
				if(product_descri_list.size()>0){
					product_descri = product_descri_list.get(0);
					product_descri_img_list = this.getNextLevelListByParentCodeEq("PRODUCTS_DETAIL",product_descri.getCode(),6);

				}

				List<CmsHtmlModule> product_detail_list = this.getDetailListByParentCodeEq("PRODUCTS_DETAIL",product_item.getCode(),5,2);
				if(product_detail_list.size()>0){
					product_detail = product_detail_list.get(0);
				}
			}
		}

		model.addAttribute("product_item",product_item);
		model.addAttribute("product_descri",product_descri);
		model.addAttribute("product_detail",product_detail);
		model.addAttribute("product_descri_img_list",product_descri_img_list);

		model.addAttribute("title",title);
		return "cms/product-detail";
	}

	private List<String> getCodeListByCmsHtmlModuleList(List<CmsHtmlModule> list) {
		List<String> code_list = new ArrayList<>();
		for (CmsHtmlModule cmsHtmlModule2 : list) {
			code_list.add(cmsHtmlModule2.getCode());
		}
		return code_list;
	}

	private List<CmsHtmlModule> getDetailListByParentCodeEq(String html_code, String html_parent_code, int level,int order) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(html_parent_code).andLevelNumEqualTo(level).andOrderNumEqualTo(order);
		return cmsHtmlModuleService.selectByExampleLanguage(example);
	}

	private List<CmsHtmlModule> getNextLevelListByParentCodeEq(String html_code, String html_parent_code, int level) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(html_parent_code).andLevelNumEqualTo(level);
		return cmsHtmlModuleService.selectByExampleLanguage(example);
	}

	private List<CmsHtmlModule> getNextLevelListByParentCodeIn(String html_code, List<String> code_level2_list, int level) {
		CmsHtmlModuleExample example_3 = new CmsHtmlModuleExample();
		example_3.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeIn(code_level2_list).andLevelNumEqualTo(level);
		return cmsHtmlModuleService.selectByExampleLanguage(example_3);
	}

	@ApiOperation(value="关于gallery",notes="关于gallery")
	@GetMapping("/gallery.html")
	public String gallery(Model model,Tablepar tablepar,String title) {
		String html_code = "GALLERY";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());

		String html_parent_code = "banner_nav2";
		int level = 2;
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(html_parent_code).andLevelNumEqualTo(level);
		example.setOrderByClause("order_num");
		List<CmsHtmlModule> gallery_list2 = cmsHtmlModuleService.selectByExampleLanguage(example);
		model.addAttribute("banner_nav2_list",gallery_list2);

		tablepar.setPageSize(30);
		level = 3;
		CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
		List<String> parentCodeList = getParentCodeByTitle(gallery_list2,title);
		example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(level).andParentCodeIn(parentCodeList);
		example2.setOrderByClause("order_num");

		PageInfo<CmsHtmlModule> page=cmsHtmlModuleService.getPagelistBylanguage(tablepar,example2);
		model.addAttribute("page",page);
		model.addAttribute("title",title);

		return "cms/gallery";
	}

	/**
	 * 获取 要查询的 parentCOde 列表
	 * @param gallery_list2
	 * @param title
	 * @return
	 */
	private List<String> getParentCodeByTitle(List<CmsHtmlModule> gallery_list2,String title){
		List<String> parentCodeList = new ArrayList<>();
		Map<String,String> map = new HashMap<>();
		for (CmsHtmlModule cmsHtmlModule:gallery_list2){
			map.put(cmsHtmlModule.getTitle(),cmsHtmlModule.getCode());
		}
		if(StringUtils.isEmpty(title)){
			parentCodeList = new ArrayList<String>(map.values());
		}else {
			parentCodeList.add(map.get(title));
		}
		return parentCodeList;
	}


	@ApiOperation(value="installation-supplies",notes="installation-supplies")
	@GetMapping("/installation-supplies.html")
	public String installationSupplies(Model model, Tablepar tablepar,String title) {
		String html_code = "INSTALLATION";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());

		String html_parent_code = "installation_supplies_list";
		int level = 2;
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(html_parent_code).andLevelNumEqualTo(level);
		example.setOrderByClause("order_num");
		tablepar.setPageSize(12);
		PageInfo<CmsHtmlModule> page=cmsHtmlModuleService.getPagelistBylanguage(tablepar,example);
		model.addAttribute("page",page);
		model.addAttribute("title",title);
		return "cms/installation-supplies";
	}



	@ApiOperation(value="faq",notes="faq")
	@GetMapping("/faq.html")
	public String faq(Model model) {
		String html_code = "FAQ";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());
		return "cms/faq";
	}

	@ApiOperation(value="news",notes="news")
	@GetMapping("/news.html")
	public String news(Model model,Tablepar tablepar,String title) {
		String html_code = "NEWS";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());

		tablepar.setPageSize(12);
		int level = 2;
		CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
		example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(level).andParentCodeEqualTo("news_list");
		example2.setOrderByClause("order_num");
		PageInfo<CmsHtmlModule> page=cmsHtmlModuleService.getPagelistBylanguage(tablepar,example2);
		model.addAttribute("page",page);
		model.addAttribute("title",title);
		return "cms/news";
	}


	@ApiOperation(value="news-detail",notes="news-detail")
	@GetMapping("/news-detail.html")
	public String newsDetail(Model model,String title) {
		String html_code = "NEWS";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());

		CmsHtmlModule news_detail = new CmsHtmlModule();
		CmsHtmlModule news_item = new CmsHtmlModule();
		if(StringUtils.isEmpty(title)){

		}else{
			String parentCode = "news_list";
			List<CmsHtmlModule> news_item_list = getNewsItemList(html_code, parentCode, title, 2);
			if(news_item_list.size()>0){
				news_item = news_item_list.get(0);
				List<CmsHtmlModule> news_detail_list = getNewsDetailList("NEWS_DETAIL", news_item.getCode(), 1);
				if(news_detail_list.size()>0){
					news_detail = news_detail_list.get(0);
				}
			}
		}
		model.addAttribute("news_item",news_item);
		model.addAttribute("news_detail",news_detail);
		return "cms/news-detail";
	}

	private List<CmsHtmlModule> getNewsDetailList(String html_code, String code, int level) {
		CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
		example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(code).andLevelNumEqualTo(level);
		return cmsHtmlModuleService.selectByExampleLanguage(example2);
	}

	private List<CmsHtmlModule> getNewsItemList(String html_code, String parentCode, String title, int level) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();

		CmsHtmlModuleExample.Criteria criteria_1 = example.createCriteria();
		criteria_1.andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(parentCode).andLevelNumEqualTo(level).andTitleEnEqualTo(title);
		example.or(criteria_1);

		CmsHtmlModuleExample.Criteria criteria_2 = example.createCriteria();
		criteria_2.andCmsHtmlLinkCodeEqualTo(html_code).andParentCodeEqualTo(parentCode).andLevelNumEqualTo(level).andTitleZhEqualTo(title);
		example.or(criteria_2);


		return cmsHtmlModuleService.selectByExampleLanguage(example);
	}


	@ApiOperation(value="contact",notes="contact")
	@GetMapping("/contact.html")
	public String contact(Model model) {
		String html_code = "CONTACT";
		Map<String, CmsHtmlModule> homeMap = getStringCmsHtmlModuleMap(model, html_code);
		model.addAttribute("homeMap",homeMap);
		model.addAttribute("nav",getNavList());
		return "cms/contact";
	}




	//	返回页面相关模块列表
	private Model setCommonModel(Model model,Map<String,CmsHtmlModule> homeMap) {
		String html_code = "HOME";
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		 List<String> code_1_list = new ArrayList<>();
		code_1_list.add("sliderbar");
		code_1_list.add("footer");
		code_1_list.add("section");
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(1).andCodeIn(code_1_list);
		example.setOrderByClause("order_num");
		List<CmsHtmlModule> home_list = cmsHtmlModuleService.selectByExampleLanguage(example);
		System.out.println(home_list.size());
		for (CmsHtmlModule cmsHtmlModule:home_list) {
			String code = cmsHtmlModule.getCode();
			CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
			example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(2).andParentCodeEqualTo(code);
			example2.setOrderByClause("order_num");
			List<CmsHtmlModule> home_list2 = cmsHtmlModuleService.selectByExampleLanguage(example2);
			model.addAttribute(code,home_list2);
			homeMap.put(code,cmsHtmlModule);
			for (CmsHtmlModule cmsHtmlModule2:home_list2) {
				String code2 = cmsHtmlModule2.getCode();
				CmsHtmlModuleExample example3 = new CmsHtmlModuleExample();
				example3.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(3).andParentCodeEqualTo(code2);
				example3.setOrderByClause("order_num");
				List<CmsHtmlModule> home_list3 = cmsHtmlModuleService.selectByExampleLanguage(example3);
				if(home_list3.size()>0){
					model.addAttribute(code2,home_list3);
				}

			}

		}
		return model;
	}


	//	返回页面相关模块列表
	private Map<String, CmsHtmlModule> getStringCmsHtmlModuleMap(Model model, String html_code) {
		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(1);
		example.setOrderByClause("order_num");
		List<CmsHtmlModule> home_list = cmsHtmlModuleService.selectByExampleLanguage(example);
		System.out.println(home_list.size());
		Map<String,CmsHtmlModule> homeMap = new HashMap<>();
		for (CmsHtmlModule cmsHtmlModule:home_list) {
			String code = cmsHtmlModule.getCode();
			CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
			example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(2).andParentCodeEqualTo(code);
			example2.setOrderByClause("order_num");
			List<CmsHtmlModule> home_list2 = cmsHtmlModuleService.selectByExampleLanguage(example2);
			model.addAttribute(code,home_list2);
			homeMap.put(code,cmsHtmlModule);
		}

		setCommonModel(model,homeMap);
		return homeMap;
	}

	//	返回页面相关模块列表
	private List<CmsHtmlModule> getNavList() {
		String html_code = "HOME";
		String code = "nav";
		CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
		example2.createCriteria().andCmsHtmlLinkCodeEqualTo(html_code).andLevelNumEqualTo(2).andParentCodeEqualTo(code);
		example2.setOrderByClause("order_num");
		List<CmsHtmlModule> home_list2 = cmsHtmlModuleService.selectByExampleLanguage(example2);
		return home_list2;
	}


}
