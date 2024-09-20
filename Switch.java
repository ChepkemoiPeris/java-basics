import java.util.Scanner;
/**
 * Switch
 */
public class Switch {

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

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1,number2,number1+number2);
                break;

            case "sub":
                 System.out.printf("%f - %f = %f", number1,number2,number1-number2);
                 break;  
            
            case "mul":
                System.out.printf("%f * %f = %f", number1,number2,number1*number2);
                break; 

            case "div":
                if(number2 == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    System.out.printf("%f / %f = %f", number1,number2,number1/number2);
                }
                break; 
        
            default:
                System.out.printf("Nothing passed");
                break;
        }
        scanner.close();
    }
}