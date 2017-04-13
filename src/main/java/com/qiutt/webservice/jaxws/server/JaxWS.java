package com.qiutt.webservice.jaxws.server;

import javax.xml.ws.Endpoint;

/**
 * 使用JDK1.6后自带的JAX-WS来实现webservice。接口发布类
 * @author Administrator
 *
 */
public class JaxWS {
	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:8080/services/IJaxWS", new JaxWSImpl());
			System.out.println("使用JDK1.6后自带的JAX-WS来实现webservice发布成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("使用JDK1.6后自带的JAX-WS来实现webservice发布失败！");
		}
		
	}
}
