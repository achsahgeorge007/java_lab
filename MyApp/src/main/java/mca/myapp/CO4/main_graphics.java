package mca.myapp.CO4;
//import mca.myapp.CO4.package_graphics.*;

public class main_graphics {
    public static void main(String []args){
        package_graphics testObj = new package_graphics();
        System.out.println("Area of Rectangle : " + testObj.recArea(1,2));
        System.out.println("Area of Circle : " + testObj.cirArea(10));
        System.out.println("Area of Square : " + testObj.squArea(10));
        System.out.println("Area of Triangle : " + testObj.triArea(10,2));
    }
}