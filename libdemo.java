import java.util.Scanner;
public class libdemo{
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.Admin");
		System.out.println("2.User");
                int n=s.nextInt();
                 
		switch(n) {
		case 1:
		login.signup();
		boolean t=true;
		while(t){
		
		System.out.println("view for '1'");
		System.out.println("add for '2'");
		System.out.println("delete for '3'");
		System.out.println("update for '4'");
		int a=s.nextInt();
		switch(a){
		case 1:
			Admin.view();
			break;
		case 2:
			Admin.add();
			break;
		case 3:
			Admin.delete();
		}}
		
		case 2:
		login.signup();
		break;
		default:
			System.out.println("wrong choice");
		}}
	public static class Admin{
		static Scanner s=new Scanner(System.in);
	static	String[]str=new String[100];
		static int price[]=new int[50];
			static int id[]=new int[50];
public  static void view(){
			for(int i=0;i<str.length&i<'0';i++){
				
				if(price[i]!=0&&str[i]!=null&&id[i]!=0)
				System.out.println((i+1)+" "+id[i]+" "+str[i]+" "+price[i]);}}
		
		
public static  void add(){
			System.out.println("add books");
			int d=s.nextInt();
		for( int i=0;i<d;i++){	
			System.out.println("book name:");
			str[i]=s.next();
			price[i]=s.nextInt();
			id[i]=s.nextInt();
}}

public  void update(){
			
		}


public static void delete(){
			for(int i=0;i<price.length;i++){
				if(price[i]!=0&&str[i]!=null&&id[i]!=0)
					System.out.println((i+1)+" "+id[i]+" "+str[i]+" "+price[i]);}
		System.out.println("enter the no. to delete");
			int delete=s.nextInt();
			str[delete]="null";
			price[delete]=0;
			id[delete]=0;
			for(int i=0;i<price.length;i++){
				if(price[i]!=0&&str[i]!=null&&id[i]!=0)
					System.out.println((i+1)+" "+id[i]+" "+str[i]+" "+price[i]);}
     for(int i=delete;i<str.length-1;i++)
     {
			String temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
			int temp1=price[i];
			price[i]=price[i+1];
			price[i+1]=temp1;
			int temp2=id[i];
			id[i]=id[i+1];
			id[i+1]=temp2;
     }}

	
	}
			
			
		
	public  class user extends Admin{
	
		public  void buy(){
			
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
