import java.util.*;
import java.io.*;

public class DungeonRun {

    public static void main(String[] args) throws FileNotFoundException {
        
        /*
            Testing Files:
                adventure1.txt
                adventure2.txt
                adventure3.txt

                The files will have the following format; the first line will
                be an integer representing the total number of items and lines
                then a list of every item in the format of the name followed
                by the weight, the value, and finally size.

                <total items:int>
                <Name:String> <weight:int> <value:int> <size:int>
                <Name:String> <weight:int> <value:int> <size:int>
                ...
        */
        
        ArrayList<Item> myItems = new ArrayList<>();


        // TODO Read in the items from file into a list
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the file to scan: ");
         String file = input.next();
         Scanner ip = new Scanner(new File(file));
         String line = "";
         while(ip.hasNext()) {
            line = ip.nextLine();
            String[] lineArr = line.split(" ");
            String name = lineArr[0];
            int weight = Integer.parseInt(lineArr[1]);
            int value = Integer.parseInt(lineArr[2]);
            int size = Integer.parseInt(lineArr[3]);
            Item i = new Item(name, weight, value, size);
            myItems.add(i);
         }

        // Print out the list of items
        System.out.println("Your treasure room has: ");
        for (Item item : myItems) {
            System.out.println("  > " + item);
        }

        // Learn about your adventurer
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("How much can you carry? ");
        int weight = sc.nextInt();
        System.out.print("How much can your pack hold? ");
        int size = sc.nextInt();

        // Create your adventurer
        Adventurer ad = new Adventurer(name, size, weight);
        // Make the recursive call
        Backpack optimal = ad.optimizeTreasure(myItems);
        // Print out the backpack and its content
        System.out.println(name + " this is your optimal treasure!");
        System.out.println(optimal);
    }
}