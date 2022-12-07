import java.util.*;
public class Roots {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter values of three coefficients a,b and c:");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double det= b*b -4*a*c;
        if (det > 0) {
            double deter_root = Math.sqrt(det);
            System.out.println("Root 1=" + (-b + deter_root) / (2 * a));
            System.out.println("Root 2=" + (-b - deter_root) / (2 * a));
            } else if (det == 0) {
            double deter_root = Math.sqrt(det);
            System.out.println("Root 1=Root 2" + (-b + deter_root) /
            (2 * a));
            } else {
            double deter_root = Math.sqrt(-det);
            double real = -b / (2 * a);
            double img = deter_root / (2 * a);
            System.out.println("Root 1=" + real+"+"+img+"i");
            System.out.println("Root 2=" + real+"-"+img+"i");
                               
}
         sc.close();
    }
}
