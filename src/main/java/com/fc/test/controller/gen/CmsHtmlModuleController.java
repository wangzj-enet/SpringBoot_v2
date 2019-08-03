package com.fc.test.controller.gen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.CmsHtmlModule;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.CmsHtmlModuleService;
import io.swagger.annotations.Api;

@Controller
@RequestMapping("CmsHtmlModuleController")
@Api(value = "页面模块")
public class CmsHtmlModuleController extends BaseController{
	
	private String prefix = "gen/cmsHtmlModule";
	@Autowired
	private CmsHtmlModuleService cmsHtmlModuleService;
	
	@GetMapping("view")
    public String view(Model model)
    {	
		String str="页面模块";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	
	@PostMapping("list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchTxt){
		PageInfo<CmsHtmlModule> page=cmsHtmlModuleService.list(tablepar,searchTxt) ; 
		TableSplitResult<CmsHtmlModule> result=new TableSplitResult<CmsHtmlModule>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
	
	/**
     * 新增
     */
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
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
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.put("CmsHtmlModule", cmsHtmlModuleService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CmsHtmlModule record)
    {
        return toAjax(cmsHtmlModuleService.updateByPrimaryKeySelective(record));
    }

    
    

	
}
