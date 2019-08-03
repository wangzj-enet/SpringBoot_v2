package com.fc.test.controller.page;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.CmsHtmlModule;
import com.fc.test.model.auto.CmsHtmlModuleExample;
import com.fc.test.model.custom.ParamsEditor;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.CmsHtmlModuleService;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("CmsMController")
@Api(value = "页面模块")
public class CmsMController extends BaseController{
	
	private String prefix = "gen/page/";
	@Autowired
	private CmsHtmlModuleService cmsHtmlModuleService;
	
	@GetMapping("view")
    public String view(Model model,String path,CmsHtmlModule cmsHtmlModule,ParamsEditor paramsEditor)
    {
		String str="页面模块";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        if(StringUtils.isNotEmpty(path)){
                 model.addAttribute("cmsHtmlModule",cmsHtmlModule);


                 model.addAttribute("path",path);
			     model.addAttribute("paramsEditor",paramsEditor);
				return path;
        }
        return prefix + "/list";
    }
	
	
	@PostMapping("list")
	@ResponseBody
	public Object list(Tablepar tablepar,CmsHtmlModule cmsHtmlModule,String isLike){
		if(StringUtils.isNotEmpty(isLike)&&"yes".equals(isLike)){
			PageInfo<CmsHtmlModule> page= cmsHtmlModuleService.getPagelist(tablepar,cmsHtmlModuleService.getCmsHtmlModuleExampleByCmsHtmlModuleLike(cmsHtmlModule));
			TableSplitResult<CmsHtmlModule> result=new TableSplitResult<CmsHtmlModule>(page.getPageNum(), page.getTotal(), page.getList());
			return  result;
		}else {
			PageInfo<CmsHtmlModule> page= cmsHtmlModuleService.getPagelist(tablepar,cmsHtmlModuleService.getCmsHtmlModuleExampleByCmsHtmlModule(cmsHtmlModule));
			TableSplitResult<CmsHtmlModule> result=new TableSplitResult<CmsHtmlModule>(page.getPageNum(), page.getTotal(), page.getList());
			return  result;
		}

	}


	@PostMapping("detail/list")
	@ResponseBody
	public Object detailList(Tablepar tablepar,CmsHtmlModule cmsHtmlModule,String isLike){

		CmsHtmlModule cmsHtmlModule_requeset = cmsHtmlModule;
		CmsHtmlModule cmsHtmlModule_4 = new CmsHtmlModule();

		String getCmsHtmlLinkCode = cmsHtmlModule_requeset.getCmsHtmlLinkCode().split("_")[0];
		cmsHtmlModule_4.setCmsHtmlLinkCode(getCmsHtmlLinkCode);
		if("PRODUCTS".equals(getCmsHtmlLinkCode)){
			cmsHtmlModule_4.setLevelNum(4);
		}else if("NEWS".equals(getCmsHtmlLinkCode)){
			cmsHtmlModule_4.setLevelNum(2);
		}
		cmsHtmlModule_4.setTitle(cmsHtmlModule.getTitle());
		cmsHtmlModule_4.setDescri(cmsHtmlModule.getDescri());
		cmsHtmlModule_4.setMore(cmsHtmlModule.getMore());

		List<CmsHtmlModule> cmsHtmlModule_4_list = new ArrayList<>();
		List<String> code_list = new ArrayList<>();


		if(StringUtils.isNotEmpty(isLike)&&"yes".equals(isLike)){
			cmsHtmlModule_4_list = cmsHtmlModuleService.selectByExample(cmsHtmlModuleService.getCmsHtmlModuleExampleByCmsHtmlModuleLike(cmsHtmlModule_4));
			code_list = this.getCodeListByCmsHtmlModuleList(cmsHtmlModule_4_list);

		}else {
			cmsHtmlModule_4_list = cmsHtmlModuleService.selectByExample(cmsHtmlModuleService.getCmsHtmlModuleExampleByCmsHtmlModule(cmsHtmlModule_4));
			code_list = this.getCodeListByCmsHtmlModuleList(cmsHtmlModule_4_list);

		}
		if(code_list.size() > 0){

		}else {
			code_list.add("error");
		}

		CmsHtmlModuleExample example = new CmsHtmlModuleExample();
		example.createCriteria().andCmsHtmlLinkCodeEqualTo(cmsHtmlModule_requeset.getCmsHtmlLinkCode()).andParentCodeIn(code_list).andLevelNumEqualTo(cmsHtmlModule_requeset.getLevelNum());
		example.setOrderByClause("order_num");

		PageInfo<CmsHtmlModule> page= cmsHtmlModuleService.getPagelist(tablepar,example);
		TableSplitResult<CmsHtmlModule> result=new TableSplitResult<CmsHtmlModule>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;

	}

