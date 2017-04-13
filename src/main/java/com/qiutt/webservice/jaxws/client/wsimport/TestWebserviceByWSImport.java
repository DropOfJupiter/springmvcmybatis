package com.qiutt.webservice.jaxws.client.wsimport;

import com.qiutt.webservice.jaxws.client.wsimport.IJaxWS;
import com.qiutt.webservice.jaxws.client.wsimport.JaxWSImplService;

/**
 * 测试使用JAX-WS调用webservice
 * @author Administrator
 *
 */
public class TestWebserviceByWSImport {
	public static void main(String[] args) {
		 IJaxWS test = new JaxWSImplService().getJaxWSImplPort();
		 System.out.println(test.byJaxWS("我来测试啦"));
		 System.out.println(test.byJaxWS1("我又来测试啦"));
	}
   
}
