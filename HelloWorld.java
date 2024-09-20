import java.util.Scanner;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {  
        // String name = "peris chepkemoi";//%s
        // String country = "kenya";
        // int age = 27; //%d
        // char percentageSign = '%'; //%c
        // boolean isFalse = false; //%b
        // double gpa = 3.8; //%f
        // String formattedString = String.format("My name is %s. I am from %s and I am %d years old.",name,country, age);
        // System.out.println(formattedString);
        
        //check length of string
        String String1 = "The sky is blue and it is very blue";
        // System.out.println(name.length());
        // System.out.println(name.isEmpty());
        // System.out.println(name.isBlank());

        //convert to uppercase
        // System.out.println(name.toUpperCase());

        //replace a string 
        // System.out.println(String1.replace("blue", "red"));
        // System.out.println(String1.contains("blue"));

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s, How old are you? ",name);

        int age = scanner.nextInt();
        //cleans up input buffer
        scanner.nextLine();
        System.out.printf("%d is excellent age to learn programming. what language are you interested in?",age);

        String language = scanner.nextLine();
        System.out.printf("%s is a very popular language ",language);

        scanner.close();
    }
}