
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private int age;
    private String gender;
    private int weightInKg;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(int age, String gender, int weightInKg)
    {
        this.age = age;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
