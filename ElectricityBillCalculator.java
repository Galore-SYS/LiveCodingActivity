import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Electricity Consumption (kWh): ");
            double cons = input.nextDouble();

        System.out.print("Enter Rate per kWh: ");
            double rate = input.nextDouble();

        System.out.print("Enter Additional Charge Percentage (%): ");
            double pct = input.nextDouble();

            double consCharge = calculateConsumptionCharge(cons, rate);
            double addCharge = calculateAdditionalCharge(consCharge, pct);
            double total = calculateTotalBill(consCharge, addCharge);

        System.out.println("Consumption Charge: " + consCharge);
        System.out.println("Additional Charge: " + addCharge);
        System.out.println("Total Electricity Bill: " + total);
    }

        public static double calculateConsumptionCharge(double cons, double rate) {
            return cons * rate;
        }

        public static double calculateAdditionalCharge(double consCharge, double pct) {
            return consCharge * (pct / 100);
        }

        public static double calculateTotalBill(double consCharge, double addCharge) {
            return consCharge + addCharge;
        }





}
