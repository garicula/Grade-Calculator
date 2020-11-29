// Garrick Morley
// ISYS 216 001, Fall 2019
// Dr. Kinuthia
// Assignment Five Source

////////////////////////////////////////////////////////////////
//This program calculates letter grades and average test score//
////////////////////////////////////////////////////////////////

package morleygassignmentfive;

import java.util.Scanner;

public class MorleyGAssignmentFive {

    //main class
    public static void main(String[] args) {
        
        //create scanner to obtain grades
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables for grades and students
        double averageGrade = 0;
        int grade1, grade2, grade3, grade4, grade5;
        char student1 = 0;
        char student2 = 0;
        char student3 = 0;
        char student4 = 0;
        char student5 = 0;
        
        //calculate letter grades from scores by calling method determineGrade
        System.out.println("Enter test grade for student 1: ");
            grade1 = keyboard.nextInt();
            student1 = determineGrade(grade1);
            
        System.out.println("Enter test grade for student 2: ");
            grade2 = keyboard.nextInt();
            student2 = determineGrade(grade2);
            
        System.out.println("Enter test grade for student 3: ");
            grade3 = keyboard.nextInt();
            student3 = determineGrade(grade3);
            
        System.out.println("Enter test grade for student 4: ");
            grade4 = keyboard.nextInt();
            student4 = determineGrade(grade4);
            
        System.out.println("Enter test grade for student 5: ");
            grade5 = keyboard.nextInt();    
            student5 = determineGrade(grade5);
        
        //calculate average score by calling method averageGrade    
        averageGrade = calcAverage(grade1, grade2, grade3, grade4, grade5);    
        
        //print the students individual letter grades
        System.out.println("The letter grades are as follows: ");
        System.out.println("Student 1: " + student1);        
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        System.out.println("Student 4: " + student4);
        System.out.println("Student 5: " + student5);
        
        //print the average test score
        System.out.println("The average grade was: " + averageGrade);
    }        

    /**
     *
     * @param grade1
     * @param grade2
     * @param grade3
     * @param grade4
     * @param grade5
     * @return
     */
    
//create method to calculate average test score
public static double calcAverage(double grade1, double grade2, double grade3,
        double grade4, double grade5){
    
    double average = 0;
    average = ((grade1 + grade2 + grade3 + grade4 + grade5)/5);
    return average;}    

    /**
     *
     * @param score
     * @return
     */
//create method to determine a letter grade from a score
public static char determineGrade(int score){
       
    if (score >= 90 && score <= 100){
        return 'A';}
    else if (score >= 80 && score < 90){
        return 'B';}
    else if (score >= 70 && score < 80){
        return 'C';}
    else if (score >= 60 && score < 70){
        return 'D';}
    else{
        return 'F';}
    }
}                
    

