package cn.itcast.cxf.spring.call;

import javax.jws.WebService;

@WebService
public interface CallService {
	
	public boolean makeCaller(String telephone);
	

}
