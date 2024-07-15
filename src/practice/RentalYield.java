package practice;

public class RentalYield {
    private static double calculate(double monthlyRentalIncome, double purchasePrice) {
        double annualRentalIncome = monthlyRentalIncome * 12;
        return (annualRentalIncome / purchasePrice) * 100;
    }
    public static void main(String[] args) {
        double result = calculate(1300, 250000);
        System.out.println(result);
    }
}
