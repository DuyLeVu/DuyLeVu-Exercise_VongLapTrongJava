import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interest_rate;

        Scanner sc = new Scanner(System.in);
        System.out.println("Money ");
        money = sc.nextDouble();
        System.out.println("Month ");
        month = sc.nextInt();
        System.out.println("Interest rate: ");
        interest_rate = sc.nextDouble();

        double total_interest = 0;
        for (int i=0; i < month; i++){
            total_interest = money * (interest_rate / 100) /12 * month;
        }

        System.out.println("Total Interest: " + total_interest);

    }
}
