package com.qiutt.webservice.jaxws.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
/**
 * 使用JDK1.6后自带的JAX-WS来实现webservice。接口实现类
 * @author Administrator
 *
 */
@WebService(endpointInterface="com.qiutt.webservice.jaxws.server.IJaxWs")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class JaxWSImpl implements IJaxWs {

	@Override
	public String byJaxWS(String name) {
		return name+" this is a webservice's method named byJaxWS  by JAX-WS";
	}

	@Override
	public String byJaxWS1(String name) {
		return name+" this is a webservice's method named byJaxWS1 by JAX-WS";
	}

}
