import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> member;
    // Array que almacena los socios de cada mes
    private int[] meses;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        member = new ArrayList<Membership>();
        meses = new int[12];
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership members)
    {
        member.add(members);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return member.size();
    }
    
    /**
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int  joinedMonth(int mes) {
        int numMember = 0;
        
        if (mes < 12 || mes >= 0) {
            for(Membership miembro : member) {
                if (miembro.getMonth() == mes) {
                    numMember++;
                }
            }
        }
        else {
            numMember = -1;
        }
        return numMember;
    }
    
    
    
    
    
    
    
    
    
    
    
}
