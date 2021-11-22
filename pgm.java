package sample;
import java.util.*;
public class Car5 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	Car arr[]= new Car[5];
	System.out.println("enter the cars data");
	for(int i=0;i<arr.length;i++){
		arr[i]= new Car();
		System.out.print("Enter the car name: ");
		arr[i].setCarName(sc.next());
		System.out.println("");
		System.out.print("Enter the car price:");
		arr[i].setPrice(sc.nextInt());
		System.out.println("");
		}
	
	}
	}
