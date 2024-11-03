import java.util.Scanner;
public class Day20perator {
public static void solve() {
    Scanner input = new Scanner(System.in);
        double meal_cost = input.nextDouble();
        int tip_percent = input.nextInt();
        int tax_percent = input.nextInt();
        input.close();
        double tip = (tip_percent / 100.0) * meal_cost;
        double tax = (tax_percent / 100.0) * meal_cost;
        double total_cost = meal_cost + tip + tax;
        System.out.println(Math.round(total_cost));
    }
    public static void main(String[] args) {
        solve();
    }
}
