import java.util.*;
class vampire{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int combo1=0,combo2=0,number;
        int arr[]=new int[4];
        System.out.print("Enter the 4 digit number:");
        number=sc.nextInt();
        arr[0]=number%10;
        number=number/10;

        arr[1]=number%10;
        number=number/10;

        arr[2]=number%10;
        number=number/10;

        arr[3]=number%10;
        number=number/10;
        int count=0,a;
        a=number;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i!=j){
                    combo1=arr[i]*10+arr[j];
                    combo2=arr[3-i]*10+arr[3-j];
                }
                if(combo1*combo2==a){
                    System.out.printf("It is a Vampire number");
                    count++;
                    break;
                }
            }
        }
        if(count==0){
            System.out.print("Number is not Vampire");
        }
    }
}