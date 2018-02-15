import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    private HashMap<String, String> contactos;
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        contactos = new HashMap<>();
    }

    /**
     * Agrega contactos y su numero al HashMap.
     */
    public void enterNumber(String name, String number)
    {
        contactos.put(name, number);
    }
    
    /**
     * Encuentra el numero asignado al nombre que
     * pasamos por parametro.
     */
    public String lookupNumber(String name)
    {
        String numero = contactos.get(name);
        return numero;
    }
    
    /**
     * Imprime todos los nombres.
     */
    public void printAllNames()
    {
        System.out.println(contactos.keySet());
    }
}
