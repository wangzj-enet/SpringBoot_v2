package com.fc.test.controller.gen;

import com.fc.test.util.DateUtils;
import com.fc.test.util.StringUtils;
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
import com.fc.test.model.auto.HuangUsername;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.HuangUsernameService;
import io.swagger.annotations.Api;

@Controller
@RequestMapping("HuangUsernameController")
@Api(value = "")
public class HuangUsernameController extends BaseController{
	
	private String prefix = "gen/huangUsername";
	@Autowired
	private HuangUsernameService huangUsernameService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:huangUsername:view")
    public String view(Model model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	
	@PostMapping("list")
	@RequiresPermissions("gen:huangUsername:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchTxt){
		PageInfo<HuangUsername> page=huangUsernameService.list(tablepar,searchTxt) ; 
		TableSplitResult<HuangUsername> result=new TableSplitResult<HuangUsername>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	@RequiresPermissions("gen:huangUsername:add")
	@ResponseBody
	public AjaxResult add(HuangUsername huangUsername,Model model){
    	try {
			if(StringUtils.isNotEmpty(huangUsername.getTimeLong())){
				int timelong = Integer.parseInt(huangUsername.getTimeLong());
				huangUsername.setEndTime(DateUtils.stepMonth(huangUsername.getStartTime(),timelong));
			}
		}catch (Exception e){

		}
		int b=huangUsernameService.insertSelective(huangUsername);
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
	@RequiresPermissions("gen:huangUsername:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=huangUsernameService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(HuangUsername huangUsername){
		int b=huangUsernameService.checkNameUnique(huangUsername);
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
        mmap.put("HuangUsername", huangUsernameService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    @RequiresPermissions("gen:huangUsername:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HuangUsername record)
    {
		try {
			if(StringUtils.isNotEmpty(record.getTimeLong())){
				int timelong = Integer.parseInt(record.getTimeLong());
				record.setEndTime(DateUtils.stepMonth(record.getStartTime(),timelong));
			}
		}catch (Exception e){

		}
        return toAjax(huangUsernameService.updateByPrimaryKeySelective(record));
    }

    
    

	
}
