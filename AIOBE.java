package sample;
import java.util.*;
import java.util.Arrays;
public class AIOBE {
public static void main(String[]args) {
	int[]Array = {65,84,209,234,387};
	System.out.println("Elements in the array are:");
	System.out.println(Arrays.toString(Array));
	Scanner sc =new Scanner(System.in);
System.out.println("enter the index of given elements:");	

try {
	int elements =sc.nextInt();
 System.out.println("enter the given index is:"+Array[elements]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("The index you have entered is invalid\n"+
   "Please enter an index number between 0 and 4");
 }
}
}
