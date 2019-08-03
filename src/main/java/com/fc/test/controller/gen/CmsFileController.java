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
import com.fc.test.model.auto.CmsFile;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.CmsFileService;
import io.swagger.annotations.Api;

@Controller
@RequestMapping("CmsFileController")
@Api(value = "文件存储")
public class CmsFileController extends BaseController{
	
	private String prefix = "gen/cmsFile";
	@Autowired
	private CmsFileService cmsFileService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:cmsFile:view")
    public String view(Model model)
    {	
		String str="文件存储";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	
	@PostMapping("list")
	@RequiresPermissions("gen:cmsFile:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchTxt){
		PageInfo<CmsFile> page=cmsFileService.list(tablepar,searchTxt) ; 
		TableSplitResult<CmsFile> result=new TableSplitResult<CmsFile>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	@RequiresPermissions("gen:cmsFile:add")
	@ResponseBody
	public AjaxResult add(CmsFile cmsFile,Model model){
		int b=cmsFileService.insertSelective(cmsFile);
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
	@RequiresPermissions("gen:cmsFile:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=cmsFileService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(CmsFile cmsFile){
		int b=cmsFileService.checkNameUnique(cmsFile);
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
        mmap.put("CmsFile", cmsFileService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    @RequiresPermissions("gen:cmsFile:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CmsFile record)
    {
        return toAjax(cmsFileService.updateByPrimaryKeySelective(record));
    }

    
    

	
}
