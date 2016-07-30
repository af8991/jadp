package cn.org.japd.modules.sys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import cn.org.japd.common.base.BaseEntity;

/**
 * 系统用户表
 * 
 * @author WuZhiFeng
 * @date 2016年7月29日
 */
@Entity
@Table(name = "sys_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 系统用户名
	 */
	@Column(nullable = false, unique = true)
	@NotEmpty(message = "用户名不能为空")
	private String username;

	/**
	 * 系统用户密码
	 */
	@NotEmpty(message = "密码不能为空")
	private String userpsw;

	/**
	 * 姓名
	 */
	@NotNull
	private String name;

	/**
	 * 手机号码
	 */
	private String mobile;

	/**
	 * 邮箱地址
	 */
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpsw() {
		return userpsw;
	}

	public void setUserpsw(String userpsw) {
		this.userpsw = userpsw;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}