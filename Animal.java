
/**
 * Write a description of Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class Animal {
    
    
    public static final double FAVNUMBER = 1.6180;
    //fields or variables are attributes of the object
    private String name;
    private int weight;
    //boolean types are either true or false
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID; 
    private char favoriteChar;
    private double speed;
    private float height;
    
    //can only be accessed by other code in the package
    //static variables are going to be shared with every Animal object      
    protected static int numberOfAnimals = 0;
    
    static Scanner userInput = new Scanner(System.in);
    
    public Animal() {
        //everytime a new object (animal) is created, the static variable numberOfAnimals is
        //increased by 1.
        numberOfAnimals++;
        
        //math functions 
        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);
        
        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);
        
        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);
        
        int divOfNumbers = 5 / 1;
        System.out.println("5 / 1 = " + divOfNumbers);
        
        //modulus 
        int modOfNumbers = 5 + 1;
        System.out.println("5 % 1 = " + sumOfNumbers);
        
        System.out.print("Enter the name: \n");
        
        if (userInput.hasNextLine()) {
            
            this.setName(userInput.nextLine());
        
        }
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public boolean getHasOwner() {
        return hasOwner;
    }

    public static void main(String[] args) {
        Animal theAnimal = new Animal();
    }


}
