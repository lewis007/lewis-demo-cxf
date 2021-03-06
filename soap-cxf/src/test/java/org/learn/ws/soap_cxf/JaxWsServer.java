package org.learn.ws.soap_cxf;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.learn.ws.soap_cxf.HelloServiceImpl;

/**
 * 基于JAX-WS的方式发布WS
 * 
 * @author lewis007
 * @since 0.1.0
 */
public class JaxWsServer {

	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setAddress("http://localhost:8080/ws/soap/hello");
		factory.setServiceClass(HelloService.class);
		factory.setServiceBean(new HelloServiceImpl());
		factory.create();
		System.out.println("soap ws is published");
	}

}
