package com.zj.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import cn.itcast.webservice.userService.UserService;
import cn.itcast.webservice.userService.UserServiceImpl;

/**
 * 
 * 使用cxf 提供的类 JaxWsServerFactoryBean 来发布一个带接口的webservice ...
 * 
 * @ 作者 zhuwu@itcast.cn
 *
 */
public class PublishUserService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建发布服务的 类...
		JaxWsServerFactoryBean  bean=new JaxWsServerFactoryBean();
		//设置对外的访问地址
		bean.setAddress("http://10.129.69.114:7418/userService");
		bean.setServiceClass(UserService.class);//设置接口类型...
		bean.setServiceBean(new UserServiceImpl());//设置接口的实现类...
		//我们可以在发布服务的时候添加消息拦截器
		//拦截客户端往服务端 发送的请求的消息
		bean.getInInterceptors().add(new LoggingInInterceptor());
		//拦截服务端往客户端返回的消息...
		bean.getOutInterceptors().add(new LoggingOutInterceptor());
		
		bean.create();
	}

}
