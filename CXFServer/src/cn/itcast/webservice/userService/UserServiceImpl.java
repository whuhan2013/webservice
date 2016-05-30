package cn.itcast.webservice.userService;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(String userId) {
		System.out.println("小何");

	}

	@Override
	public String getUserById(int id) {
		
		return "如果认定了一件事情，那么一定要把它做到最好，加油，java!";
	}

}
