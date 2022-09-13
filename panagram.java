public class panagram{
public static void main(String[]args){
String s=" the quick fox brown jumps over the lazy dog";
System.out.println(ispanagram(s));
}
private static boolean ispanagram(String s){
if(s.length()<26)
{
return false;}
else{
for(ch='a';ch<='z';ch++){
if(s.indexOf(ch)<0){
return false;}
}
return true;}
