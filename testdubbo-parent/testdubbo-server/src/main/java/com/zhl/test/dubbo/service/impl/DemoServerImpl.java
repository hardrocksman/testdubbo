/**
 * 
 */
package com.zhl.test.dubbo.service.impl;

import java.util.Date;

import com.zhl.test.dubbo.core.service.DemoServer;


public class DemoServerImpl implements DemoServer {

	public String sayHello(String str) {
		str = "Hello " + str + "  2:" + new Date();
		System.err.println("server:" + str);
		return str;
	}

}
