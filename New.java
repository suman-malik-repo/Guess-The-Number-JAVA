import java.util.*;
public class New {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); // using Random class
        int num = rand.nextInt(100);
        //game... get input and be guessed by user int input...
        while(true){
            System.out.print("Guess the NUmber: ");
            int input = sc.nextInt();

            if(input==num){
                System.out.println("OK!!!");
                break; // not farther check;
            } else if (input > num) {
                System.out.println("Try with some lesser value...");
            }
            else{
                System.out.println("Try with some Greater Value...");
            }
        }
        System.out.println("The Number is "+num);
    }
}
