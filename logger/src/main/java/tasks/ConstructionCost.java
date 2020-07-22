package tasks;
import java.util .*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class ConstructionCost
{
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCost.class);
	ConstructionCost()
	{
			double constructionCost;
		    Scanner sc=new Scanner (System. in);
		    LOGGER.fatal("Choose the Material Standard of the House:\n");
		    LOGGER.fatal("Standard materials-->0\n");
		    LOGGER.fatal("Above Standard materials-->1\n");
		    LOGGER.fatal("High Standard Materials-->2\n");
		    LOGGER.fatal("High Standard and Auotomated house-->3\n");
		    int material=sc.nextInt();
		    if(material>=4 ) {
		    	LOGGER.fatal("Please choose Material Standard as Mentioned");
		    }
		    LOGGER.fatal("Give area of the house:\n ");
		    double area=sc.nextDouble();
		    if(material==0)
		    {
		    	constructionCost=area*1200;
		    	LOGGER.fatal("The Construction cost in INR:\n"+constructionCost);
		    }
		    else  if(material==1)
		    {
		    	constructionCost=area*1500;
		    	LOGGER.fatal("The Construction cost in INR:\n"+constructionCost);
		    }
		    else  if(material==2)
		    {
		    	constructionCost=area*1800;
		    	LOGGER.fatal("The Construction cost in INR:\n"+constructionCost);
		    }
		    else if(material==3)
		    {
		    	constructionCost=area*2500;
		    	LOGGER.fatal("The Construction cost in INR:\n"+constructionCost);
		    }
		    else {
		    	LOGGER.fatal("Cannot Calculate the Constrution Cost\n");
		    }
		    	
		   
	}
	
    public static void main (String args[ ])
{
    ConstructionCost cc=new ConstructionCost();
   }
}