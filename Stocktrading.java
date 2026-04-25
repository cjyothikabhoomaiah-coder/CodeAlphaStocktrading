import java.util.*;

 public class Stocktrading  {
    static int balance = 10000; // initial money
    static int shares = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 100; // price per share

        while (true) {
            System.out.println("\n1. Buy Shares");
            System.out.println("2. Sell Shares");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter shares to buy: ");
                    int buy = sc.nextInt();
                    int cost = buy * price;

                    if (cost <= balance) {
                        shares += buy;
                        balance -= cost;
                        System.out.println("Bought successfully!");
                    } else {
                        System.out.println("Not enough balance!");
                    }
                    break;

                case 2:
                    System.out.print("Enter shares to sell: ");
                    int sell = sc.nextInt();

                    if (sell <= shares) {
                        shares -= sell;
                        balance += sell * price;
                        System.out.println("Sold successfully!");
                    } else {
                        System.out.println("Not enough shares!");
                    }
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("Shares: " + shares);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}