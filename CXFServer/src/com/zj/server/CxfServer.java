package com.zj.server;

import org.apache.cxf.frontend.ServerFactoryBean;

public class CxfServer {

	public static void main(String[] args) {

		// 创建发布服务的类...
		ServerFactoryBean bean = new ServerFactoryBean();
		bean.setAddress("http://10.129.69.114:8080/server");// 服务对外的访问地址
		bean.setServiceClass(CxfWebService.class);// 设置服务类的接口类型，如果没有接口则为当前类..
		bean.setServiceBean(new CxfWebService());// 设置服务类的实现
		bean.create();// 发布服务
	}

}
