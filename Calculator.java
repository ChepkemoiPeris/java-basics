import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number:");
        Double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your second number:");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();
       
        System.out.print("What operation would you like to perform?");
        String operation = scanner.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1,number2,number1+number2);
        }else if(operation.equals("sub")){
            System.out.printf("%f - %f = %f", number1,number2,number1-number2);
        }else if(operation.equals("div")){
            if(number2 == 0){
                System.out.println("Cannot divide by zero");
            }else{
                 System.out.printf("%f / %f = %f", number1,number2,number1/number2);
            }
        }else if(operation.equals("mul")){
            System.out.printf("%f * %f = %f", number1,number2,number1*number2);
        }else{
            System.out.printf("%s is not supported",operation);
        }
        scanner.close();
        

    }
}
