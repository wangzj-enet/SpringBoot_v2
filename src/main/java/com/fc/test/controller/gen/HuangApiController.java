package com.fc.test.controller.gen;

import com.fc.test.common.base.BaseController;
import com.fc.test.common.conf.V2Config;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.HuangUsername;
import com.fc.test.model.auto.HuangUsernameExample;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.model.custom.email.MailInfo;
import com.fc.test.model.custom.email.MailSenderInfo;
import com.fc.test.service.HuangUsernameService;
import com.fc.test.util.DateUtils;
import com.fc.test.util.SimpleEmailUtil;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("api")
@Api(value = "")
public class HuangApiController extends BaseController{

	@Autowired
	private HuangUsernameService huangUsernameService;
	

	
	@GetMapping("getInfoByUserName")
	@ResponseBody
	public Object list(String userName){
		HuangUsernameExample example = new HuangUsernameExample();
		example.createCriteria().andUserNameEqualTo(userName);
		List<HuangUsername>  list = huangUsernameService.selectByExample(example);
		HuangUsername huangUsername= list.get(0);
		return  huangUsername;
	}

	@GetMapping("getStatusByUserName")
	@ResponseBody
	public Object compare(String userName){
		HuangUsernameExample example = new HuangUsernameExample();
		example.createCriteria().andUserNameEqualTo(userName);
		List<HuangUsername>  list = huangUsernameService.selectByExample(example);
		if(list.size()>0){
			HuangUsername huangUsername= list.get(0);
			return DateUtils.compareTime(new Date(),huangUsername.getEndTime());
		}

		return  1;
	}

	@PostMapping("sendMail")
	@ResponseBody
	public Object sendMail(MailInfo info){
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost(V2Config.getEmail_smtp());
		mailInfo.setMailServerPort(V2Config.getEmail_port());
		mailInfo.setValidate(true);
		mailInfo.setSsl(true);
		mailInfo.setUserName(V2Config.getEmail_account());
		mailInfo.setPassword(V2Config.getEmail_password());// 您的邮箱密码
		mailInfo.setFromAddress(mailInfo.getUserName());//发件人地址
		mailInfo.setToAddress(V2Config.getEmail_to());//收件人地址
		mailInfo.setSubject("championgrass");
		StringBuffer strb = new StringBuffer();
		strb.append("<br/>");
		strb.append("Title:");
		strb.append(info.getTitle());
		strb.append("<br/>");
		strb.append("Name:");
		strb.append(info.getFullname());
		strb.append("<br/>");
		strb.append("E-mail:");
		strb.append(info.getEmail());
		strb.append("<br/>");
		strb.append("Telephone:");
		strb.append(info.getTel());
		strb.append("<br/>");
		strb.append("Company:");
		strb.append(info.getCompany());
		strb.append("<br/>");
		strb.append("Message:");
		strb.append("<br/>");
		strb.append(info.getContent());
		strb.append("<br/>");
		mailInfo.setContent(strb.toString());
		// 这个类主要来发送邮件
		SimpleEmailUtil sms = new SimpleEmailUtil();
		try {
			sms.sendHtmlMail(mailInfo,null);
		}catch (Exception e){
			return  0;
		}

		return  1;
	}
	


	
}
