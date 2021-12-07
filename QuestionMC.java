/*
   Christiana Smith
   November 7, 2021
   Description: Multiple choice Question subclass that extends Question
*/
import java.util.*;

public class QuestionMC extends Question{
   //Instance fields 
   private ArrayList<String> mcEntries = new ArrayList<String>();
   private String correctA;
   
   //constructor
   public QuestionMC(String question, int points, ArrayList<String> mcEntries, String correctA){
      super(question, points);
      this.mcEntries = mcEntries;
      this.correctA = correctA;
   }
   
   //Methods
   /*
      Method: Return the correct answer for the question
      Parameter: none
      Return: String
   */
   public String getAnswer(){
      return correctA;
   }
   //@verride toString() method
   public String toString(){
      return "Points: " + super.getPoints() + "\nQuestion: " + super.getQuestion() + "\n" + mcEntries;
   }  

}