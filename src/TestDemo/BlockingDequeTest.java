package TestDemo;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeTest {
	public static void main(String[] args) throws InterruptedException {
		BlockingDeque bd = new LinkedBlockingDeque<String>(20);
		for (int i = 0; i < 30; i++) {
			bd.put("" + i);
			System.out.println("向阻塞栈中添加了元素:" + i);
			if (i > 18) {
				System.out.println("从阻塞栈中移出了元素：" + bd.pollFirst());
			}
		}
		System.out.println("程序到此运行结束，即将退出----");
	}
}
