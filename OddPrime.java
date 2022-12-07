import java.util.*;
public class OddPrime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int i,j,flag;
        int x=sc.nextInt();
        System.out.println("The odd numbers from 1 to"+x +"is:");
        for(i=1;i<=x;i++)
        {
            if(i%2!=0){
            System.out.print(i+" ");
        }
        }
        System.out.print("The prime numbers from 1 to"+x +"is:");
        
        for(i=1;i<=x;i++){
           flag=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag++;
                    break;
                }
            }
            if (flag==0){
                System.out.print(i+ " ");
            }
        }
    }
}
