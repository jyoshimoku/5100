package hw8;
import java.util.Random;
import java.util.Scanner;
public class Email {
	private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String firstName, lastName;
    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    }

    // Ask for the department
    private String SetDepartment() {
    	String info= "";
		Scanner scanner= new Scanner(System.in);
		String line= scanner.nextLine();
		if (line.equals("0")) {
			info+="DISPLAY NAME: "+firstName+" "+lastName+"\r";
			info+="DEPARTMENT: none\r";
			info+="COMPANY EMAIL: "+firstName+"."+lastName+"@ .aeycompany.com";
		}
		if (line.equals("1")) {
			info+="DISPLAY NAME: "+firstName+" "+lastName+"\r";
			info+="DEPARTMENT: sal\r";
			info+="COMPANY EMAIL: "+firstName+"."+lastName+"@sal.aeycompany.com";
		}
		
		if (line.equals("2")) {
			info+="DISPLAY NAME: "+firstName+" "+lastName+"\r";
			info+="DEPARTMENT: dev\r";
			info+="COMPANY EMAIL: "+firstName+"."+lastName+"@dev.aeycompany.com";
		}
		
		if (line.equals("3")) {
			info+="DISPLAY NAME: "+firstName+" "+lastName+"\r";
			info+="DEPARTMENT: acc\r";
			info+="COMPANY EMAIL: "+firstName+"."+lastName+"@acc.aeycompany.com";
		}
    	return info;
    }

    // Generate a random password
    private String randomPassword(int length) {
    	String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789£¡@££$£¥";
		  Random random1=new Random();
		  String s=new String();
		  for (int i = 0; i < length; i++) {
			  int number=random1.nextInt(str.length());   
			  char charAt = str.charAt(number);
		      s+=charAt;
		  }
		  return s;
	}
    

	public String showInfo() {
		String info="New Worker: "+firstName+" "+lastName+"Department Codes:\r";
		info+="1 for Sales\r";
		info+="2 for Development\r";
		info+="3 for Accounting\r";
		info+="0 for none\r";
		info+="Enter department code:\r";
		System.out.println(info);
		String info1= this.SetDepartment()+"\r";
		info1+="PASSWORD: "+this.randomPassword(this.defaultPasswordLength)+"\r";
		info1+="MAILBOX CAPACITY: "+this.mailboxCapacity+"\r";
		return info1;
	}

}
