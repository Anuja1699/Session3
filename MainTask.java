package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainTask {
	

		public static void main(String[] args)
		{
		
		 ExecutorService executorService = Executors.newFixedThreadPool(3);
		// ExecutorService executorService1 = Executors.newFixedThreadPool(3);
		 long startTime = System.nanoTime();
		 Future<Integer> result11 = executorService.submit(new CalculationTaskC());
		 Future<Integer> result12 = executorService.submit(new CalculationTaskC());
		 Future<Integer> result13 = executorService.submit(new CalculationTaskC());

//		for(int i=1;i<100;i++)
//		{
//		for(int j=3*i;j<100;j++){


		// Future<Integer> result2 = executorService1.submit(new CalculationTaskC());
		// Future<Integer> result3 = executorService1.submit(new CalculationTaskC());
		// Future<Integer> result4 = executorService1.submit(new CalculationTaskC());
		// Future<Integer> result5 = executorService1.submit(new CalculationTaskC());
		// Future<Integer> result6 = executorService1.submit(new CalculationTaskC());




		 executorService.shutdown();
		try
		{

		 System.out.println("result11_" +result11.get());
		 System.out.println("result12_" +result12.get());
		 System.out.println("result13_" +result13.get());
		}

		catch(Exception e)
		{
		e.printStackTrace();
		}
		long elapsedTime = System.nanoTime()-startTime;
		
		double millisecond = ((elapsedTime/3)/1000);// 403 millisec

		System.out.println("Time taken in millisecond to execute all the tasks " +millisecond);
		}
}
