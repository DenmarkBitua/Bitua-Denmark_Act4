package BituaAct4GPA;

import java.util.Scanner;

public class BituaActi4GPA {

    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        
    int score;
        System.out.println("Your UPCAT Exam Score:");
        score = scn.nextInt();
        
    if (score >= 70){
        
    double GPA = 3.5;
         System.out.println("Your GPA is above: " + GPA); 
         System.out.println("Congratulations,You are Eligible for Admission");
    }else if (score <= 70){
        
    double GPA = 3.0;
         System.out.println("Your GPA is below:" + GPA);
         System.out.println("You are not eligible for admission");
        }
    scn.close();
    
    }
    
}
