package com.qiutt.webservice.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.qiutt.webservice.jaxws.server.IJaxWs;

/**
 * 自定义客户端编码方式
 * @author Administrator
 *
 */
public class JaxWSClient {
	public static void main(String[] args) {
		URL wsdlUrl = null;
		try {
			wsdlUrl = new URL("http://localhost:8080/springmvcmybatis/services/IJaxWS?wsdl");
			Service service = Service.create(wsdlUrl, 
					new QName("http://server.jaxws.webservice.qiutt.com/","JaxWSImplService"));  
		     IJaxWs test = service.getPort(
		    		 new QName("http://server.jaxws.webservice.qiutt.com/","JaxWSImplPort"), IJaxWs.class);  
		     System.out.println(test.byJaxWS("我是恬恬")); 
		     System.out.println(test.byJaxWS1("今天星期五")); 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	     
	}	  
}
