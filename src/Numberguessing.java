import java.util.Scanner;

public class Numberguessing {

    public static void game(){
        Scanner sc = new Scanner(System.in);
        int i,guess;
        int generate = 1+ (int)(100* Math.random());
        int m = 3;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 3 trials.");
        for ( i = 0; i < m; i++) {
            System.out.println(" guess the number");
            guess = sc.nextInt();
            if(generate==guess){
                System.out.println("Congrats you guesses the correct number");
                break;
            } else if (generate > guess  && i != m - 1) {
                System.out.println(" guess a larger number");

            } else if (generate < guess && i != m - 1) {
                System.out.println(" guess a smaller number");

            }

        }
        if (m==i){
            System.out.println(" you have exhausted your attempts");
        }



    }
    public static void main(String[] args) {
        game();




    }
}