package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReferenceObject {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}

class TestClass{
	int testVar;
	public TestClass test(int value){
		
		TestClass class1 = new TestClass();
		class1.testVar = value;
		return class1;
	}
}
