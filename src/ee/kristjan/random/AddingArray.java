package ee.kristjan.random;

import java.util.Random;

/** This class is made for generating 6 random numbers what must be unique. */
public class AddingArray
{
	protected Integer[] randNumToArray()
	{
		//Create a random number generator.
		Random numGenerator = new Random();
		
		//Create an array, with 6 spots.
		Integer[] arrayRand = new Integer[6];
		
		//Copy random numbers into arrayRand.
		for (int loop = 0; loop < 6; loop++)
		{
//			arrayRand[loop] = Math.abs(numGenerator.nextInt(6)) + 1;   //<- For testing, it means that max random number amount can be 6.
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
