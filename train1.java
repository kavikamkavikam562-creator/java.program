import java.util.Scanner;
public class train1{
    public static void main(String[] args){

        Scanner scan =  new Scanner(System.in);

        String name = scan.next();
        int age = scan.nextInt();
        float CGPA = scan.nextFloat();
        char grade = scan.next().charAt(0);

        int ans = (int)(CGPA * 100);
        CGPA = (float)ans / 100;

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("CGPA : "+CGPA );
        System.out.println("Grade : "+grade);


        
    }
}