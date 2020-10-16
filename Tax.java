import java.util.Scanner;

public class Tax{
	public static void main(String[] args){
		String name,dob,mob,yob;
		double sal,tax;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the employee : ");
		name = sc.nextLine();
		System.out.println("Enter the birth date of the employee : ");
		dob = sc.nextLine();
		System.out.println("Enter the birth month of the employee : ");
		mob = sc.nextLine();
		System.out.println("Enter the birth year of the employee : ");
		yob = sc.nextLine();
		System.out.println("Enter the Salary of the employee in lakhs : ");
		sal = sc.nextDouble();
		
		System.out.println(" Name : "+name);
		System.out.println(" D.O.B "+dob+"/"+mob+"/"+yob);
		
		if (sal >= 5){
			tax = sal*100000 *0.2;
			System.out.println("Tax amount : "+tax);
		}
		if (sal >= 4 && sal<5){
			tax = sal*100000 *0.15;
			System.out.println("Tax amount : "+tax);
		}
		if (sal >= 3 && sal<4){
			tax = sal*100000 *0.1;
			System.out.println("Tax amount : "+tax);
		}
		if (sal <=2){
			tax = sal*100000 *0.05;
			System.out.println("Tax amount : "+tax);
		}
	}
}