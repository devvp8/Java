import java.util.*;

interface Sports{
    int score=40;
    void memberscore();
}

class student{
    int rollno;
    void read(int n){
        rollno=n;
    }
}

class Test extends student{
    int sem1,sem2;
    void read1(int n){
        sem1=n;
    }
    void read2(int n){
        sem2=n;
    }
}

class result extends Test implements Sports{
   public void memberscore(){
        int total;
        total=sem1+sem2+score;
        System.out.print("Total score"+total);
    }
}

public class inherit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        result r=new result();
        System.out.print("enter rollno:");
        int rno=sc.nextInt();
        System.out.print("Enter sem1 marks:");
        int mark1=sc.nextInt();
        System.out.print("Enter sem2 marks:");
        int mark2=sc.nextInt();
        r.read(rno);
        r.read1(mark1);
        r.read2(mark2);
        r.memberscore();
    }
}
