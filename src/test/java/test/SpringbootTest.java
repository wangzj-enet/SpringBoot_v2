package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fc.test.common.conf.V2Config;
import com.fc.test.model.custom.email.MailSenderInfo;
import com.fc.test.util.SimpleEmailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.fc.SpringbootStart;
import com.fc.test.mapper.auto.TSysRoleUserMapper;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringbootStart.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootTest {

//	@Test
	/*public void test() throws Exception{
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
		strb.append("这是Title");
		strb.append("<br/>");
		strb.append("Name:");
		strb.append("这是Name");
		strb.append("<br/>");
		strb.append("E-mail:");
		strb.append("这是E-mail");
		strb.append("<br/>");
		strb.append("Telephone:");
		strb.append("这是Telephone");
		strb.append("<br/>");
		strb.append("Company:");
		strb.append("这是Company");
		strb.append("<br/>");
		strb.append("Message:");
		strb.append("<br/>");
		strb.append("这是Message");
		strb.append("<br/>");
		mailInfo.setContent(strb.toString());
		// 这个类主要来发送邮件
		SimpleEmailUtil sms = new SimpleEmailUtil();
		sms.sendHtmlMail(mailInfo,null);


	}
	*/


}
