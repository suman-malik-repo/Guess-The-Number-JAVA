import java.util.*;
public class New {
    public static void main(String args[]){
//        System.out.println("Hello wrold");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100);
        while(true){
            System.out.print("Guess the NUmber: ");
            int input = sc.nextInt();
            if(input==num){
                System.out.println("OK!!!");
                break;
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
