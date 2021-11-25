
public class SumOfNum {
 public static void main(String[]args)  
 {
	 int number,sum = 0,digit;
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the number:");
	 number= sc.nextInt();
	 for(sum=0;number!=0;number=number/10)
	 {
		 sum=sum+number%10;
		 
	 }
	 System.out.println("Sum of digits:" +sum); 
	 
 }
}