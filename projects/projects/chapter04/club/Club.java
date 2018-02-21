import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
         members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        //if (members.size > 0)
        return members.size();
    }
    
    public ArrayList purge(int month, int year){     
        //return 
        
        //ArrayList<Membership> removed = new ArrayList<>();
        ArrayList<Membership> removed = members.stream().filter(m -> {
                                        if ((month == m.getMonth() && year == m.getYear())) {
                                           return true;
                                        }
                                        else if (month < 1 || month > 12){
                                          System.out.println("Invalid Month. Month should be between 1 and 12");
                                          return false;
                                         }
                                        return false;
                                       })
                            .collect(Collectors.toCollection (ArrayList::new));
                        
         members.removeAll(removed);
         return removed;
        }
}