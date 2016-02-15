import java.util.ArrayList;
import java.util.Iterator;
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
     * El a�o no nos importa. En caso de que el parametro contenga un valor 
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
            System.out.println("Error en el mes dado");
            numMember = -1;
        }
        return numMember;
    }
    
    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado a�o se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El a�o en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> purge(int mes, int anno)
    {
        ArrayList <Membership> miembrosEliminados = new ArrayList<>();
        if (mes <12 || mes >= 0) {
            Iterator <Membership> index = member.iterator();
            while (index.hasNext()) {
                Membership member = index.next();
                if (member.getMonth() == mes && member.getYear() == anno) {
                    miembrosEliminados.add(member);
                    index.remove();
                }
            }
        }
        else {
            System.out.println("Error en el mes dado");
        }
        return miembrosEliminados;
    }
    
    
    
    
    
    
    
    
    
}
