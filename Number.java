public class Number {
    public static void main(String[] args){
        int count=0;
        int number=Integer.parseInt(args[0]);
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.print(count);
    }
}