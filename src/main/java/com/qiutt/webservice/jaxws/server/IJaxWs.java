package com.qiutt.webservice.jaxws.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
/**
 * 使用JDK1.6后自带的JAX-WS来实现webservice。接口类
 * @author Administrator
 *
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IJaxWs {

	public String byJaxWS(String name);

	public String byJaxWS1(String name);

}
