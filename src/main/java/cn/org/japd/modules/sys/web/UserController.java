package cn.org.japd.modules.sys.web;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.org.japd.common.base.BaseController;
import cn.org.japd.common.base.BaseService;
import cn.org.japd.modules.sys.entity.User;
import cn.org.japd.modules.sys.service.UserService;

@RestController
@RequestMapping("/sys/user")
public class UserController extends BaseController<User>{
	
	@Autowired
	private UserService userService;

	@Override
	protected BaseService<User> getBaseService() {
		return userService;
	}
	
	
	@RequestMapping("add2")
	@ResponseBody
	public User add(){
		User user=new User();
		user.setUsername(String.valueOf(new Date().getTime()));
		user.setUserpsw(String.valueOf(new Date().getTime()));
		user.setEmail("af8991@gmail.com");
		user.setName("吴志锋");
		user=getBaseService().save(user);
		return user;
	}
}
 
