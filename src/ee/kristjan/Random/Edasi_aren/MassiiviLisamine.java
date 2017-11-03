package ee.kristjan.Random.Edasi_aren;

import java.util.Random;

/* This class made for generating 6 random numbers what can't compare to each other. */
public class MassiiviLisamine
{
	protected Integer[] randNumToArray() 
	{
	    //Create a random number generator
		Random numGenerator = new Random();
		
		//Create an array
		Integer[] arrayRand = new Integer[6];

		//Copy random numbers into arrayRand
		for (int loop = 0; loop < 6; loop++) 
		{
			//numGenerator.nextInt(7)) + 1 <-Tähendab, et max suvaline arv võib tulla 7.
		    arrayRand[loop] = Math.abs(numGenerator.nextInt(48)) + 1; 
		    for (int loop2=0; loop2<loop; loop2++)
		    {
		        if (arrayRand[loop]==arrayRand[loop2])
		        {
		            loop--; 
		            break;
		        }
		    }
		}
		return arrayRand;
	}
}
