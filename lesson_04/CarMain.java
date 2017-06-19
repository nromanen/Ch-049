package lesson_04;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {		
		
		
		Car car1 = new Car("BMW", 2004, 3.0);
		Car car2 = new Car("Volvo", 2001, 2.4);
		Car car3 = new Car("Mazda", 2011, 1.8);
		Car car4 = new Car("Audi", 1998, 2.6);
		
		Car cars[] = {car1, car2, car3, car4};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of production:");
		int y = sc.nextInt();
		sc.close();
		
		int count = 0;
		for(int i = 0; i < cars.length; i++){
			if(y == cars[i].getYear()){
				System.out.println(cars[i]);
				count++;				
				continue;				
				}
			}if (count == 0){
				System.out.println("This car does not exist");
			}
			Car car = new Car();
			for (int i = 0; i < cars.length - 1; i++) {
				for (int j = i + 1; j < cars.length; j++) {
					if (cars[i].getYear() < cars[j].getYear()) {
						car = cars[i];
						cars[i] = cars[j];
						cars[j] = car;
					}
				}
			}
			System.out.println();
			for (int i = 0; i < cars.length; i++) {
				System.out.println(cars[i]);
			}

		}
	}
			
		
	
