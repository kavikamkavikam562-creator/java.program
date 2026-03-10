import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRatio = sc.nextDouble();
        sc.nextLine(); // Consume newline
        String loanType = sc.nextLine();

        String decision = "";
        double maxLoanAmount = 0.0;

        
        if (creditScore >= 750) {
            if (debtToIncomeRatio <= 30.0) {
                decision = "Approved";
               
                maxLoanAmount = annualIncome * 4; 
            } else if (debtToIncomeRatio <= 50.0) {
                decision = "Needs Review";
                maxLoanAmount = annualIncome * 2;
            } else {
                decision = "Rejected";
            }
        } else if (creditScore >= 650) {
            if (debtToIncomeRatio <= 40.0) {
                decision = "Needs Review";
                maxLoanAmount = annualIncome * 2;
            } else {
                decision = "Rejected";
            }
        } else {
            decision = "Rejected";
        }

       
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtToIncomeRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        
        if (!decision.equals("Rejected")) {
            System.out.println("Maximum Loan Amount: $" + maxLoanAmount);
        }
    }
}

