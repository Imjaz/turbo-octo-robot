import java.util.*;
class train
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a=0;
		do
		{
		System.out.println("Enter the option as 1.AvailableTicket 2.BookTicket 3.CancelTicket 4.BookedTicket  5.Exit");
		 a=scan.nextInt();
		switch(a)
		{
			case 1:
		    AvailableTicket At=new AvailableTicket();
			At.showDetails();
			break;
			case 2:
			BookTicket Bt=new BookTicket();
			Bt.BookTickets();
			break;
			case 3:
			
			break;
			case 4:
			BookedTicket Bdt=new BookedTicket();
			Bdt.showTicket();
			break;
		}
		}while(a!=5);
	}
}
class passengerDetails
{
       Scanner scan=new Scanner(System.in);
	   String Origin;
	   String Destination;
	 static   int upper=2;
	 static  int lower=2;
	 static int middle=2;
	 static int totalseat=6;
	 static int Rac=2;
	 static  int wl=2;
		static String Pnr[]=new String[10];
		static String Name[]=new String[10];
		static int Age[]=new int[10];
	    static int Seatno[]=new int[10];
	    static String Gender[]=new String[10];
		static int Fare[]=new int[10];
		static String Berth[]=new String[10];
	
	
}
class BookTicket extends passengerDetails
{
	 static  int pvalue=1;
	 static String pnr;
	 static int count=0;
	 static int seno=1;
static int n=0;
	static BookTicket obj=new BookTicket();
	void BookTickets()
	{	System.out.println("Enter how many ticket you want to book");
		 n=scan.nextInt();
if(n<=10){
		if(seno<=6)
		{
			pnr=Integer.toString(pvalue);
	    obj.setTicket(n,pnr);
		}
		else if(seno>6 && seno<=8)
		{
			pnr="RAC";
Berth[seno-1]="RAC";

			obj.setTicket(n,pnr);
			

		}
		else if(seno>8 && seno<=10)
		{
			pnr="WL";
Berth[seno-1]="Wl";

			obj.setTicket(n,pnr);
		}
		else
			System.out.println("No ticket available");
	}else
obj.BookTickets();}
	void setTicket(int n,String pnr)
	{
			for(int i=0;i<n;i++)
		{
			Pnr[count]=pnr;
			System.out.println("Enter the Passenger Name");
			String na=scan.next();
			Name[count]=na;
			System.out.println("Enter the Passenger Age");
		    int ag=scan.nextInt();
			Age[count]=ag;
			if(ag>5)
			Seatno[count]=seno++;
		   else 
			   Seatno[count]=0;
			System.out.println("Enter the Passenger Gender");
			String gen=scan.next();
			Gender[count]=gen;
			if(ag>5)
				Fare[count]=400;
			else
				Fare[count]=200;
			boolean check=false;
			if(totalseat>0)
			{
			if(ag>60)
			{
			 check=lower!=0?true:false;
			if(check==true)
			{
				Berth[count]="Lower";
				--lower;
				--totalseat;
			}
			else
			{
			System.out.println("No Lower Available");
             obj.berthPreference(count);			 
			}
			}
			else
			{
			if(ag>5)
			{
			obj.berthPreference(count);
			}
			else
				Berth[count]="no Berth";
			}
			}
			++count;
			
		}
		++pvalue;
		System.out.println("Ticket Booked Sucessfully");
	}
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper ");
			int pref=scan.nextInt();
			--totalseat;
			switch(pref)
			{
				case 1:
				obj.lowerBerth(count);
				break;
				case 2:
				obj.middleBerth(count);
				break;
				case 3:
				obj.upperBerth(count);
				break;
				
			}
	}
	void lowerBerth(int count)
	{
		if(lower!=0)
		{
			Berth[count]="Lower";
          --lower;
		}
		else
			obj.upperBerth(count);
	}
     	void upperBerth(int count)
	{
		if(upper!=0)
		{
			Berth[count]="Upper";
		--upper;
		}
		else
			obj.middleBerth(count);
	}	
    void middleBerth(int count)
	{
		if(middle!=0)
		{
			Berth[count]="Middle";
		--middle;
		}
		else
			obj.lowerBerth(count);
	}
}

class BookedTicket extends passengerDetails
{
	void showTicket()
	{
		System.out.print("Pnr\tName\tAge\tSeatno\tGender\tFare\tBerth\n");
		for(int i=0;i<Name.length;i++)
		{	
		if(Fare[i]!=0)
		{
		System.out.print(Pnr[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Seatno[i]+"\t"+Gender[i]+"\t"+Fare[i]+"\t"+Berth[i]+"\n");
        }
		}
	}
}

class AvailableTicket extends passengerDetails
{
	void showDetails()
	{
	 System.out.println("No.of.Lower No.of.Upper No.of.Middle Total seats");
	 System.out.println("    "+lower+"\t        "+upper+"\t    "+middle+"\t"+totalseat);
	}
}