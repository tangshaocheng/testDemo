package TestDemo;

public class PendingInterrupt extends Object {
	public static void main(String[] args) {
		if (args.length > 0) {
			Thread.currentThread().interrupt();
		}
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
			System.out.println("not interrupted");
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println("endTime="
				+ (System.currentTimeMillis() - startTime));
	}
}
