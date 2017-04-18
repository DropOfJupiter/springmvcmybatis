package com.qiutt.webservice.axis2.client.rpc;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

/**
 * 使用RPC方式调用AXIS2发布的webservice
 * @author Administrator
 *
 */
public class Axis2WSClientByRpc {
	public static void main(String[] args) {
		RPCServiceClient serviceClient = null;
		try {
			serviceClient = new RPCServiceClient();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//指定调用webservice的URL
		EndpointReference targetEPR = new EndpointReference(
                "http://localhost:8080/springmvcmybatis/services/axis2WS?wsdl");
		Options options = serviceClient.getOptions();	
		//确定目标服务地址
		options.setTo(targetEPR);
		QName opName = new QName("http://server.axis2.webservice.qiutt.com", "byAxis2");
		Object[] parameters = new Object[] {"邱恬恬"};
		// 指定getPrice方法返回值的数据类型的Class对象  
	     Class[] returnTypes = new Class[] { String.class }; 
		try {
			Object[] response = serviceClient.invokeBlocking(opName, parameters,returnTypes);
			String result=(String) response[0];
			System.out.println("使用RPC方式调用AXIS2发布的webservice返回的结果是："+result); 
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
