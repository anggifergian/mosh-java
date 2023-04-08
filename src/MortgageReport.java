import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {
    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("=================");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("=================");
        for (var balance : calculator.getRemainingBalances()) {
            System.out.println(currency.format(balance));
        }
    }
}
