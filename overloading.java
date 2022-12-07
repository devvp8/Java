class Main{
    public static void main(String args[]){
        overloading object=new overloading();
        object.area(10,5);
        object.area(10);
    }
}

class overloading{
    void area(float a){
        System.out.print("The area of square is "+a*a+"units");
    }
    void area(float a,float b){
        System.out.println("The area of rectangle is "+a*b+"units");
    }
}