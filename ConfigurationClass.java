package Session;
import org.springframework.context.annotation.*;
@Configuration
public class ConfigurationClass {
	
	
	@Bean
	public Shopping shopping()
	{
	return new Shopping(12345,"SBI");
	}
	@Bean
	public Item item()
	{
	return new Item("IceCream",100);
	}
	}

