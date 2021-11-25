public class Maximum {
public static int getMaximum(int arr[])
{
int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	
	return arr[0];
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {50,400,100,30,80};
System.out.println(getMaximum(ar));
}

}
