package cn.itcast.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.cxf.spring.call.CallService;


/**
 * 
 * 通过配置文件的方式调用webservice,
 * 同时也需要依赖一个接口....
 * 
 * @ 作者 zhuwu@itcast.cn
 *
 */
public class SpringClientInvoke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//解析spring配置文件
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		//通过getBean 拿到接口 的实例对象...
		CallService callService=
		(CallService) context.getBean("itcast");
		boolean flag=callService.makeCaller("itcast");
		System.out.println(flag);
		
		
	}

}
