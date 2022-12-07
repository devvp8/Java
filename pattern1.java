import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("Enter the number of lines:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0){
                for(j=1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
            }
                else{
                    for(j=i;j>=1;j--)
                    {
                        System.out.print(j+" ");
                    }
                }
            System.out.print("\n");
        }
    }
}
