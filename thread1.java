 class Five extends Thread {
    public void runn(){
        long begin=System.currentTimeMillis();
        for(int i=1;i<10;i++){
            System.out.println("5X" + i + "=" + i * 5); 
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                // System.out.print("Error occured");
            }
        }
        long over=System.currentTimeMillis();
        System.out.print("Time taken for table of 5 is: "+(over-begin));
    
    }
}

 class Seven extends Thread {
    public void runn(){
        long begin=System.currentTimeMillis();
        for(int i=1;i<10;i++){
            System.out.println("7X" + i + "=" + i * 7); 
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                // System.out.print("Error occured");
            }
        }
        long over=System.currentTimeMillis();
        System.out.print("Time taken for table of 7 is: "+(over-begin));
    
    }
}

 class Thirteen extends Thread {
    public void runn(){
        long begin=System.currentTimeMillis();
        for(int i=1;i<10;i++){
            System.out.println("13X" + i + "=" + i * 13); 
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                // System.out.print("Error occured");
            }
        }
        long over=System.currentTimeMillis();
        System.out.print("Time taken for table of 13 is: "+(over-begin));
    
    }
}

public class thread1{
    public static void main(String[] args) {
        Five f=new Five();
        Seven s=new Seven();
        Thirteen t=new Thirteen();
        
        f.start();
        s.start();
        t.start();
    }
}
