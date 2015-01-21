import java.util.Scanner;
public class quiz {
	public static void main(String [] args)
	{
		String name, password;
		int numberOfStudents;
		Scanner keyboard = new Scanner (System.in) ; 

	
			System.out.println("Please enter Name");

			name =keyboard.next() ;
			System.out.println("Please enter Passward");
			password =keyboard.next() ;
			System.out.println("Hello " + name + " welcome to Csc 201 your password is "
					+ password );
		}
		
	}