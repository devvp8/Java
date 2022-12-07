import java.util.*;
public class meta {
    static boolean isMeta(String word1,String word2)
{
int wrong_count=0,wrong_pos[];
wrong_pos=new int[2];
if(word1.length()!=word2.length())
return false;
for(int i=0;i<word1.length();i++)
{
if(word1.charAt(i)!=word2.charAt(i))
{
wrong_count++;
if(wrong_count>2)
return false;
wrong_pos[wrong_count-1]=i;
}
}
if(wrong_count==2)
{
if(word1.charAt(wrong_pos[0])==word2.charAt(wrong_pos[1])&&word1.charAt(wrong_pos[1])==word2.charAt(wrong_pos[0]))
return true;
}
return false;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String word1,word2;
word1=sc.next();
word2=sc.next();
if(isMeta(word1, word2))
{
System.out.println("Strings are meta");
}
else
{
System.out.println("Strings are not meta");
}
}
}
