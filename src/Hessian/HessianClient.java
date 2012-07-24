package Hessian;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianClient {

	public static void main(String[] args) {
		String url = "http://localhost:8080/gameserverweb/Hello";
		HessianProxyFactory factory = new HessianProxyFactory(); 
		try {
			IHello hello =(IHello)factory.create(IHello.class,url);
			hello.sayHello("test");
			} catch (MalformedURLException e) {
			e.printStackTrace();
			} 
		
	}
}
