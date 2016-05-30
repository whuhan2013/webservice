package com.zj.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import com.zj.server.CxfWebServicePortType;

public class CXFClientInvoke {

	public static void main(String[] args) {
		// 创建调用webservice 服务的类...
		ClientProxyFactoryBean bean = new ClientProxyFactoryBean();
		bean.setAddress("http://10.129.69.114:8080/server");// 设置访问地址...
		bean.setServiceClass(CxfWebServicePortType.class);// 设置服务的接口...
		// 创建接口类型...
		CxfWebServicePortType cxfWebServicePortType = (CxfWebServicePortType) bean.create();
		cxfWebServicePortType.sayHello();
	}

}
