
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double minTemp, double maxTemp)
    {
        // initialise instance variables
        temperature = 15.0;
        if (minTemp < temperature){
            min = minTemp;
        }
        if (maxTemp > temperature){
            max = maxTemp;
        }
        increment = 5;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void warmer()
    {
        double temp = temperature + increment;
        // put your code here
        if (temp <= max){
           temperature=temp; 
        }
    }
    
    public void colder()
    {
        double temp = temperature - increment;
        // put your code here
        if (temp >= min){
           temperature=temp;
        }
    }
    
    public void setIncrement (double tempIncrement)
    {
        if(tempIncrement >=0){
            increment = tempIncrement;
        }
    }
}
