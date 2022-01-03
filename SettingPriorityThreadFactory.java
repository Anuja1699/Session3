package threads;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
public class SettingPriorityThreadFactory implements ThreadFactory{
	
	

	
		private static int priority ;
		private static int count=0;
		private static String name="thread";
		

		@Override
		public Thread newThread(Runnable r)
		{
		
			Thread t = new Thread(r, name+ ++count);

			return t;
		}
		public SettingPriorityThreadFactory()
		{
			this.setPriority(5);
			this.setPriority(2);
		}
		public static int getPriority() {
			return priority;
		}
		public static void setPriority(int priority) {
			SettingPriorityThreadFactory.priority = priority;
		}
}
