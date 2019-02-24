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
		
		//name validation
		 String empName= "^[a-zA-Z ]+$";   
	        String Name;
	   
	        do {
	            System.out.print("Enter your Name:");
	            Name= sc.nextLine();
	            u.getName();

	            if (Name.matches(empName))
	                System.out.println("Welcome"+" "+Name);
	            else if (Name.isEmpty())
	                System.out.println("String field should not be Empty.");
	            else if(!Name.matches(empName))
	            System.out.println("Please Enter A Valid String!");
	        } while(!Name.matches(empName));
	

		
		 //date of birth validation
	
	        String dob= "MM/dd/yyyy";   
		    String empdob;
		  
		       do {
		           System.out.print("Enter the date of birth");
		         empdob= sc.nextLine();
		         u.getDob();
		          

		           if (empdob.matches(dob))
		               System.out.println("Done");
		           else if (empdob.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!empdob.matches(dob))
		           System.out.println("Please Enter A Valid String!");
		       } while(!empdob.matches(dob));
	        
	        
	        
	        
	        
	//address validation
		 String Address= "^[a-zA-Z0-9]+$";   
		    String empAdd;
		  
		       do {
		           System.out.print("Enter the address");
		         empAdd= sc.nextLine();
		           //u.getAddress();

		           if (empAdd.matches(Address))
		               System.out.println("Done");
		           else if (empAdd.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!empAdd.matches(Address))
		           System.out.println("Please Enter A Valid String!");
		       } while(!empAdd.matches(Address));

		//qualification validation
		       
		       String Qualification= "^[a-zA-Z ]+$";
		       String empQua;
		  
		       do {
		           System.out.print("Enter Qualification:");
		           empQua= sc.nextLine();
		           u.getQualification();

		           if (empQua.matches(Qualification))
		               System.out.println("Done");
		           else if (empQua.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!empQua.matches(Qualification))
		           System.out.println("Please Enter A Valid String!");
		       } while(!empQua.matches(Qualification));
	//email validation
		       String emailId= "^[a-zA-Z0-9_+&*-]+(?:\\."+  "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$"; 
	           String empemail;
		  
		       do {
		           System.out.print("Enter email Id:");
		           empemail= sc.nextLine();
		           if (empemail.matches(emailId))
		               System.out.println("Done");
		           else if (empemail.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!empemail.matches(emailId))
		           System.out.println("Please Enter A Valid String!");
		       } while(!empemail.matches(emailId));
		
//contact number
		       
		       String contactnumber= "(0/91)?[7-9][0-9]{9}"; 
		       String empno;
		       u.getContactnumber();

		       do {
		           System.out.print("Enter contact number:");
		           empno= sc.nextLine();
		           if (empno.matches(contactnumber))
		               System.out.println("Done");
		           else if (empno.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!empno.matches(contactnumber))
		           System.out.println("Please Enter A Valid String!");
		       } while(!empno.matches(contactnumber));
		       
		       //Dept validation
		       String Department= "^[a-zA-Z ]+$";
		       String Dept;
		       u.getDepartment();

		       do {
		           System.out.print("Enter your Department:");
		           Dept= sc.nextLine();
		           u.getDepartment();

		           if (Dept.matches(Department))
		               System.out.println("Done");
		           else if (Dept.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!Dept.matches( Department))
		           System.out.println("Please Enter A Valid String!");
		       } while(!Dept.matches( Department));
		       //supervissier
		       String Supervicer= "^[a-zA-Z ]+$";
		       String Sup;
		       
		       do {
		           System.out.print("Enter your Supervicer:");
		           Sup= sc.nextLine();
		           u.getDepartment();

		           if (Sup.matches(Supervicer))
		               System.out.println("Done");
		           else if (Sup.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!Sup.matches( Supervicer))
		           System.out.println("Please Enter A Valid String!");
		       } while(!Sup.matches(Supervicer));
		           
	}
}
		
		
		
		
		/*System.out.println("enter Employee Contact Number");
		String contactnumber=sc.next();
		u.getContactnumber();
		System.out.println("Enter the Department");
		String Department=sc.next();
		
		System.out.println("enter the supervicer");
        String supervicer=sc.next();
        u.getSupervicer();
        UsersBussinesslogic  ub=new UsersBussinesslogic();
    	ub.validateUser(name);
    	ub.registerUser(u);
    	ub.ListEmployees(u);
	
    	}while(ch='y');*/
    	
