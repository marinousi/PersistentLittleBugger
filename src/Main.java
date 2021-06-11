import java.util.Scanner;

//CHALLENGE: https://edabit.com/challenge/zZxPQRjn8q2iB9Biv
public class Main {

    public static int bugger(int num) {
        if (num < 10)
            return 0;                                           //if the number's value is less than 10, it means there's only one digit to it, hence the 0


        int newNum = 1;
        int holder = 0;

        do {
            holder = num % 10;                                 //takes the number in the right
            newNum = newNum * holder;                          //updates the new number
            num = num / 10;                                   //takes the number on the left
        } while (num > 10);                                   //but only while the number has two digits

        newNum = newNum * num;                                //updates the multiplication

        return 1 + bugger(newNum);                  //does it again
    }

    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        //so testing could be easier
        System.out.println("Type -1 to start the program.");
        System.out.println("Type -2 to stop the program.");
        int choice = prompt.nextInt();

        while (choice == -1) {
            System.out.print("Type a number: ");
            int number = prompt.nextInt();

            System.out.println("bugger(" + number + ") -> " + bugger(number));

            System.out.println("Type -1 to continue the program.");
            System.out.println("Type -2 to stop the program.");
            choice = prompt.nextInt();

            if (choice == -2) {
                System.out.println("Program ended!");
                break;
            }

        }

    }
}
