package sample;

public class mainClass {
	public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.getCarName());
        System.out.println(c1.getPrice());
        System.out.println(c1.getMileage());
        System.out.println(c1.getWeight());
        
        Car c2 = new Car();
        c2.setCarName("swift");
        c2.setPrice(100000);
        c2.setMileage(50.8f);
        c2.setweight(2343.0);
        
        System.out.println(c2.getCarName());
        System.out.println(c2.getPrice());
        System.out.println(c2.getMileage());
        System.out.println(c2.getWeight());
        
	}

}
