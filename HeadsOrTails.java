import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails{
    public static void main(String[] args) {

        int heads_count = 0;
        int tails_count = 0;
        String name;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.println("Who are you?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");

        for(int i = 1; i <= 3; i++){
            System.out.print("Round " + i + ": ");
            if(random.nextBoolean() == true){
                System.out.println("Heads");
                heads_count++;
            }else{
                System.out.println("Tails");
                tails_count++;
            }
        }

        System.out.println("Heads: " + heads_count + ", Tails: " + tails_count);
        if(heads_count > tails_count){
            System.out.println(name + " won!");
        }else{
            System.out.println(name + " lost!");
        }
        sc.close();
    }
}