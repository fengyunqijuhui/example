package thread;

import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadPool {
	

	public static void main(String[] args) {
		
		ThreadFactory factory = Executors.defaultThreadFactory();
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService = Executors.newCachedThreadPool();
		
		final int a = 10;

		Runnable runnable = new Runnable() {
			
	
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + a);
			}
		};
		
		for (int i = 0; i < 50; i++) {
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}

}

