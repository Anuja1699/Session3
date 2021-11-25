public class Occurance {

	public static void main(String[] args) {
		int num, x, count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array");
		num = sc.nextInt();
		int a[]= new int[num];
		System.out.println("Enter all numbers that are occurence");
		for(int i=0;i<num;i++)
		{
		a[i]= sc.nextInt();
		}
		System.out.println("Enter the elements");




		x = sc.nextInt();
		for(int i=0; i<num; i++)
		{
		if(a[i] == x);
		{
		count++;
		}
		System.out.println("Number of occurence of the element: " +count );
		}
		}

	}
