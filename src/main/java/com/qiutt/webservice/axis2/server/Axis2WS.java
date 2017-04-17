package com.qiutt.webservice.axis2.server;

/**
 * 使用AXIS2来实现webservice
 * 
 * @author Administrator
 *
 */
public class Axis2WS {
	public String byAxis2(String name) {
		return name + "this is byAxis2";
	}

	public String getHelloWorld() {
		return "Hello,World";
	}
}
