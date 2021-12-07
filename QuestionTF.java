/*
   Christiana Smith
   November 7, 2021
   Description: True/False Question subclass that extends Question
*/
import java.util.*;

public class QuestionTF extends Question{
   //Instance fields
   private String correctA;
   
   //Constructor
   public QuestionTF(String question, int points, String correctA){
      super(question,points);
      this.correctA = correctA;
   }
   
   //methods
   /*
      Method: Return the correct answer for the question
      Parameter: none
      Return: String
   */
   public String getAnswer(){
      return correctA;
   }

}