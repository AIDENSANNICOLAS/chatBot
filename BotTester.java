import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");

        String name = input.nextLine();

        Bot n1 = new Bot(name);

        n1.greeting();

        n1.help();

        System.out.println("What's the weather like?");

        n1.weather();

        System.out.print("How many feet in a mile?");

        n1.feetInMile();

        n1.goodbye();

    }
}

