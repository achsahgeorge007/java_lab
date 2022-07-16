package mca.myapp.CO4;

class main_arithamatic {
    public static void main(String []args){
        arithamatic_package testObj = new arithamatic_package();
        System.out.println("Addition of two numbers : "+testObj.add(1,2));
        System.out.println("Subtraction of two numbers : "+testObj.substract(1,2));
        System.out.println("Multiplication of two numbers : "+testObj.multiple(1,2));
        System.out.println("Division of two numbers : "+testObj.divide(5,2));
        System.out.println("Reminder of two numbers : "+testObj.remainder(11,2));
    }
}