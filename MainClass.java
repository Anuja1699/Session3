package Session;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args)
	{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.register(ConfigurationClass.class);
	context.refresh();
	Shopping shopping = (Shopping) context.getBean(Shopping.class);
	System.out.println(shopping);
	Item item = (Item) context.getBean(Item.class);
	System.out.println(item);
	((ConfigurableApplicationContext)context).close();



	}
	}

