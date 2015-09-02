

/**

 * BeadedJean is a BasicJean with beads designed in a pattern

 * 

 * �FLVS 2007

 * @author R. Enger 

 * @version 5/10/2007

 */

public class BeadedJean extends BasicJean

{

	// instance variables - replace the example below with your own

	private int numBeads;

	private String pattern;



	/**

	 * Constructor for objects of class beadedJean

	 */

	public BeadedJean(int np, int nb)

	{

		// initialise instance variables

		super(np);

		numBeads = nb;

	}



	

    public void design()

    {

        if (numBeads == 10)

           pattern = "circle";

        else if (numBeads == 20)

            pattern = "heart";

        else if (numBeads == 30)

            pattern = "spiral";

        else 

            pattern = "random";

    }

    public int getNumBeads() 

    {

        return numBeads;

    }

    public String getPattern()

    {

        return pattern;

    }

    public String toString()

    {

        return "This pair of Jeans uses " + numBeads + " beads in a " + pattern;

    }

}

