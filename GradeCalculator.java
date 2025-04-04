import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from the user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;

        // Prompt the user to enter their score
        System.out.print("Enter your score: ");
        
        // Validate input to ensure it is a valid number
        while (true) {
            try {
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100. Please enter a valid score.");
                } else {
                    break; // exit loop if input is valid
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number between 0 and 100.");
            }
        }

        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        // Determine the letter grade
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to allow the user to input multiple scores
    public static void processMultipleScores() {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {
            // Get the student's score and calculate the grade
            double score = getStudentScore();
            String grade = calculateGrade(score);

            // Display the calculated grade to the user
            System.out.println("Your grade is: " + grade);

            // Ask the user if they want to enter another score
            System.out.print("Do you want to enter another score? (y/n): ");
            continueInput = scanner.nextLine();
        }

        System.out.println("Thank you for using the grade calculator!");
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Call the method to process multiple scores
        processMultipleScores();
    }
}