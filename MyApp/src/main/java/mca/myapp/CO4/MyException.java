package mca.myapp.CO4;
import java.util.*;

class MyException {
    public static void main(String args[]) {
        int totalNums;
        int i;
        int temp, count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Total numbers");
        totalNums = Integer.parseInt(sc.nextLine());
        for (i = 0; i < totalNums; i++) {
            try {
                temp = Integer.parseInt(sc.nextLine());
                if (temp > 0) {
                    sum += temp;
                    count += 1;
                } else {
                    throw new MyExceptions(Integer.toString(temp));
                }
            } catch (MyExceptions ex) {
                System.out.print(ex.getMessage());
                System.out.println(" - Not a positive number");
            }
        }
        System.out.print("Count : ");
        System.out.println(count);
        System.out.print("sum: ");
        System.out.println(sum);
        System.out.print("Average : ");
        System.out.println(sum / count);

    }
}

class MyExceptions extends Exception {
    public MyExceptions(String value) {
        super(value);
    }
}

