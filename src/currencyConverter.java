import java.util.Scanner;
public class currencyConverter {
        static final double INR_TO_USD_RATE = 0.012;
        static final double USD_TO_INR_RATE = 82.0;

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your Currency Converter");
            System.out.println("1. for Convert INR to USD");
            System.out.println("2. for Convert USD to INR");
            System.out.print("Choose an option (1 or 2) for Convert Currency: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount in INR: ");
                    double inrAmount = scanner.nextDouble();
                    double usdAmount = convertINRToUSD(inrAmount);
                    System.out.print("Amount in USD: " +usdAmount);
                    break;
                case 2:
                    System.out.print("Enter amount in USD: ");
                    double usdAmounts = scanner.nextDouble();
                    double inrConvertedAmount = convertUSDToINR(usdAmounts);
                    System.out.print("Amount in INR:" +inrConvertedAmount);
                    break;
                default:
                    System.out.println("Invalid option! Please choose 1 or 2.");
                    break;
            }
            scanner.close();
        }
        public static double convertINRToUSD(double inr) {
            return inr * INR_TO_USD_RATE;
        }
        public static double convertUSDToINR(double usd) {
            return usd * USD_TO_INR_RATE;
        }
    }

