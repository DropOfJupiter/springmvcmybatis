package com.qiutt.webservice.jaxws.client.eclipsewebserviceclient;

import java.rmi.RemoteException;

import com.qiutt.webservice.jaxws.client.wsimport.IJaxWS;
import com.qiutt.webservice.jaxws.client.wsimport.JaxWSImplService;

/**
 * 测试使用JAX-WS调用webservice
 * @author Administrator
 *
 */
public class TestWebserviceByEclipseWSClient {
	public static void main(String[] args) {
		 IJaxWSProxy test = new IJaxWSProxy();
		 try {
			System.out.println(test.byJaxWS("我来测试啦"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			System.out.println(test.byJaxWS1("我又来测试啦"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
}
