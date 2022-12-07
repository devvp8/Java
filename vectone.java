import java.util.*;
public class vectone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of items you want:");
        int x=sc.nextInt();
        Vector v= new Vector(x,1);
        //syntax!
        for(int i=0;i<x;i++){
            System.out.printf("Enter the item "+(i+1)+ " :");
             //printf for string
            String str=sc.next();
            v.addElement(str);
        }
            int ch=1;
            System.out.println("1)Add \t 2)Delete item \t 3)Display \t 4)Exit");
            while(ch!=4){
                System.out.print("Enter your choice:");
                ch=sc.nextInt();
                switch(ch){
                    case 1:
                    System.out.print("Enter index at which you want element:");
                    int index=sc.nextInt();
                    System.out.print("Enter the element you want:");
                    String st=sc.next();
                    v.add(index,st);
                    break;
                    case 2:
                    System.out.print("Enter the element want to delete : ");
                    String element = sc.next();
                    v.remove(element);
                    break;
                    case 3:
                    System.out.print("The elements in List are : " + v + "\n");
                    break;
                    case 4:
                    return;
                    default:
                    System.out.print("Choice not accepted. ");
                }
            }
    }
}
