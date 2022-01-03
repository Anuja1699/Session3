package sample;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class iteration
{
	
	public static void main(String[]args)
	{
		Map<Integer,String>hash_map = new HashMap<Integer,String>();
		
		hash_map.put(1, "Anuja");
		hash_map.put(2,"Anu");
		
		Iterator<Entry<Integer,String>>it = hash_map.entrySet().iterator();
//	while(it.hasNext())
//		{
//			Map.Entry<Integer,String>Set =( Map.Entry<Integer,String>)it.next();
//			System.out.println(Set.getKey()+" = "+ Set.getValue());
//		}
		hash_map.forEach((key,value)->System.out.println(key+"="+value));
		
		
	}
	

}
