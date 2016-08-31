
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter
{
    // instance variables - replace the example below with your own
    private int value;
    private String name;
    /**
     * Constructor for objects of class Counter
     */
    public Counter(String str)
    {
        // initialise instance variables
        value = 0;
        this.name = str;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void increment()
    {
        // put your code here
       value++;
    }

    public int getCurrentValue()
    {
        return value;
    }

    public String toString()
    { 
        return name + ": "+ value ; 
    }
}

