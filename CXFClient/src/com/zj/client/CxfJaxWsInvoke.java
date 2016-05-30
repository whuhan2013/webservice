package com.zj.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.itcast.webservice.userservice.UserService;



/**
 * 
 * 使用JaxWsProxyFactoryBean 调用服务..
 * @ 作者 zhuwu@itcast.cn
 * 
 * 需要依赖一个接口...
 *
 */
public class CxfJaxWsInvoke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建调用服务的类...
		JaxWsProxyFactoryBean bean=new JaxWsProxyFactoryBean();
		//设置访问地址
		bean.setAddress("http://10.129.69.114:7418/userService");
		//设置接口类型...
		bean.setServiceClass(UserService.class);
		UserService us=(UserService) bean.create();
		
		String data=us.getUserById(1);
		
		System.out.println(data);

	}

}
