package cn.org.japd.modules.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.japd.common.base.BaseDAO;
import cn.org.japd.common.base.BaseService;
import cn.org.japd.modules.sys.dao.UserDAO;
import cn.org.japd.modules.sys.entity.User;

@Service
public class UserService  extends BaseService< User> {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	protected BaseDAO<User> getBaseDAO() {
		return userDAO;
	}
		
}
