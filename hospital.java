import java.util.*;
class hospital{
static Scanner s= new Scanner(System.in);
static String patient[]=new String[3];
static float entry[]=new float[3];
static float exit[]=new float[3];
static float result[]=new float[3];
static int i=0;
static float check[]=new float[3];
static float waiting[]= new float[3];
public static void main(String[]args){
System.out.println("enter the no. of patients");
int n=s.nextInt();
int count=0;
int sec=0;
int bye=0;
for(int i=0;i<n;i++){
for(int j =0;j<1;j++){
System.out.println("enter patient name");
patient[count++]=s.next();
System.out.println("enter patient entry time");
entry[sec++]=s.nextFloat();
exit[bye++]=s.nextFloat();
} }
treatment t =new treatment();
t.out();
for(i=0;i<3;i++)
System.out.println((i+1)+" "+patient[i]+"  "+entry[i]+"  "+waiting[i]);

}

}
class treatment extends hospital{
public void out (){
for(int i=0;i<3;i++){
entry[i]*=3600;
exit[i]*=3600;
System.out.println("con to sec1"+entry[i]);
int prof=(10*60);
int phar=(5*60);
System.out.println("doc time");
float consult=s.nextFloat();
consult/=100;
entry[i]+=(prof+phar+consult);
entry[i]/=3600;
result[i]=exit[i]-entry[i];

waiting[i]=(exit[i]-result[i]);
System.out.println(waiting[i]);
}



}

}
