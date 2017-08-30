package com.demo.webservice.client;

import com.demo.webservice.client.ws.HelloService;
import com.demo.webservice.client.ws.HelloServiceService;
/**
 * WebService 客户端
 * 使用命令生产客户端文件（D:\springworkspace\demo-webservice\src\main\java>wsimport -p com.demo.webservice.client.ws -keep http://localhost:8888/server/helloService?wsdl）
 * （wsimport -s D:\\springworkspace\\demo-webservice\\src\\main\\java -p com.demo.webservice.client.ws -keep http://localhost:8888/server/helloService?wsdl）
 * @author lvpeng
 * @date 2017年8月28日 上午11:53:21
 */
public class HelloClient {

	public static void main(String[] args) {
		HelloService helloService=new HelloServiceService().getHelloServicePort();
		String result=helloService.getValue("lvpeng");
		System.out.println(result);
	}
	
}
