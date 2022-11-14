import java.util.*;
class bankapp{
static int cid[]=new int[10];
static int accno[]=new int[10];
static String name[]=new String[10];
//static int cid[]=new int[10];
static String epass[]=new String[10];
static Scanner s=new Scanner(System.in);
static int balance[]=new int[10] ;
static String passwd[]=new String[10];
static int tc[]=new int[10];
static int k=0;
static int count=0;
static int i,j;
static int td=0;

static int c_id=0;
static int acc_no=0;
public static void main(String[]args){
cid[++count]=11;
accno[count]=11011;
name[count]="kumar";
balance[count]=10000;
passwd[count]="ApipNbjm";
cid[++count]=22;
accno[count]=22022;
name[count]="madhu";
balance[count]=20000;
passwd[count]="Cboljoh";
cid[++count]=33;
accno[count]=33033;
name[count]="rahul";
balance[count]=45000;
passwd[count]="dbnqvt";
cid[++count]=44;
c_id=cid[count];
accno[count]=44044;
acc_no=accno[count];
name[count]="robin";
balance[count]=40000;
passwd[count]="kbwb22";
mani();
}

public static void mani(){
boolean f=true;
while(f){
System.out.println("1-add|2-view|3-deposit,withdraw,transfer|0-exit|5-top list");
int y=s.nextInt();
switch(y){
case 1:
add();
break;
case 2:
view();
break;
case 3:
while(true){
System.out.println("1-deposit|2-withdraw|3-transfer|4-exit");
int t=s.nextInt();
switch(t){
case 1:
deposit();
break;
case 2:
withdraw();
break;
case 3:
acctrans();
break;
case 4:
mani();
break;
}}
case 5:
top();
break;
case 0:
f=false;
}}}
public static void add(){
String pass;
System.out.println("enter how many customer to be added");
 k=s.nextInt();
for( i=0;i<k;i++){
System.out.println("");
cid[++count]=c_id+11;
accno[count]=acc_no+11011;
System.out.println("enter the customer name");
name[count]=s.next();
System.out.println("enter the balance");
balance[count]=s.nextInt();
System.out.println("enter the password");
passwd[count]=s.next();
System.out.println("re- enter the password");
 pass=s.next();
String epass="";
if(passwd[count].equals(pass)){
char[]m=pass.toCharArray();
for(i=0;i<m.length;i++){
epass+=(char)(m[i]+1);
}
passwd[count]=epass;
}
else{System.out.println("enter the correct password");
 pass=s.next();
}
}
}

public static void view(){
for( i=1;i<=count;i++){
System.out.println(cid[i]+"  "+accno[i]+"   "+name[i]+"   "+balance[i]+"   "+passwd[i]);
}
}

public static void deposit(){
System.out.print("enter the amount to be added:");
int dep=s.nextInt();
System.out.print("enter the account number:");
int acc=s.nextInt();
for( i=1;i<=count;i++){
if(accno[i]==acc)
balance[i]+=dep;
}
}
public static void withdraw(){
System.out.println("enter account number");
int acc=s.nextInt();
System.out.println("enter the amount to be withdrawn");
int money=s.nextInt();
for( i=1;i<=count;i++){
if(acc==accno[i]){
if(balance[i]-money>=1000){
balance[i]-=money;
}else
System.out.println("insufficient balance the minimum balance should be 1000"+balance[i]);
}
}
}
public static void acctrans(){
System.out.println("enter account number");
int acc1=s.nextInt();
System.out.println("enter account number");
int acc2=s.nextInt();
System.out.println("enter the transfer amount");
int transfer=s.nextInt();
for( i=1;i<=count;i++){
if(acc1==accno[i]){
for(j=1;j<=count;j++){
if(acc2==accno[j]){
if(transfer>=5000){
balance[i]-=transfer+10;
balance[j]+=transfer;
++td;
if(td==5){
balance[i]-=100;
td=0;}
}
else if(transfer<5000){
balance[i]-=transfer;
balance[j]+=transfer;
++td;
if(td==5){
balance[i]-=100;
td=0;}
}
}}}}
}
public static void top(){
System.out.print("enter the top list no:");
int top=s.nextInt();
for(i=1;i<=count;i++){
for( j=i+1;j<=count;j++){
if(balance[i]<balance[j]){
int temp=balance[i];
balance[i]=balance[j];
balance[j]=temp;
int temp1=accno[i];
accno[i]=accno[j];
accno[j]=temp1;
int temp2=cid[i];
cid[i]=cid[j];
cid[j]=temp2;
String hold=name[i];
name[i]=name[j];
name[j]=hold;
String hold1=passwd[i];
passwd[i]=passwd[j];
passwd[j]=hold1;
}
}
}
for(int i=1;i<=top;i++){
System.out.println(cid[i]+"  "+accno[i]+"   "+name[i]+"   "+balance[i]+"   "+passwd[i]);
}

}
}