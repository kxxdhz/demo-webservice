package com.demo.webservice.server;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * WebService 服务端
 * @author lvpeng
 * @date 2017年8月28日 上午11:52:42
 */
@WebService
public class HelloService {

	/**
	 * 供客戶端调用的方法
	 * @param name
	 * @return
	 */
	public String getValue(String name){
		return "hello：" + name;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/server/helloService", new HelloService());
		System.out.println("service start");
	}
	
}
