import java.util.*;
public class loginnew{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("1.Admin");
		System.out.println("2.User");
                int n=s.nextInt();
		switch(n) {
		case 1:
		login.signup();
		break;
		case 2:
		login.signup();
		break;
		default:
			System.out.println("wrong choice");
		}}
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
					System.out.println(" incorrect password!... ");
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
