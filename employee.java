import java.util.Scanner;

public class employee{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

String name,city;
int age;

System.out.println("Enter the name of the employee");
name = sc.nextLine();

System.out.println("Enter the city of the employee");
city = sc.nextLine();

System.out.println("Enter the age of the employee");
age = sc.nextInt();
display(name,city,age);
}
public static void display(String name, String city, int age){
System.out.println("Name :- "+name);
System.out.println("City :- "+city);
System.out.println("Age :- "+age);
}
}