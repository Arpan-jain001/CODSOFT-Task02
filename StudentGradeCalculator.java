import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("Enter the number of subjects: ");

        int numSubjects = sc.nextInt();
        System.out.println("All Subject marks out of 100 (defaut: ");

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("================================");
            System.out.println("Enter marks for subject " + i + " : ");


            int marks = sc.nextInt();
            totalMarks += marks;
        }
        System.out.println("================================");

        float averagePercentage = (float) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
            System.out.println("You are fail: try again :");
        }

        System.out.println("Your Total Marks is : " + totalMarks + " Out of " + (numSubjects * 100));
        System.out.println("================================");

        System.out.printf("Your average percentage is : %.2f %%\n", averagePercentage);
        System.out.println("================================");

        System.out.println("Your Grade is : " + grade);
        System.out.println("================================");

        System.out.println("Thanks for using this code: \n");
    }
}