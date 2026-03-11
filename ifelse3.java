import java.util.Scanner;
public class ifelse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = scan.nextInt();

        System.out.print("Enter the Smoking Status : ");
        String smokingstatus = scan.next();

        System.out.print("Enter the Pre Existing Conditions : ");
        String preExisting = scan.next();

        System.out.print("Enter the CoverageTier : ");
        String coverage = scan.next();

        double  age_group = 0;
        double risk = 0;

        if(coverage.equals("Basic")){
           if (( age >= 18 ) && ( age <= 30 ) ) 
            {
                age_group = 200;
            }
           else if(age >= 31 && age <=50)
            {
               age_group = 250;
            }
            else if(age >=51 && age <=65)
            {
            age_group = 350;
            }
            else
            {
            age_group = 400;
            }
        }
        else if(coverage.equals("Standard")){
            if(age >= 18 && age <= 30){
                age_group = 300;
            }
            else if(age >= 31 && age <= 50){
                age_group = 350;
            }
            else if(age >= 51 && age <=65){
                age_group = 450;
            }
            else {
                age_group = 550;
            }
        }
        else if(coverage.equals("Premium")){
            if(age >= 18 && age <= 30){
                age_group = 500;
            }
            else if(age >= 31 && age <= 50){
                age_group = 600;
            }
            else if(age >= 51 && age <= 65){
                age_group = 700;
            }
            else{
                age_group = 800;
            }
        
        }
    if(smokingstatus.equals("Smoker")){
        if(preExisting.equals("Yes")){
            risk = age_group * 0.70;
        }
        else{
            risk = age_group * 0.04;
        }
    }
    else{
        if(preExisting.equals("Yes")){
            risk = age_group * 0.30;
        }
        else{
            risk = 0;
        }
    }
    double  totalPremium = age_group + risk;

    System.out.println("Age : "+age);
    System.out.println("Smoking Status : "+smokingstatus);
    System.out.println("Pre-existing Conditions : "+preExisting);
    System.out.println("Coverage Tier : "+coverage);
    System.out.println("Base Premium : "+age_group);
    System.out.println("Risk Surcharge : "+risk);
    System.out.println("Total Monthly Premium : "+totalPremium);

    scan.close();

    }
}
