import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class testFuture {
	
	public static void main(String[] args) throws Exception, ExecutionException {
		 ExecutorService laodaA = Executors.newFixedThreadPool(7);
		 	Future<Object> f=laodaA.submit(
			         new Callable<Object>()  {
			             public String call() throws Exception
			             {
			                 return "success!";
			         } });
			System.out.println(f.get());
	}
}
