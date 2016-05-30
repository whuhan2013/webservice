package com.zj.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
//发布一个soap1.2版本的协议...
@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING)
public class CxfWebService {

	public void sayHello(){
		System.out.println("待我长发乃腰，美日屈服可好！");
	}
	
}
