import java.util.*;
class payroll
{ 
	public static void main(String arg[]) throws java.io.IOException	
	{   
			char choice;
		    String name;
			Scanner s1=new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			int bsal,hra,ta,med,gpay,da,sp,pt=200,ltc,nsal,id;
			System.out.println("\t\t\t\t\t\tWelcome To Payroll System\t\t\t\t\t\t");
			System.out.println("1.Goverment Employee");
			System.out.println("2.Private Employee");
			System.out.println("Enter your choice:");
			choice=(char)System.in.read();
			switch(choice)
			{
				case '1':System.out.println("Enter your name:");
						 //String s2;
						 name=s1.next();
						 System.out.println("Enter your Id:");
						 id=s1.nextInt();
						 System.out.println("Enter your Basic Salary per month:");
						 bsal=s1.nextInt();
						 ta=(bsal*2)/100;
						 da=(bsal*2)/100;
						 hra=(bsal*5)/100;
						 sp=(bsal*3)/100;
						 med=(bsal*5)/100;
						 gpay=(bsal*7)/100;
						 nsal=bsal+ta+da+hra+sp+med+gpay-200;
						 System.out.println("\t\t\t\t\t\tDetails\t\t\t\t\t\t");
						 System.out.println("Employee name:"+name);
						 System.out.println("Employee id:"+id);
						 System.out.println("Basic salary:"+bsal);
						 System.out.println("Travaelling allowance:"+ta);
						 System.out.println("Dearness allowance:"+da);
						 System.out.println("House rent allowance:"+hra);
						 System.out.println("Special allowance:"+sp);
						 System.out.println("Mediacal allowance:"+med);
						 System.out.println("Gross pay:"+gpay);
						 System.out.println("YOUR FINAL NET SALARY IS:"+nsal);
						 break;
				case '2':System.out.println("Enter your name:");
						 //String s3=new String();
						 name=s1.next();
						 System.out.println("Enter your Id:");
						 id=s1.nextInt();
						 System.out.println("Enter your Basic Salary per month:");
						 bsal=s1.nextInt();
						 ta=(bsal*2)/100;
						 da=(bsal*2)/100;
						 hra=(bsal*5)/100;
						 sp=(bsal*3)/100;
						 med=(bsal*5)/100;
						 gpay=(bsal*7)/100;
						 nsal=bsal+ta+da+hra+sp+med+gpay-200;
						 System.out.println("\t\t\t\t\t\tDetails\t\t\t\t\t\t");
						 System.out.println("Employee name:"+name);
						 System.out.println("Employee id:"+id);
						 System.out.println("Basic salary:"+bsal);
						 System.out.println("Travaelling allowance:"+ta);
						 System.out.println("Dearness allowance:"+da);
						 System.out.println("House rent allowance:"+hra);
						 System.out.println("Special allowance:"+sp);
						 System.out.println("Mediacal allowance:"+med);
						 System.out.println("Gross pay:"+gpay);
						 System.out.println("YOUR FINAL NET SALARY IS:"+nsal);
						 break;
				default:System.out.println("You have entered wrong choice");
						break;
			}
		}
	
}