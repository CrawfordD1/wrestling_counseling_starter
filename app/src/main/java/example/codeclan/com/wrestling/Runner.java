package example.codeclan.com.wrestling;

import java.util.Scanner;

/**
 * Created by user on 26/06/2017.
 */

public class Runner {

    private Scanner sc;

    public static void main(String[] args) {
         String choice = getChoice();
        while(choice != "Break Loop") {
            Subjects.getCounselorDetails(choice);
            choice = getChoice();
        }

        System.exit(0);

    }


    public static String getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the International Former Professional Wrestlers' Association for Counseling and Development");
        System.out.println("Please pick the number of the subject you would like more information on:");
        System.out.println("1-Financial Consultancy | 2-Existential Psychotherapy");
        System.out.println("3-Temper Management     | 4-Past-Life Regression");
        System.out.println("5-Marriage Guidance     | 6-Crisis Management");
        System.out.println("7-Dream Analysis        | 8-Hypnosis");
        System.out.println("9-Reiki                 | 0-Exit Subject Choice");
        System.out.println();
        System.out.println("Please enter your choice below:");
        String input = sc.nextLine().toUpperCase();
        char choice = input.charAt(0);
        switch(choice){
            case '1':
                return "Financial Consultancy";
            case '2':
                return "Existential Psychotherapy";
            case '3':
                return "Temper Management";
            case '4':
                return "Past-Life Regression";
            case '5':
                return "Marriage Guidance";
            case '6':
                return "Crisis Management";
            case '7':
                return "Dream Analysis";
            case '8':
                return "Hypnosis";
            case '9':
                return "Reiki";
            case '0':
                return "Break Loop";
            default :
                System.out.println("Invalid Choice");
                System.out.println();
                return getChoice();
        }
    }
}
