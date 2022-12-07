import java.util.*;
public class exc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the number: ");
        try{
            int num=sc.nextInt();
            System.out.print("Number is valid.");
        }
        catch(Exception e){
            System.out.print("Exception"+e);
        }
        // 
        }
    }

