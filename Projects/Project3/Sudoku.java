/*
   Programmer: Nazim Zerrouki
   Program: Sudoku Solver
   Date: 3/05/18
*/
import java.util.*;
import java.io.*;

// Initialize instance variables
public class Sudoku {
   private int[][] puzzle = new int[9][9];

// Invoke Constructor
// Iterates through the file using a Scanner as the parameter and assigns the integers to each cell of the puzzle array.
   public Sudoku(Scanner file) {
      while (file.hasNext()) {
         for (int i = 0; i < puzzle[0].length; i++) {
            for (int j = 0; j < puzzle[0].length; j++) {
               puzzle[i][j] = file.nextInt();
            }
         }
      }
   }
   
   // Method: Create a Sudoku Puzzle containing the contents of the array. Provides string representation of Object.
   // Parameters: None
   // Return: String
   public String toString() {
      String result = "";
      for (int i = 0; i < puzzle[0].length; i++) {
         result += " ,~ ";
      }
      result += ",";
      result += "\n";
      for (int i = 0; i < puzzle[0].length; i++) {
         result += ";";
         for (int j = 0; j < puzzle[0].length; j++) {
            result += " " + puzzle[i][j] + " ;";
         }
         result += "\n";
         for (int k = 0; k < puzzle[0].length; k++) {     
            result += " `~ ";
         }
            result += "`";
            result += "\n"; 
      }
      return result;
   } 
   
   // Method: Locates duplicate values within rows, columns, and a 3x3 subgrid and returns true if there are no duplicate values.
   // Parameters: int, int, int
   // Return: boolean
    public boolean checkConflict(int i, int j, int value){
        // Check the row set to i.
        // Populate hashset with row at i.
        // Add the value at i and j.
        HashSet<Integer> set = new HashSet<Integer>();
        for(int col = 0; col < puzzle[0].length;col++){                     
            set.add(puzzle[i][col]);
        }
        // Check for duplicate by adding the value.
        boolean notduplicate1 = set.add(value);
        if (notduplicate1){
            set = new HashSet<Integer>();
        // Populate it with the column at j.
            for(int row = 0; row < puzzle[0].length; row++) {
               set.add(puzzle[row][j]);
            }
               // Add the value to hashset to check for duplicate.
               boolean notduplicate2 = set.add(value);
               if(notduplicate2){
                   // Check the grid.
                    set = new HashSet<Integer>();
                    int startRow = (i/3)*3;
                    int startCol = (j/3)*3;
                    // Populate hashset from puzzle array.
                    for(int row = startRow; row <= startRow + 2; row++) {
                        for(int col = startCol; col <= startCol + 2; col++) {
                           set.add(puzzle[row][col]);
                        }                                               
                    }
                    //Check for duplicate.
                    boolean notduplicate3 = set.add(value);
                        if(notduplicate3)
                            return false;
                        else
                            return true;
               }
               else
                   return true;
       }
            
     return true;           
            
   }
   
   // Method: Solves the Sudoku Puzzle through recursion
   // Parameters: None
   // Return: boolean

   public boolean sudokuSolver() {
      // Iterates through the Sudoku Board.
      for (int row = 0; row < puzzle[0].length; row++) {
         for (int col = 0; col < puzzle[0].length; col++) {
            // Checks if there is a conflict when assigning one of the nine digits if it is an empty cell.
            if (puzzle[row][col] == 0) {
               for (int digit = 1; digit <= 9; digit++) {
               // Assigns digit if there is no conflict and returns true if recursive call is successful.
                  if (!checkConflict(row, col, digit)) {
                     puzzle[row][col] = digit;
                     if (sudokuSolver()) {
                        return true;
                     }
                 // If recursion failed, then empty cell remains empty and iterates through the next cells.
                     else {
                        puzzle[row][col] = 0;
                     }
                  }
               }
           // Returns false if puzzle is unsolvable.
           return false;
           }
        }
     }
 // Returns true if sudoku was solved.
  return true; 
  }
}

// Runs through Sudoku puzzle using file as an input.
   
class SudokuMain {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a Sudoku puzzle to solve: ");
      String file = input.next();
      Scanner ip = new Scanner(new File(file));
      Sudoku s = new Sudoku(ip);
      // Displays initial puzzle.
      System.out.println(s);
      // Solves Sudoku puzzle.
      s.sudokuSolver();
      // Displays solved puzzle.
      System.out.println(s);
   }
}