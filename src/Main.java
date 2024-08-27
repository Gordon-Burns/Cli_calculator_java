import java.util.Scanner ;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int sum(int a, int b){
        return a + b;
    }

    static int subtract(int a, int b){
        return a - b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static int divide(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first_num = sc.nextInt() ;
        System.out.println("Enter Second Number");
        int second_num = sc.nextInt();
        sc.nextLine();
        System.out.println("What do you want to do with the numbers");
        String operator = sc.nextLine();

        if (operator.equals("+"))
        {
            System.out.println(sum(first_num,second_num));
        }
        else if (operator.equals("-")) {
            System.out.println(subtract(first_num,second_num));
        }
        else if (operator.equals("*")) {
            System.out.println(multiply(first_num,second_num));
        }
        else if (operator.equals("/")) {
            System.out.println(divide(first_num,second_num));
        }
        else {
            System.out.println("Enter a valid operator");
        }
        }
    }
