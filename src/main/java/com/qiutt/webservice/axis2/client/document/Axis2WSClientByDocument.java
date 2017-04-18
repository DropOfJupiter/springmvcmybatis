package com.qiutt.webservice.axis2.client.document;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

/**
 * 使用document方式调用AXIS2发布的webservice
 * 
 * @author Administrator
 *
 */
public class Axis2WSClientByDocument {
	public static void main(String[] args) {
		Options options = new Options();
		// 指定调用WebService的URL
		try {
			 ServiceClient sc = new ServiceClient();     
             Options opts = new Options();     
             String url = "http://localhost:8080/springmvcmybatis/services/axis2WS?wsdl";    
             //确定目标服务地址     
             opts.setTo(new EndpointReference(url));     
             //确定调用方法     
             //opts.setAction("http://WebXml.com.cn/getWeatherbyCityName");     
             OMFactory fac = OMAbstractFactory.getOMFactory();     
             //指定命名空间     
             OMNamespace omNs = fac.createOMNamespace("http://server.axis2.webservice.qiutt.com", "");     
             //指定方法     
             OMElement method = fac.createOMElement("byAxis2",omNs);     
             //指定方法的参数     
             OMElement value = fac.createOMElement("name",omNs);      
             value.setText("今天是2017.4.18 星期二");      
             method.addChild(value);      
             //OMElement value1 = fac.createOMElement("value",omNs);     
             //value1.setText("2");     
            //method.addChild(value1);     
             sc.setOptions(opts);     
             //发送请求并并得到返回结果，注意参数生成方法的分析     
             OMElement res = sc.sendReceive(method);     
             System.out.println("使用document方式调用AXIS2发布的webservice:"+res);    
             //值得注意的是，返回结果就是一段由OMElement对象封装的xml字符串。     
             //我们可以对之灵活应用,下面我取第一个元素值，并打印之。因为调用的方法返回一个结果     
             res.getFirstElement().getText();     
             System.out.println("使用document方式调用AXIS2发布的webservice:"+res.getFirstElement().getText());

		} catch (AxisFault axisFault) {
			axisFault.printStackTrace();
		}
	}
}
