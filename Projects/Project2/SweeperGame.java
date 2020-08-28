/*
   Programmer: Nazim Zerrouki
   Program: Project 2
   Date: 2/11/18
*/

import java.util.*;
import java.lang.*;

public class SweeperGame {    // Declaring instance variables
   private int treasureX;
   private int treasureY;
   private char[][] gameBoard;
   private int totalMoves;
   private boolean found;
   private int height;
   private int width;
   
   /* Invoking Constructor
      Parameters: integer, integer
   */
   public SweeperGame(int height, int width) {     // Initializing instance variables based on two integer parameters
      totalMoves = 0;
      this.height = height;
      this.width = width;
      boolean found = false;
      Random r = new Random();      // Random is used to generate the location of the treasure based on the height and width parameters
      treasureY = r.nextInt(height);
      treasureX = r.nextInt(width);
      gameBoard = new char[height][width];
      for (int i = 0; i < height; i++) {
         for (int j = 0; j < width; j++) {
            gameBoard[i][j] = ' ';
         }
      }
      gameBoard[treasureY][treasureX] = 'T';
   }
   
   /* Method: Check whether or not previous coordinates have been searched
      Parameters: int, int
      Return: Boolean
   */
   public boolean beenSwept(int x, int y) {
      boolean swept = false;
      y = this.getBoardHeight() - y - 1;     // Transforms y coordinate to initialize (0,0) at the bottom-left corner
      if (gameBoard[y][x] != ' ' && gameBoard[y][x] != gameBoard[treasureY][treasureX]) {    // returns true if the location on the board is equal to a Manhattan value
         swept = true;
      }
      return swept;
  }
   
   /* Method: To check if whether or not the treasure's location was discovered
      Parameters: int, int
      Return: Boolean
   */
   public boolean treasureFound(int x, int y) {
      y = this.getBoardHeight() - y - 1;     // Transforms y coordinate
      if (gameBoard[y][x] == gameBoard[treasureY][treasureX]) {
         return true;
      }
      return false;
   }
   
   /* Method: Check if the x and y coordinates selected is within the board's parameters (height, width)
      Parameters: int, int
      Return: Boolean
   */
   public boolean checkOutOfBounds(int x, int y) { 
      if ((x >= 0 && x < this.getBoardWidth()) && (y >= 0 && y < this.getBoardHeight())) {   // Returns true if x and y coordinates are within the width and height of the board respectively
         return true;
      } 
      return false;     // Returns false otherwise
   }
   
   /* Method: Returns the height of the board
      Parameters: None
      Return: int
   */   
   public int getBoardHeight() {
      return height;
   }
   
   /* Method: Returns the width of the board
      Parameters: None
      Return: int
   */
   public int getBoardWidth() {
      return width;
   }
   
   /* Method: Returns the total moves used to find the treasure
      Parameters: None
      Return: int
   */
   public int getTotalMoves() {
      return totalMoves;
   }
   
   /* Method: Converts coordinate selected to Manhattan value if swept
      Parameters: int, int
      Return: boolean
   */
   public boolean digSand(int x, int y) {
      y = this.getBoardHeight() - y - 1;     // Transforms y coordinate
      if (gameBoard[y][x] == gameBoard[treasureY][treasureX]) {
         totalMoves++;     // Increments total moves made once treasure is found
         return true;      // Returns true if treasure is found
      }
      else {               // If treasure not found
         found = true;     // set found boolean to true
         int a = Math.abs((y - treasureY)) + Math.abs((x - treasureX));      // Calculates Manhattan distance away from treasure by taking sum of horizontal and vertical components
         char b = (char)(a + 48);        // Converts the manhattan distance to its character value
         gameBoard[y][x] = b;            // Sets the coordinate selected to the proper Manhattan distance
         if (!this.beenSwept(x, y)) {
            totalMoves++;                // Increments total moves made only if the location has been selected once
         }
         return false;                   
      }
   }
   
   /* Method Override to give a String representation of the Constructor */
   public String toString() {
      String result = "";        // Declare string
      for (int i = 0; i < this.getBoardWidth(); i++) {      // Creates the top of the board depending on the width of the board
         result += ",~";
      }
      result += ",";
      result += "\n";
      for (int i = 0; i < this.getBoardHeight(); i++) {     // Creates the walls of each cell depending on the height and width fo the board
         result += ";";
         for (int j = 0; j < this.getBoardWidth(); j++) {
            if (!this.treasureFound(j, i) && (i == treasureY && j == treasureX)) {
               gameBoard[i][j] = ' ';     // Sets the cell of the treasure's location to be displayed as an empty character if treasure has not been found
            }
            else if (this.treasureFound(j, i) && (i == treasureY && j == treasureX)) {
                  gameBoard[i][j] = 'T';  // Sets the cell of the treasure's location to be displayed once treasure is found
            }
            
            result += gameBoard[i][j] + ";";  // Increments each cell of the board to be displayed
         }
         result += "\n";
         for (int k = 0; k < this.getBoardWidth(); k++) {      // Creates the ceiling and floor of each cell depending on the width of the board
            result += "`~";
         }
         result += "`";
         result += "\n"; 
      }
      return result;    // Returns all of the gameBoard's contents once all of the contents has been incremented to it     
   }
}

