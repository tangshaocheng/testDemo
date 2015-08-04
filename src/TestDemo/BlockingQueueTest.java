package TestDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(20);
		for (int i = 0; i < 30; i++) {
			bq.put("加入元素" + i);
			System.out.println("向阻塞队列中添加了元素:" + i);
			if (i > 18) {
				System.out.println("从阻塞队列中移除元素：" + bq.take());
			}
		}
		System.out.println("程序到此运行结束，即将退出----");
	}
}
