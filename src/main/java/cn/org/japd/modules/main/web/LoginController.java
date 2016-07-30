package cn.org.japd.modules.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WuZhiFeng
 * @date 2016年7月30日
 */
@Controller
@RequestMapping
public class LoginController {
	
	@RequestMapping("/")
	public String pageLogin() {
		return "login";
	}
}
