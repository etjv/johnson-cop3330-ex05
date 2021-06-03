import java.util.Scanner;

/*
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        Integer x = readFirstNumber();
        Integer y = readSecondNumber();
        System.out.println(add(x, y));
        System.out.println(subtract(x, y));
        System.out.println(multiply(x, y));
        System.out.println(divide(x, y));
    }

    private static Integer readFirstNumber(){
        System.out.println("What is the first number?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer readSecondNumber(){
        System.out.println("What is the second number?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static String add(Integer x, Integer y){
        int z = x + y;
        return x + " + " + y + " = " + z;
    }

    private static String subtract(Integer x, Integer y){
        int z = x - y;
        return x + " - " + y + " = " + z;
    }

    private static String multiply(Integer x, Integer y){
        int z = x * y;
        return x + " * " + y + " = " + z;
    }

    private static String divide(Integer x, Integer y){
        int z = x / y;
        return x + " / " + y + " = " + z;
    }
}