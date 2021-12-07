/*
   Christiana Smith
   November 7, 2021
   Description: Player object
*/

import java.util.*;

public class Player{
   //Instance fields
   String firstName;
   String lastName;
   int score = 0;
   
   //Constructor
   public Player(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   //Methods
   
   /*
      Method: Return the player's first name
      Parameter: none
      Return: String
   */
   public String getFirstName(){
      return firstName;
   }
   
   /*
      Method: Return the player's last name
      Parameter: none
      Return: String
   */
   public String getLastName(){
      return lastName;
   }
   
   /*
      Method: Return the player's total score
      Parameter: none
      Return: int
   */
   public int getPlayerScore(){
      return score;
   }
   
   /*
      Method: Update the player's total score
      Parameter: point
      Return: void
   */
   public void updatePlayerScore(int point){
      score += point;
   }
   
   //@verride toString() method   
   public String toString(){
      return getFirstName() + " " + getLastName() + ", your game is over!\nYour final score is " 
                        + getPlayerScore() + " points. \nBetter Luck next time!";
   }
}