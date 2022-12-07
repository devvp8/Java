import java.util.*;
public class constructor1 {
    public static void main(String[] args) {
     shape square=new shape(10);
     shape rectangle=new shape(10,20);
        System.out.print("The area of Square is "+square.area()+" units");
        System.out.println("The area of Rectangle is "+rectangle.area()+" units");
    }
}

class shape{
    int s,t;
     shape(int a){
        s=a;
        t=a;
    }
    shape(int x,int y){
        s=x;
        t=y;
    }
    float area(){
        return s*t;
    }
}
