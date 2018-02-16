public class Tree
{
   // instance variables - replace the example below with your own
   private Triangle leaves;
   private Square trunk;    /**
    * Constructor for objects of class Tree
    */
   public Tree()
   {
       // initialise instance variables
       leaves = new Triangle();
       trunk = new Square();
       setup();
   }    /**
    * An example of a method - replace this comment with your own
    *
    * @param  y  a sample parameter for a method
    * @return    the sum of x and y
    */
   public void setup()
   {
       // put your code here
       leaves.makeVisible();
       
       trunk.makeVisible();
       trunk.changeColor("black");
       trunk.moveVertical (80);
       trunk.moveHorizontal (-130);
       
       //grow();
   }
   
   public void grow()
   {
       //for (int i = 60; i <=100 ;i = i+10){
       // for (int j = 70; j <= 120 ; j = j+10){
        leaves.changeSize(100,120);
        //leaves.makeVisible();
        leaves.moveVertical(-30);      
      // }
    //}
     }

}