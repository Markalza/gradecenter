/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecenter;

import java.util.Scanner;

public class GradeCenter {

 public static void main(String[] args) {
          Scanner keyboard = new Scanner(System.in);
        
        System.out.printf("Please enter a grade: ");
        double grade1 = keyboard.nextFloat();
        
        System.out.printf("Please enter a grade: ");
        double grade2 = keyboard.nextFloat();
        
        System.out.printf("Please enter a grade: ");
        double grade3 = keyboard.nextFloat();
        
        System.out.printf("Please enter a grade: ");
        double grade4 = keyboard.nextFloat();
        
        System.out.printf("Please enter a grade: ");
        double grade5 = keyboard.nextFloat();
        
        String lettergrade = letterGrade (grade1,grade2,grade3,grade4,grade5);
        String lettergrade2 = letterGrade2 (grade1,grade2,grade3,grade4,grade5);
        String lettergrade3 = letterGrade3 (grade1,grade2,grade3,grade4,grade5);
        String lettergrade4 = letterGrade4 (grade1,grade2,grade3,grade4,grade5);
        String lettergrade5 = letterGrade5 (grade1,grade2,grade3,grade4,grade5);
        /// make string for average lettergrade ******* PASS THROUGH ARGUMENT
        double avg = Average(grade1,grade2,grade3,grade4,grade5);
        System.out.printf("The mark for the first course was %.1f%%, %s%n",grade1,lettergrade);
        
        System.out.printf("The mark for the second course was %.1f%%, %s%n",grade2,lettergrade2);
        
        System.out.printf("The mark for the third course was %.1f%%, %s%n",grade3,lettergrade3);
        
        System.out.printf("The mark for the fourth course was %.1f%%, %s%n",grade4,lettergrade4);
        
        System.out.printf("The mark for the fifth course was %.1f%%, %s%n",grade5,lettergrade5);
                
        System.out.printf("The average overall was %.1f%% %n", avg);
        
        

    } //end of main method
    public static double Average (double grade1,double grade2,double grade3,double grade4,double grade5)
    {
        return (double) (grade1+grade2+grade3+grade4+grade5)/5;
        
    } //overall average method
     public static String letterGrade (double grade1,double grade2,double grade3,double grade4,double grade5)
 {
    if (grade1 <= 100 && grade1 >= 80) {
        return "the letter grade is A";
    } else if (grade1 < 79 && grade1>= 70) {
        return "the letter grade is B";
    } else if (grade1 < 69 && grade1>= 60) {
        return "the letter grade is C";
    } else if (grade1 < 59 && grade1 >= 50) {
        return "the letter grade is D";
    } else if (grade1 < 49) {
        return "the letter grade is F";
    } else {
        return "the letter grade is A";
    }
}
     public static String letterGrade2 (double grade1,double grade2,double grade3,double grade4,double grade5)
 {
    if (grade2 <= 100 && grade2 >= 80) {
        return "the letter grade is A";
    } else if (grade2 < 79 && grade2>= 70) {
        return "the letter grade is B";
    } else if (grade2 < 69 && grade2>= 60) {
        return "the letter grade is C";
    } else if (grade2 < 59 && grade2 >= 50) {
        return "the letter grade is D";
    } else if (grade2 < 49) {
        return "the letter grade is F";
    } else {
        return "the letter grade is A";
    }
}
      public static String letterGrade3 (double grade1,double grade2,double grade3,double grade4,double grade5)
 {
    if (grade3 <= 100 && grade3 >= 80) {
        return "the letter grade is A";
    } else if (grade3 < 79 && grade3>= 70) {
        return "the letter grade is B";
    } else if (grade3 < 69 && grade3>= 60) {
        return "the letter grade is C";
    } else if (grade3 < 59 && grade3 >= 50) {
        return "the letter grade is D";
    } else if (grade3 < 49) {
        return "the letter grade is F";
    } else {
        return "the letter grade is A";
    }
}
       public static String letterGrade4 (double grade1,double grade2,double grade3,double grade4,double grade5)
 {
    if (grade4 <= 100 && grade4 >= 80) {
        return "the letter grade is A";
    } else if (grade4 < 79 && grade4>= 70) {
        return "the letter grade is B";
    } else if (grade4 < 69 && grade4>= 60) {
        return "the letter grade is C";
    } else if (grade4 < 59 && grade4 >= 50) {
        return "the letter grade is D";
    } else if (grade4 < 49) {
        return "the letter grade is F";
    } else {
        return "the letter grade is A";
    }
}
        public static String letterGrade5 (double grade1,double grade2,double grade3,double grade4,double grade5)
 {
    if (grade5 <= 100 && grade5 >= 80) {
        return "the letter grade is A";
    } else if (grade5 < 79 && grade5>= 70) {
        return "the letter grade is B";
    } else if (grade5 < 69 && grade5>= 60) {
        return "the letter grade is C";
    } else if (grade5 < 59 && grade5 >= 50) {
        return "the letter grade is D";
    } else if (grade5 < 49) {
        return "the letter grade is F";
    } else {
        return "the letter grade is A";
    }
}

    } //class
    
