package project1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {

    public static void main(String [] args) {


        Map<String, String> vacation = new HashMap<>();

        vacation.put("Musical", "New Orleans");
        vacation.put("Tropical", "Beach Vacation in Mexico");
        vacation.put("Adventurous", "Whitewater Rafting the Grand Canyon");

        System.out.println("What kind of trip would you like to go on, Musical, Tropical, or Adventurous?");
        Scanner scan = new Scanner(System.in);
        String vacationType = scan.next();

        System.out.println("How many are in your group?");
        Scanner scannerTwo = new Scanner(System.in);
        String groupSize = scannerTwo.next();
        String result;

        if (groupSize.equals("1") | groupSize.equals("2")) {
        	result = "First Class";
        } else if (groupSize.equals("3") | groupSize.equals("4") | groupSize.equals(5)) {
        	result = "Helicopter";
        } else {
        	result = "Charter Flight";
        }


        switch (vacationType) {
            case "Musical":
                System.out.println("Since you're a group of " + groupSize + " going on a "+ vacation.get(vacationType) +
                        ", you should take a "+ result);
                break;

            case "Tropical":
                System.out.println("Since you're a group of " + groupSize + " going on a "+ vacation.get(vacationType) +
                        ", you should take a "+ result);
                break;

            case "Adventurous":
                System.out.println("Since you're a group of " + groupSize + "going on a "+ vacation.get(vacationType) +
                        ", you should take a "+ result);
                break;

        }


    }

}
