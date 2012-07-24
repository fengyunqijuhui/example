package thread;

public class TestSynObject {

	public static void main(String[] args) {
		TestObject test1 = new TestObject();
		TestObject test2 = new TestObject();
		
		RunThread runThread1 = new RunThread(test1);
		RunThread runThread2 = new RunThread(test1);
		
		Thread thread1 = new Thread(runThread1);
		Thread thread2 = new Thread(runThread2);
		
		thread1.start();
		thread2.start();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(TestObject.value);
	}
}

class RunThread implements Runnable{
	
	TestObject test;
	public RunThread(TestObject test){
		this.test = test;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			test.getAddValue();
			//System.out.println(Thread.currentThread().getName());
		}
		
	}
}

class TestObject {
	public static int value = 0;
	
	public synchronized int getAddValue(){
		//System.out.println(Thread.currentThread().getName());
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		value = value + 10;
		//System.out.println(Thread.currentThread().getName());
		return value;
	}
}