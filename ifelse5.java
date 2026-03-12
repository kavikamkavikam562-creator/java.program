import java.util.Scanner;
public class ifelse5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the gpa : ");
        double gpa = scan.nextDouble();

        System.out.print("Enter the Family Income : ");
        double familyincome = scan.nextDouble();

        System.out.print("Enter the Extracurricular Score : ");
        int extracurricular = scan.nextInt();

        System.out.print("Enter the scholarship type : ");
        String scholarship = scan.next();

        Double Amount = 0.0;
        String Category = "None";
        String Eligibility = "Not Eligible";

        if(scholarship.equals("Merit") && gpa >=2.5){

           
           if(gpa >= 3.8 && extracurricular >= 80 )
            {
              Amount = 25000.0;
              Category = "Full";
              Eligibility = "Eligible";

            }
            else if(gpa >= 3.5 && extracurricular >= 70)
            {
              Amount = 15000.0;
              Category = "Partial";
              Eligibility = "Eligible";

            }
            else if(gpa >= 3.0 && extracurricular >=60)
            {
                Amount = 8000.0;
                Category = "Minimal";
                Eligibility = "Eligible";

            }
        }
        else if(scholarship.equals("Need-Based") && gpa >= 2.5){


               if(familyincome <= 30000 && gpa >= 3.5 )
               {
                Amount = 30000.0;
                Category = "Full";
                Eligibility = "Eligible";

               }
               else if(familyincome <= 50000 && gpa >= 3.0)
               {
                Amount = 18000.0;
                Category = "Partial";
                Eligibility = "Eligible";

               }
                else if(familyincome <= 70000 && gpa >= 2.8)
                {
                Amount = 10000.0;
                Category = "Minimal";
                Eligibility = "Eligible";

                }
        }
        else if(scholarship.equals("Sports") && gpa >= 2.5){


            if(extracurricular >= 85 && gpa >= 3.0)
            {
                Amount = 22000.0;
                Category = "Full";
                Eligibility = "Eligible";

            } 
            else if(extracurricular >= 75 && gpa >= 2.8)
            {
                Amount = 20000.0;
                Category = "Partial";
                Eligibility = "Eligible";

            }
            else if(extracurricular >= 65 && gpa >= 2.5)
            {
                Amount = 12000.0;
                Category = "Minimal";
                Eligibility = "Eligible";

            }
        }
        
        System.out.println("GPA : "+gpa);
        System.out.println("Family Income : "+familyincome);
        System.out.println("Extracurricular Score : "+extracurricular);
        System.out.println("Scholarship : "+scholarship);
        System.out.println("Eligibility : "+Eligibility);
        System.out.println("Award Amount : $"+Amount);
        System.out.println("Award Category : "+Category);
        scan.close();
       


    }
}
