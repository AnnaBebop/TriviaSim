/*
   Christiana Smith
   November 7, 2021
   Description: abstract Question object
*/
import java.util.*;

public abstract class Question{
   //Private fields
   private String questions;
   private int points;
   private String correctA;
   
   //Constructor
   public Question(String questions, int points){
      this.questions = questions;
      this.points = points;
   }
   
   //Methods
   /*
      Method: Return question
      Parameter: none
      Return: String
   */
   public String getQuestion(){
      return questions;
   }
   /*
      Method: Return point value of question
      Parameter: none
      Return: int
   */
   public int getPoints(){
      return points;
   }
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
      return "\nPoints: " + getPoints() + "\nQuestion: " + getQuestion();
   }
}