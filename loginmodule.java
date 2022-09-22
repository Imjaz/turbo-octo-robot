package zoho;
import java.util.Scanner;
public class loginmodule {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("1.Admin");
	System.out.println("2.User");
	switch(n) {
	case 1:
	Admin.signup();
	break;
	case 2:
	User.signup();
	break;
	default:
		System.out.println("wrong choice");
	}}
public class Admin{
	public static void signup() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=s.nextLine();
		System.out.println("enter password");
		String pass=s.nextLine();
		char[]ch=pass.toCharArray();
		String pass1=null;
		for(int i=0;i<pass.length();i++) {
			if(pass.length()>8&ch[i]>=65||ch[i]<=90&&ch[i]==42&&ch[i]==64) {
				System.out.println("confirm password");
			pass1=s.nextLine();
			break;
			}
			else {
				System.out.println("enter a valid password!....");
				Admin.signup();
				break;
			}}
		if(pass.equals(pass1)) {
			System.out.println("signed up successfully");
			System.out.println("do you want to signin");
			System.out.println("1.yes");
			System.out.println("2.No");
			int in=s.nextInt();
			switch(in) {
			case 1:
				Admin.signin(name,pass);
			break;
			case 2:
				System.out.println("Thank you for joining with us");
			break;
			default :
				System.out.println("wrong choice");
			}}
			else {
				System.out.println(" incorrect password!... ");
				Admin.signup();
			}
	}
			
			public static void signin(String name,String pass1) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter username:");
				String signinside=s.nextLine();
				System.out.println("enter the password");
				String signinpass=s.nextLine();
				if(signinside.equals(name)&&signinpass.equals(pass1)) {
					System.out.println("Admin signedin successfully....");}
				else {
					System.out.println("check the username and password");
					Admin.signin(name,pass1);
				}
				
			}
		}
		
		public class User{
			public static void signup() {
				Scanner s=new Scanner(System.in);
				System.out.println("enter your name:");
				String name=s.nextLine();
				System.out.println("enter password");
				String pass=s.nextLine();
				char[]ch=pass.toCharArray();
				String pass1=null;
				for(int i=0;i<pass.length();i++) {
					if(pass.length()>8&ch[i]>=65||ch[i]<=90&&ch[i]==42&&ch[i]==64) {
						System.out.println("confirm password");
					pass1=s.nextLine();
					break;
					}
					else {
						System.out.println("enter a valid password!....");
						User.signup();
						break;
					}}
				if(pass.equals(pass1)) {
					System.out.println("signed up successfully");
					System.out.println("do you want to signin");
					System.out.println("1.yes");
					System.out.println("2.No");
					int in=s.nextInt();
					switch(in) {
					case 1:
						User.signin(name,pass);
					break;
					case 2:
						System.out.println("Thank you for joining with us");
					break;
					default :
						System.out.println("wrong choice");
					}}
					else {
						System.out.println(" incorrect password!... ");
						User.signup();
					}}
					public static void signin(String name,String pass1) {
						Scanner s=new Scanner(System.in);
						System.out.println("enter username:");
						String signinside=s.nextLine();
						System.out.println("enter the password");
						String signinpass=s.nextLine();
						if(signinside.equals(name)&&signinpass.equals(pass1)) 
							System.out.println("welcome");
						else {
							System.out.println("check the username and password");
							User.signin(name,pass1);
										}}}}
	
	
	
