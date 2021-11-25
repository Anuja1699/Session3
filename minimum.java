public class Minimum {
public static int getMinimum(int arr[])
{
	int num=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				num=arr[i];
				arr[i]=arr[j];
				arr[j]=num;
			}
		}
	}
	return arr[0];
	
}
	public static void main(String[] args) {

int ar[]= {30,40,20,50,80};
System.out.println(getMinimum(ar));
		
	}	
	}
		