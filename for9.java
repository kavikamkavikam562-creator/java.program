import java.util.Scanner;
public class for9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of workout sessions : ");
        int N = scan.nextInt();

        int calories = 0;
        String intensity = "";
        int total_duration = 0;
        int total_calories = 0;
        double  average_calories = 0;

        for (int i = 1;i <= N;i++)
        {
            System.out.print("Enter the Exercise Type : ");
            String type = scan.next();
            System.out.print("Enter the duration : ");
            int duration = scan.nextInt();

            if(type.equals("Running"))
            {
                calories = 10;
                intensity = "High";
            }
            else if(type.equals("Swimming"))
            {
                calories = 12;
                intensity = "High";
            }
            else if(type.equals("Cycling"))
            {
                calories = 8;
                intensity = "Moderate";
            }
            else if(type.equals("Gym"))
            {
                calories = 7;
                intensity = "Moderate";
            }
            else if(type.equals("Walking"))
            {
                calories = 4;
                intensity = "Low";
            }
            int burned = calories * duration;

            System.out.println("Session "+i+": "+type);
            System.out.println("Duration : "+duration+" minutes");
            System.out.println("Calories Burned : "+burned);
            System.out.println("Intensity : "+intensity);

            total_duration = total_duration + duration;
            total_calories = total_calories + burned;
            average_calories = total_calories / N;

        }
        String fitness_level = "";
        if(total_calories < 300)
        {
            fitness_level = "Beginner";
        }
        else if(total_calories >= 300 && total_calories <= 1000)
        {
            fitness_level = "Intermediate";
        }
        else if(total_calories > 1000)
        {
            fitness_level = "Advanced";
        }
        System.out.println("Total Workouts : "+N);
        System.out.println("Total Durations : "+total_duration);
        System.out.println("Total Calories Burned : "+total_calories);
        System.out.println("Total Calories per Session : "+average_calories);
        System.out.println("Fitness Level : "+fitness_level);
          
            
        }
            
        }