	@PostMapping("detail2/list")
	@ResponseBody
	public Object detai2lList(Tablepar tablepar,CmsHtmlModule cmsHtmlModule,String isLike){

		CmsHtmlModule cmsHtmlModule_requeset = cmsHtmlModule;
		CmsHtmlModule cmsHtmlModule_4 = new CmsHtmlModule();

		String getCmsHtmlLinkCode = cmsHtmlModule_requeset.getCmsHtmlLinkCode().split("_")[0];
		cmsHtmlModule_4.setCmsHtmlLinkCode(getCmsHtmlLinkCode);
		if("PRODUCTS".equals(getCmsHtmlLinkCode)){
			cmsHtmlModule_4.setLevelNum(4);
		}else if("NEWS".equals(getCmsHtmlLinkCode)){
			cmsHtmlModule_4.setLevelNum(2);
		}
		cmsHtmlModule_4.setTitle(cmsHtmlModule.getTitle());
		cmsHtmlModule_4.setDescri(cmsHtmlModule.getDescri());
		cmsHtmlModule_4.setMore(cmsHtmlModule.getMore());

		List<CmsHtmlModule> cmsHtmlModule_4_list = new ArrayList<>();
		List<String> code1_list = new ArrayList<>();
		List<String> code2_list = new ArrayList<>();


		if(StringUtils.isNotEmpty(isLike)&&"yes".equals(isLike)){
			cmsHtmlModule_4_list = cmsHtmlModuleService.selectByExample(cmsHtmlModuleService.getCmsHtmlModuleExampleByCmsHtmlModuleLike(cmsHtmlModule_4));
			code1_list = this.getCodeListByCmsHtmlModuleList(cmsHtmlModule_4_list);

		}else {
			cmsHtmlModule_4_list = cmsHtmlModuleService.selectByExample(cmsHtmlModuleService.getCmsHtmlModuleExampleByCmsHtmlModule(cmsHtmlModule_4));
			code1_list = this.getCodeListByCmsHtmlModuleList(cmsHtmlModule_4_list);

		}
		if(code1_list.size() > 0){

		}else {
			code1_list.add("error");
		}

		CmsHtmlModuleExample example1 = new CmsHtmlModuleExample();
		example1.createCriteria().andCmsHtmlLinkCodeEqualTo(cmsHtmlModule_requeset.getCmsHtmlLinkCode()).andParentCodeIn(code1_list).andLevelNumEqualTo(cmsHtmlModule_requeset.getLevelNum()-1);
		example1.setOrderByClause("order_num");
		List<CmsHtmlModule> example1_list = cmsHtmlModuleService.selectByExample(example1);
		code2_list = this.getCodeListByCmsHtmlModuleList(example1_list);
		if(code2_list.size() > 0){

		}else {
			code2_list.add("error");
		}

		CmsHtmlModuleExample example2 = new CmsHtmlModuleExample();
		example2.createCriteria().andCmsHtmlLinkCodeEqualTo(cmsHtmlModule_requeset.getCmsHtmlLinkCode()).andParentCodeIn(code2_list).andLevelNumEqualTo(cmsHtmlModule_requeset.getLevelNum());
		example2.setOrderByClause("order_num");

		PageInfo<CmsHtmlModule> page= cmsHtmlModuleService.getPagelist(tablepar,example2);
		TableSplitResult<CmsHtmlModule> result=new TableSplitResult<CmsHtmlModule>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;

	}



	private List<String> getCodeListByCmsHtmlModuleList(List<CmsHtmlModule> list) {
		List<String> code_list = new ArrayList<>();
		for (CmsHtmlModule cmsHtmlModule2 : list) {
			code_list.add(cmsHtmlModule2.getCode());
		}
		return code_list;
	}
	
	/**
     * 新增
     */
    @GetMapping("add")
    public String add(Model model,String path,CmsHtmlModule cmsHtmlModule)
    {
		if(StringUtils.isNotEmpty(path)){
			model.addAttribute("cmsHtmlModule",cmsHtmlModule);
			model.addAttribute("path",path);
			return path;
		}
        return prefix + "/add";
    }

	/**
	 * 新增
	 */
	@GetMapping("ueditor/add")
	public String ueditoradd(Model model,String path,CmsHtmlModule cmsHtmlModule,ParamsEditor paramsEditor)
	{
		if(StringUtils.isNotEmpty(path)){
			model.addAttribute("cmsHtmlModule",cmsHtmlModule);
			model.addAttribute("path",path);
		}
		return prefix + "ueditor/"+paramsEditor.toString()+"add";
	}
	
	@PostMapping("add")
	@ResponseBody
	public AjaxResult add(CmsHtmlModule cmsHtmlModule,Model model){
		int b=cmsHtmlModuleService.insertSelective(cmsHtmlModule);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 删除用户
	 * @param ids
	 * @return
	 */
	@PostMapping("remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=cmsHtmlModuleService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 检查用户
	 * @param tsysUser
	 * @return
	 */
	@PostMapping("checkNameUnique")
	@ResponseBody
	public int checkNameUnique(CmsHtmlModule cmsHtmlModule){
		int b=cmsHtmlModuleService.checkNameUnique(cmsHtmlModule);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@GetMapping("edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.put("CmsHtmlModule", cmsHtmlModuleService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@GetMapping("ueditor/edit/{id}/{titlei}/{descrii}/{morei}")
	public String ueditorEdit(@PathVariable("id") String id,@PathVariable("titlei") String title,@PathVariable("descrii") String descri,@PathVariable("morei") String more, ModelMap mmap)
	{
		String path = getPathByTitleDescriMore(title, descri, more);
		mmap.put("CmsHtmlModule", cmsHtmlModuleService.selectByPrimaryKey(id));

		return prefix + "ueditor/"+path+"edit";
	}

	private String getPathByTitleDescriMore(String title,String descri,String more) {
		ParamsEditor path = new ParamsEditor(title,descri,more);
		return path.toString();
	}


	/**
     * 修改保存
     */
    @PostMapping("edit")
    @ResponseBody
    public AjaxResult editSave(CmsHtmlModule record)
    {
        return toAjax(cmsHtmlModuleService.updateByPrimaryKeySelective(record));
    }

    
    

	
}
