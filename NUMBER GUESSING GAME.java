import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.println("Hello and welcome!");
        // Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        System.out.println("============= To Play The Game Guess The Number between(1-100)============");
        int userNumber = 0;
        do {
            //System.out.println(myNumber);
            System.out.println(" ==============Enter Your Number :   :===========  ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("('v')Waooo Great! You Win*");
                break;
            }
            else if(userNumber <= myNumber){
                System.out.println("Your Number is too small");
            }
            else {
                System.out.println("Your Number is too large");
            }

        }
        while(userNumber >= 0 );
        System.out.println("                     My Number Was : "               + myNumber);


}
}