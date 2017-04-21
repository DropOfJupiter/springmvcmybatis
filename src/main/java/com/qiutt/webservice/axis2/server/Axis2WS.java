package com.qiutt.webservice.axis2.server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 使用AXIS2来实现webservice
 * 
 * @author Administrator
 *
 */
public class Axis2WS {
	//推荐使用commons-logging结合log4j进行日志记录
	private static Log logger = LogFactory.getLog(Axis2WS.class);
	public String byAxis2(String name) {
		logger.error("Error:进入byAxis2方法啦");
		logger.warn("Warn:进入byAxis2方法啦");
		logger.info("Info:进入byAxis2方法啦");
		logger.debug("Debug:进入byAxis2方法啦");
		return name + "this is byAxis2";
	}

	public String getHelloWorld() {
		return "Hello,World";
	}
}
