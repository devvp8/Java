import java.util.*;
public class vecttwo {
    public static void main(String args[]) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the vector array:");
        int n = scan.nextInt();
        Vector v = new Vector();
        for (int i = 0; i < n; i++) {
         System.out.print("Enter the element for position " + (i + 1) + ":");
        v.addElement(scan.nextInt());
        }
        System.out.println("Vector:" + v);
        System.out.print("Enter the element whose frequency to be known:");
        int search = scan.nextInt();
        int start=0,newpos,count=0;
        while(start<v.size())
        {
        newpos=v.indexOf(search,start);
        if(newpos==-1)
        {
        break;
        }
        else{
        count++;
        start=newpos+1;
        }
        }
        System.out.print("Frequency:" + count);
        }
        }

