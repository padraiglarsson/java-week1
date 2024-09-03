public class Tut4 {
    public static void main(String[] args) {

        // Declare and initialize variables representing loan details
        double loanAmount = 10000;
        double interestRate = 0.086;
        int loanPeriod = 7;
        double monthlyPayment;
        double totalPayment;

        // Calculate the monthly payment using the formula for loan amortization
        monthlyPayment = (loanAmount * interestRate / 12)
                / (1 - 1 / Math.pow(1 + interestRate / 12, loanPeriod * 12));

        // Round the monthly payment to two decimal places
        monthlyPayment = Math.round(monthlyPayment * 100) / 100.0;

        // Calculate the total payment over the loan period
        totalPayment = monthlyPayment * loanPeriod * 12;

        // Round the total payment to two decimal places
        totalPayment = Math.round(totalPayment * 100) / 100.0;

        // Print information about the loan, including the monthly payment
        System.out.println("The monthly payment for a loan of " + loanAmount + " pounds for " +
                loanPeriod + " years \nat an interest rate of " + interestRate * 100 + " % is " +
                monthlyPayment + " pounds");
    }
}

