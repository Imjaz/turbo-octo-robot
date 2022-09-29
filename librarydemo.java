import java.util.*;
public class loginnew{
	static Scanner s=new Scanner(System.in);
	static String[]str=new String[100];
	static int count=0;
	
	public static void main(String[] args) {
		
		System.out.println("1.Admin");
		System.out.println("2.User");
                int n=s.nextInt();
                 
		switch(n) {
		case 1:
		login.signup();
		System.out.println("view for '1'");
		System.out.println("add for '2'");
		System.out.println("delete for '3'");
		System.out.println("update for '4'");
		int a=s.nextInt();
		switch(a){
		case 1:
			Admin.view();
			//Admin.add();
		}
		break;
		case 2:
		login.signup();
		break;
		default:
			System.out.println("wrong choice");
		}}
	public static class Admin{
		
		public static void view(){
			str[count++]="tamil";
			str[count++]="english";
			str[count++]="maths";
			str[count++]="science";
			str[count++]="social";
			for(int i=0;i<str.length;i++){
				if(str[i]!=null)
				System.out.println(str[i]);
			}
			System.out.println("enter pos+ve for add book");
			int r=s.nextInt();
			if(r!=0){
				Admin.add();
			}
			for(int i=0;i<str.length;i++){
				if(str[i]!=null){
					System.out.println(str[i]);
			}}}
		public static void add(){
			System.out.println("add books");
			int d=s.nextInt();
		
		for( int i=0;i<d;i++){		
			str[count++]=s.next();
		}
		for(int i=0;i<str.length;i++){
			if(str[i]!=null)
			System.out.println(str[i]);
		}
		
			Admin.view();
		}public static void update(){
			
		}public static void delete(){
			
		}
		
		
	}
	public static class user extends Admin{
		public static void view(){
			
		}
		public static void buy(){
			
		}
		
		
		
	}
	public static class login{
		public static void signup() {
			Scanner s=new Scanner(System.in);
			System.out.println("enter your name:");
			String name=s.nextLine();
			System.out.println("enter password");
			String pass=s.nextLine();
			char[]ch=pass.toCharArray();
			String pass1=null;
			for(int i=0;i<pass.length();i++) {
				if(pass.length()>8&&ch[i]>=65||ch[i]<=90&&ch[i]==42&&ch[i]==64) {
					System.out.println("confirm password");
				pass1=s.nextLine();
				break;
				}
				else {
					System.out.println("enter a valid password!....");
			login.signup();
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
					login.signin(name,pass);
				break;
				case 2:
					System.out.println("Thank you for joining with us");
				break;
				default :
					System.out.println("wrong choice");
				}}
				else {
					//System.out.println(" incorrect password!... ");
					login.signup();
				}
		}
				
				public static void signin(String name,String pass1) {
					Scanner s=new Scanner(System.in);
					System.out.println("enter username:");
					String signinside=s.nextLine();
					System.out.println("enter the password");
					String signinpass=s.nextLine();
					if(signinside.equals(name)&&signinpass.equals(pass1)) {
						System.out.println(" signedin successfully....");}
					else {
						System.out.println("check the username and password");
						login.signin(name,pass1);
					}	
				}
			}
			
			}
