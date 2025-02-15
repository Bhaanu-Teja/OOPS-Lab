import java.util.Scanner;

public class Grade_Of_Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the marks of the student: ");
        int marks = scanner.nextInt();
        
        char grade;
        
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 35) {
            grade = 'D';
        } else {
            grade = 'F';  // Fail
        }
        
        System.out.println("The grade of the student is: " + grade);
        
        scanner.close();
    }
}
