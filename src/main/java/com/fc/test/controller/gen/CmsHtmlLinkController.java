package com.fc.test.controller.gen;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import com.fc.test.model.auto.CmsHtmlLink;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.CmsHtmlLinkService;
import io.swagger.annotations.Api;

@Controller
@RequestMapping("CmsHtmlLinkController")
@Api(value = "页面链接")
public class CmsHtmlLinkController extends BaseController{
	
	private String prefix = "gen/cmsHtmlLink";
	@Autowired
	private CmsHtmlLinkService cmsHtmlLinkService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:cmsHtmlLink:view")
    public String view(Model model)
    {	
		String str="页面链接";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	
	@PostMapping("list")
	@RequiresPermissions("gen:cmsHtmlLink:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchTxt){
		PageInfo<CmsHtmlLink> page=cmsHtmlLinkService.list(tablepar,searchTxt) ; 
		TableSplitResult<CmsHtmlLink> result=new TableSplitResult<CmsHtmlLink>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	@RequiresPermissions("gen:cmsHtmlLink:add")
	@ResponseBody
	public AjaxResult add(CmsHtmlLink cmsHtmlLink,Model model){
		int b=cmsHtmlLinkService.insertSelective(cmsHtmlLink);
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
	@RequiresPermissions("gen:cmsHtmlLink:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=cmsHtmlLinkService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(CmsHtmlLink cmsHtmlLink){
		int b=cmsHtmlLinkService.checkNameUnique(cmsHtmlLink);
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
        mmap.put("CmsHtmlLink", cmsHtmlLinkService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    @RequiresPermissions("gen:cmsHtmlLink:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CmsHtmlLink record)
    {
        return toAjax(cmsHtmlLinkService.updateByPrimaryKeySelective(record));
    }

    
    

	
}
