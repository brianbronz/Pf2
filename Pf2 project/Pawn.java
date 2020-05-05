
/**
 * Write a description of class Pawn here.
 *
 * @author (K.L B.B)
 * @version (05.05.2020)
 */
// This pawn class is used to describe all the objects of a normal 8x8 chess table.
// The object of a chess game is to capture other objects, moving diagonally, back, forward right or left.
// 2nd class being written before any specific type of pawns, because we are going to use the inheritance method on the classes king , queen etc 
// and adopt info from this class here!
public abstract class Pawn
{

    // instance variables for our Pawn class.
   
    private boolean white = false;
    private boolean black = false;
    private boolean captured = false;

    /**
     * Constructor for objects of class Pawn
     */
     
    public Pawn(boolean white, boolean black, boolean captured)
    {
        // initialization of our instance variables.
        this.white = white;
        this.black = black;
    }

     /**
     * The isWhite method, checking if the pawn has the white color
     
    
     */
    public boolean isWhite()
    {
        return true;
    }
    
     
   /**
   * Like in the first class, we are going to again use a method set+ name
   * of instance variable that we do not plan it to return anything.
   */
     public void setWhite(boolean white)
      {
        this.white = white;
          
     }

   
  /**
   * The isBlack method, checking if any pawn has the black colour.
   */
    public boolean isBlack()
   {
      return true;
    }
   
  /**
   * Another method setBlack, which also does not return anything 
   */
   public void setBlack(boolean black)
   {
       this.black = black;
    }
   
     //now its the turn of the capture instance variable.
  
  /**
   * check whether some specific pawn is captured, and act accordingly aka return ture
   */
  public boolean isCaptured()
   {return true;
}
 
  /**
   * Now with the set method, which we do not expect it to return anything.
   * 
   */
  public void setCaptured(boolean captured)
  {
      this.captured = captured;
    }

     /**
     * Lastly we need to implement one method that is going to check
     * whether any of the pawns are able to change position in some 
     * direction, dependent of the type of the pawn.
     */
    //when we want to move a pawn, we must know the current state of the rectangle it is placed in, and until where we intend to move it.
    public abstract boolean pawnMove( Rectangle rectangle, Rectangle start, Rectangle end);
}