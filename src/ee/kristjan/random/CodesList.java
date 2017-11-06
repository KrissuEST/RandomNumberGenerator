package ee.kristjan.random;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* This class is made for holding all the combinations logic what we need to compare with random combination. */
public class CodesList
{
	//int[] type is a primitive and Integer[] type is an object, Integer[] can be with value = null.
	HashMap<String, Integer[]> a_All = new HashMap<String, Integer[]>();

	CodesList()
	{
		try {
			BufferedReader input = new BufferedReader(new FileReader("C:/Users/Kristjani-PC/Desktop/DataCombinations.csv"));  //Adding here an address where we will take input csv file.
																	//"J:/Desktop/Text3.csv"
			String line;
			int counter = 1;
			//input.readLine();   //With this line we will skip first line in csv file.

			while ((line = input.readLine()) != null)     //null - empty
			{
				String[] splitByColumn = line.split(";");
				String[] splitted = splitByColumn[0].split(",");  //We need to split all 6 numbers, splits from comma place here.
				List<Integer> splittedInList = new ArrayList<Integer>();

				for (String number : splitted)     //Improved for cycle, it means a for cycle with what you can go through objects.
				{
					splittedInList.add(Integer.valueOf(number.trim()));   //trim() - takes away spaces from the beginning and from the end.
				}
				//getB().put("kombinatsioon_" + counter, (Integer[]) splittedInList.toArray());     <- Casting here, casting is not a good practice.
				getB().put(" kombinatsioon_" + counter, splittedInList.toArray(new Integer[splittedInList.size()]));  //Doing like this, if we don't want casting.
				counter++;																				//size() - it's a function, what returns size of the list.
			}
			input.close();   //Closing buffer reader after use.
			
		} catch (IOException e) {
			System.out.println("ERROR: unable to read file ");
			e.printStackTrace();
		}
	}

	protected HashMap<String, Integer[]> getB()
	{
		return a_All;
	}

	protected void setB(HashMap<String, Integer[]> a_All)
	{
		this.a_All = a_All;
	}
}
