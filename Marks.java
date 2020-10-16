import java.util.Scanner;

public class Marks{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float sub1,sub2,sub3,sub4,sub5,sum,per;
	
	System.out.println("Enter the marks of sub1 out of 100 : ");
	sub1 = sc.nextFloat();
	System.out.println("Enter the marks of sub2 out of 100: ");
	sub2 = sc.nextFloat();
	System.out.println("Enter the marks of sub3 out of 100: ");
	sub3 = sc.nextFloat();
	System.out.println("Enter the marks of sub4 out of 100: ");
	sub4 = sc.nextFloat();
	System.out.println("Enter the marks of sub5 out of 100: ");
	sub5 = sc.nextFloat();
	
	sum = sub1 + sub2 + sub3 +sub4 + sub5 ;
	
	per = (sum/500)*100;
	System.out.println("Percentage = "+per);
	
	if(per<=100 && per>=80){
	System.out.println(" O Grade ");
	}
	if(per<80 && per>75){
	System.out.println(" A Grade ");
	}
	if(per<75 && per>=65){
	System.out.println(" B Grade ");
	}
	if(per<65 && per>=55){
	System.out.println(" C Grade ");
	}
	if(per<55 && per>=45){
	System.out.println(" D Grade ");
	}
	if(per<45 && per>=35){
	System.out.println(" E Grade ");
	}
	if(per<35){
	System.out.println(" F Grade ");
	}
}
}

