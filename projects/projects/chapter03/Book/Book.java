
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Constructor for objects of class Book
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        // initialise instance variables
      author = bookAuthor;
      title = bookTitle;
      pages = bookPages;
      refNumber = "";
      courseText = isCourseText;
    }

    /*
     * 
     * Methods
     */
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public void printDetails()
    {
         System.out.print("Author: " + author);
         System.out.print(", Title: " + title);
         System.out.print(", Pages: " + pages);
         
         String refNum = (refNumber.length() > 3) ? refNumber : "ZZZ";
         /* String refNum;
         if (refNumber.length() > 3){
            refNum = refNumber;"ZZZ";
         }
         else{
             refNum = "ZZZ";
         }
         */
         System.out.print( ", Ref Number: " + refNum);
         System.out.print( ", Borrowed: " + borrowed);
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
}
