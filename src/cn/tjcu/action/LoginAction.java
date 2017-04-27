package cn.tjcu.action;


import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.tjcu.entity.User;
import cn.tjcu.service.UserService;

public class LoginAction extends ActionSupport{	
	//@Resource(name="userService")
	private UserService userService;
	
	public User user;
	
	public String execute(){
		
		//查找全部用户
		List<User> list = (List<User>) userService.findAll();
		
		
		//遍历所有用户，进行登录验证
		for (User u : list) {
			String name= u.getUsername();
			System.out.println("用户名为：："+name);
			
			if(user.getUsername().trim().equals(u.getUsername())&&
					user.getPassword().trim().equals(u.getPassword())&&
					u.getType()==0)
					{System.out.println("type::"+u.getType());
					Map<String,Object> session = ActionContext.getContext().getSession();
					session.put("user", u);
					return "usersuccess";}
			if(user.getUsername().trim().equals(u.getUsername())&&
					user.getPassword().trim().equals(u.getPassword())&&
					u.getType()==1) 
					{ System.out.println("type::"+u.getType());
					Map<String,Object> session = ActionContext.getContext().getSession();
					session.put("user", u);
		
					return "adminsuccess";}
			
		}
		return "failer";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	

}
