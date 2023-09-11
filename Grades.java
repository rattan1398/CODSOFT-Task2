import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Number of subjects.
        System.out.println("Enter the number of subjects: ");
        int Subjects = in.nextInt();

        // Store the marks.
        int[] marks = new int[Subjects];

        // Get the marks for each subject.
        for (int i = 0; i < Subjects; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = in.nextInt();
        }

        // Calculate the total marks.
        int totalMarks = 0;
        for (int i = 0; i < Subjects; i++) {
            totalMarks += marks[i];
        }

        // Calculate the average percentage.
        float avgpercentage = (float) totalMarks / Subjects;

        // Calculate the grade.
        String grade;
        if (avgpercentage >= 90) {
            grade = "A";
        } else if (avgpercentage >= 80) {
            grade = "B";
        } else if (avgpercentage >= 70) {
            grade = "C";
        } else if (avgpercentage >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Display the results.
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + avgpercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
