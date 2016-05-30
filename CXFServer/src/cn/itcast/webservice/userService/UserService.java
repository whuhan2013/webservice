package cn.itcast.webservice.userService;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
public interface UserService {

	public void addUser(String userId);
	
	public String getUserById(int id);
	
}
