
/**
 * Write a description of class App here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class App
{

    public  static void main(String[] args)
    {
        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.toString();
        
        System.out.println(myCounter.getCurrentValue());
    }
}