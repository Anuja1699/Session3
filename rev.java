public class Rev {

	public static void main(String[] args) {
		int [] arr = new int [] {6,2,3,5,4};
		Scanner sc= new Scanner(System.in);
		  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	         
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	    }  
	
	}