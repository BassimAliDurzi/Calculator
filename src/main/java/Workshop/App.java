package Workshop;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Simple Calculator :-)");

        chooseOperation();

        Scanner scanner = new Scanner(System.in);


        while(true)    {
            System.out.println("Type 1 to continue, or 0 to exit");
            int isContinue = scanner.nextInt();

            if (isContinue == 0){
                System.out.println(" ..... Thank you for using my simple calculator :-) .....");
                System.exit(0);
            }

            System.out.println("Please type the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Please choose the operation: ");
            char operation = scanner.next().charAt(0);

            System.out.println("Please type the second number:");
            double num2 = scanner.nextDouble();


            switch (operation) {
                case '+': {
                    double result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                }
                case '-': {
                    double result2 = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result2);
                    break;
                }
                case '*': {
                    double result3 = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result3);
                    break;
                }
                case '/': {
                    double result4 = num1 / num2;
                    if (num2 != 0){
                        System.out.println(num1 + " / " + num2 + " = " + result4);
                        break;
                    }else{
                        System.out.println("You can't divide on Zero!");
                        break;
                    }
                }
                default:
                    System.out.println("You have chosen a wrong operation, this value {" + operation + "} is not supported" );
                    break;
            }
            System.out.println("--------------------------------------------------");

        }

    }
    public static void chooseOperation() {
        System.out.println("Type + for addition");
        System.out.println("Type - for subtraction");
        System.out.println("Type * for multiply");
        System.out.println("Type / for division");
        System.out.println("Ready to use");
        System.out.println("^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ^-^ ");
    }

}