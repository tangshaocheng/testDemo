package TestDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCachedThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			executorService.execute(new TestRunnable());
			System.out.println("********* a "+i+"************");
		}
		executorService.shutdown();
	}
}
class TestRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"被调用了");
	}
	
}