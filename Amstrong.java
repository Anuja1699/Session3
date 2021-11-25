public class Armstrong {
public static void main(String[]args) 
{
	int number,reverse=0,rem;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	number= sc.nextInt();
	int temp=number;
	while(number>0) {

	rem=number%10;
	number=number/10;
	reverse=reverse+(rem*rem*rem);
	
	}
	if(temp==reverse)
	System.out.println(temp+"number is Amstrong");
	else
	{
		System.out.println(temp+"Is not Amstrong");
}

	
}
}
