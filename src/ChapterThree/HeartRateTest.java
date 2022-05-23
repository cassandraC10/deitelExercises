package ChapterThree;

//import java.time.LocalDate;
import java.util.Scanner;
import java.time.*;

public class HeartRateTest {
    public static void main( String[] args )
    {
        LocalDate date = LocalDate.of(1997,04,29);
        HeartRates heart = new HeartRates("", "", date);
        HeartRates thr = new HeartRates("Kuna", "Fomboh", date);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = input.nextLine();
        thr.setFirstName(first);

        System.out.print("Enter your last name: ");
        String last = input.nextLine();
        thr.setLastName(last);

        thr.setDateOfBirth();
        System.out.printf("\nFirst Name: %s\n", thr.getFirstName());
        System.out.printf("Last Name: %s\n", thr.getLastName());
        System.out.printf("You are %d years old\n", thr.calcAge());
        System.out.printf("Your Maximum Heart Rate is %d beats per second\n", thr.maxHeartRate());
        System.out.printf("Your Target-Heart-Rate lies between %d - %d percent \n\n", thr.tarHeartRate1(), thr.tarHeartRate2());

    }
}
