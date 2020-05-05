package ee.kristjan.random;

import java.awt.Dimension;
import java.awt.Font;
//import java.io.FileWriter;
import java.util.Arrays;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/** This class is made for holding all the methods what we will need to run the program. */
public class ProgramBody extends AddingArray
{
	/** Method for printing out arrays. */
	private String printOut(Integer[] arrayRand)
	{
		String arrayString = Arrays.toString(arrayRand);     // toString - makes it to string
		return arrayString.substring(1, arrayString.length() -1);    //subString - creates a new string
	}

	/** Method for sorting an array from lower number to higher. */
	protected void sortAllArrays(CodesList a_List)
	{
		for (Map.Entry<String, Integer[]> entry : a_List.getB().entrySet())
		{
			Integer[] a_NotSorted = entry.getValue();
//    		System.out.println(printOut(a_NotSorted));
			Arrays.sort(a_NotSorted);
//    		System.out.println(printOut(a_NotSorted) + entry.getKey());
		}
	}

	/** Method for starting the program. */
	protected void start(String s_FileName)
	{
		Integer[] arrayRand = new Integer[6];
		
		Arrays.sort(arrayRand = randNumToArray());
		//System.out.println("Not sorted below.");
		
		CodesList c_List = new CodesList();
		sortAllArrays(c_List);
		//System.out.println('\n' + "Sorted below.");
		
		UIManager.put("OptionPane.minimumSize", new Dimension(430, 100));   //Setting size of JOptionPane
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 20));   //Setting font of JOptionPane
		
		for (Map.Entry<String, Integer[]> entry : c_List.getB().entrySet())   //keySet() 50 ms, entrySet() 75 ms
		{
			Integer[] a_Sorted = entry.getValue();
			//System.out.println(printOut(a_Sorted));
			
			//Here is all the logic to write sorted combinations to output file.
//		    try {
//		    	FileWriter writer = new FileWriter(s_FileName, true);  //true - lisab asjad kuni faili lõpuni, mitte ei kirjuta faili üle.
//		    	
//				writer.append(printOut(a_Sorted) + '\n');
//		        writer.flush();
//		        writer.close();
//			    
//		    } catch (Exception e) {
//		    	System.out.println("ERROR: unable to create file " + s_FileName);
//		    }
			
			if (Arrays.equals(arrayRand,a_Sorted))    //If any of arrays are equal.
			{
				JOptionPane.showMessageDialog(null, "Random nr: " + printOut(arrayRand) + "\n" + "It's in Combinations.csv file " + entry.getKey(),
						"Combination already exists!", JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("RN: " + printOut(arrayRand) + entry.getKey() + " Combination already exists");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, printOut(arrayRand) + "\n", "Unique combination!",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
