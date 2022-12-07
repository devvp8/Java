class Five extends Thread {
    public void run() {
    long start = System.currentTimeMillis();
    for (int i = 1; i < 10; i++) {
    System.out.println("5*" + i + "=" + i * 5);
    try {
    // miliseconds time
    Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    }
    long end = System.currentTimeMillis();
    System.out.println("Total time taken by 5 table:" + (end - start));
    }
    }
    class Seven extends Thread {
    public void run() {
    long start = System.currentTimeMillis();
    for (int i = 1; i < 10; i++) {
    System.out.println("7*" + i + "=" + i * 7);
    try {
    // miliseconds time
    Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    }
    long end = System.currentTimeMillis();
    System.out.println("Total time taken by 7 table:" + (end -
start));
}
}
class Thirteen extends Thread {
public void run() {
long start = System.currentTimeMillis();
for (int i = 1; i < 10; i++) {
System.out.println("13*" + i + "=" + i * 13);
try {
// miliseconds time
Thread.sleep(2000);
} catch (InterruptedException e) {
}
}
long end = System.currentTimeMillis();
System.out.println("Total time taken by 13 table:" + (end -
start));
}
}
public class Main {
public static void main(String[] args) {
Five f = new Five();
Seven s = new Seven();
Thirteen t = new Thirteen();
f.start();
s.start();
t.start();
}
}

