
/**
 * Aggiungi qui una descrizione della classe Tower
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Tower{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private int x;
    private int y;
    private Pawn state;

    /**
     * Constructor for objects of classe  Tower
     */
    public Tower(int x, int y)
    {
        
        this.x = x;
        this.y = y;
        
    }

    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    public int getTower()
    {
        // metti qui il tuo codice
        return x;
    }
    
    /**
     * method to get the black tower
     * 
     */
    public  boolean getBTower(){
        return true;
    }
    
    /**
     *  method to get the white tower
     */
    public boolean getWTower(){
        return true;
    }
}
