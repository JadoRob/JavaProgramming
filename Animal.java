
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
        
        // hasNextInt, hasNextFloat, hasNextDouble, etc, returns true if it is the right data type
        
        if (userInput.hasNextLine()) {
            
            //nextInt, nextFloat, nextDouble
            this.setName(userInput.nextLine());
        
        }
        
        this.setFavoriteChar();
        this.setUniqueID();
        
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
    
    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }
    
    public byte getAge() {
        return age;
    }
    
    public void setAge(byte age) {
        this.age = age;
    }
    
    public long getUniqueID() {
        return uniqueID;
    }
    
    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }
    
    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;
        
        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
        // convert a long datatype into a string (string is an object). (Long.toString, Int.toString, Byte.toString)
        String stringNumber = Long.toString(maxNumber);
        
        
        // convert a string into a primitive
        int numberString = Integer.parseInt(stringNumber);
        System.out.println("Unique ID set to: " + this.uniqueID);
        
    }
    
    public char getfavoriteChar() {
        return favoriteChar;
    }
    
    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }
    
    public void setFavoriteChar() {
        
        int randomNumber = (int) (Math.random() * 126) + 1;
        this.favoriteChar = (char) randomNumber;
        
        if(randomNumber == 32) {
            
            System.out.println("Favorite character set to Space");
            
        } else if (randomNumber == 10) {
            
            System.out.println("Favorite character set to Newline");
            
        } else {
            
            System.out.println("Favorite character set to " + this.favoriteChar);
            
        }
        
        if ((randomNumber > 97) && (randomNumber < 122)) {
            
            System.out.println("Favorite character is a lowercase letter.");
            
        }
        
        if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
            
            System.out.println("Favorite character is a letter.");
            
        }
        
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
        
        switch(randomNumber) {
            
            case 8:
                System.out.println("Favorite character set to backspace");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Favorite character set to backspace");
                break;
            
            default :
                System.out.println();
                break;
            }
        
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }
    
    public void setHeight(float height) {
        this.height = height;
    }
    
    protected static void countTo(int startingNumber) {
        
        for(int i = startingNumber; i <= 100; i++) {
            
            if(i == 90) continue;
            
            System.out.println(i);
            
        }
    }
    
    protected static String printNumbers(int maxNumbers) {
    
        int i = 1;
        
        while (i < (maxNumbers / 2 )){
            System.out.println(i);
            i++;
            
            if(i == (maxNumbers /2 )) break;
        }
    
        Animal.countTo(maxNumbers/2);
    
        return "End of printNumbers";
    }     
    
    protected static void guessMyNumber() {
        
        int number;
        
        do {
            
            System.out.println("Guess Number up to 100");
            
            while(!userInput.hasNextInt()){
                
                   String numberEntered = userInput.next();
                   System.out.printf("%s is not a number\n", numberEntered);
                 
                }
                
                number = userInput.nextInt();
            
        } while (number != 50);
        
    }
    
    public String makeSound() {
        
        return "Grrrr";
        
    }
    
    public static void speakAnimal(Animal randAnimal) {
        
        System.out.println("Animal says " + randAnimal.makeSound());
        
    }
    
    public static void main(String[] args) {
        Animal theAnimal = new Animal();
    }
}
