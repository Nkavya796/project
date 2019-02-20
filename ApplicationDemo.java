import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplicationDemo {
	public static void main(String[] args) {
		Users u=new Users();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter id");
	    int	empId=sc.nextInt();
		u.getEmpId();
		
		  
		System.out.println("Enter Name");
		String name=sc.next();
		u.getName();
		Pattern p1=Pattern.compile("[a-zA-Z]");
		Matcher m1=p1.matcher(name);
		while(m1.find())
		{
			System.out.println("Found:"+m1.group());
		
		}
		System.out.println("Enter Date of Birth");
		DateFormat formatter = new SimpleDateFormat("d-MMM-yyyy");
		u.getDob();
		System.out.println("Enter Employee Address");
		String Address=sc.next();
		u.getAddress();
		System.out.println("Enter employee Qualification");
		String Qualification=sc.next();
		u.getQualification();
		System.out.println("Enter Email Id");
		String emailID=sc.next();
		u.getEmailid();
		System.out.println("enter Employee Contact Number");
		String contactnumber=sc.next();
		u.getContactnumber();
		System.out.println("Enter the Department");
		String Department=sc.next();
		u.getDepartment();
		System.out.println("enter the supervicer");
        String supervicer=sc.next();
        u.getSupervicer();
        UsersBussinesslogic  ub=new UsersBussinesslogic();
    	//ub.validate(name);
    	ub.registerUser(u);
    	ub.ListEmployees(u);
	
    	}while(ch='y');
    	}
}