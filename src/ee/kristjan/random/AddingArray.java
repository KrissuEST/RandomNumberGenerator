package ee.kristjan.random;

import java.util.Random;

/* This class made for generating 6 random numbers what must be unique. */
public class AddingArray
{
	protected Integer[] randNumToArray()
	{
		//Create a random number generator.
		Random numGenerator = new Random();

		//Create an array.
		Integer[] arrayRand = new Integer[6];

		//Copy random numbers into arrayRand.
		for (int loop = 0; loop < 6; loop++)
		{
			//numGenerator.nextInt(6)) + 1   <-It means that max random number amount can be 6.
//			arrayRand[loop] = Math.abs(numGenerator.nextInt(48)) + 1;
			arrayRand[loop] = Math.abs(numGenerator.nextInt(6)) + 1;
			for (int loop2=0; loop2<loop; loop2++)
			{
				if (arrayRand[loop]==arrayRand[loop2])
				{
					loop--;
					break;    //break - Breaks the cycle.
				}
			}
		}
		return arrayRand;   //return - Exits the mehtod and not processing the other part of the code.
	}
}
