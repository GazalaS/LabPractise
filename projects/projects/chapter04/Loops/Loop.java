
/**
 * Write a description of class Loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loop
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Loop
     */
    public Loop()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void multipleOfFive()
    {
        x=10;
        while(x <= 95){
            System.out.println(x);
            x=x+5;
        }
    }
    
    public void add1To10(){
        x=1;
        int sum = 0;
        while(x<=10){
            sum += x;
            x++;
        }
        System.out.println(sum);
    }
    
    public void addAToB(int a, int b){
        int sum =0;
        
        while (a<=b){
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
