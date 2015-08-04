package TestDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	public static void main(String[] args) {
		ExecutorService exe = Executors.newCachedThreadPool();
		final Semaphore se = new Semaphore(5);
		for(int i=0;i<10;i++){
			final int num=i;
			Runnable r=new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						se.acquire();
						System.out.println("线程" +   
		                        Thread.currentThread().getName() + "获得许可："  + num);
						for (int i = 0; i < 999999; i++) ;  
	                    //释放许可  
	                    se.release();  
	                    System.out.println("线程" +   
	                        Thread.currentThread().getName() + "释放许可："  + num);  
	                    System.out.println("当前允许进入的任务个数：" +  
	                        se.availablePermits());  
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			};
			exe.execute(r);  
		}
		exe.shutdown();
	}
}
