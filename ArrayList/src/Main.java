import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Second> arrayList = new ArrayList<Second>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

            while(choice !=4) {
                System.out.println("\n 1. Enter a Name to add into list : ");
                System.out.println(" 2. List All Elements : ");
                System.out.println(" 3. Remove the Name : ");
                System.out.println(" 4. Exit");
                System.out.println("Enter your choice : ");
                choice = input.nextInt();

                switch (choice) {
                    case 1 -> getName();
                    case 2 -> listName();
                    case 3 -> removeName();
                }
            }
    }
    static public void getName(){
        System.out.print("Enter Name here : ");
        arrayList.add(new Second(input.next()));
    }
    static public void listName(){
        for(Second i:arrayList){
            System.out.println("Name:--> " +i.name);
        }
    }
    static public void removeName(){
       String name;
       System.out.print("Enter Name to Delete : ");
       name = input.next();
       arrayList.removeIf(i -> i.getName().equals(name));
    }
}
