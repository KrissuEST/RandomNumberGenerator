package ee.kristjan.Random.Edasi_aren;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Map;
import javax.swing.JOptionPane;

/* This class made for holding all the methods what we need to run the program. */
public class ProgrammiKeha extends MassiiviLisamine
{
	private String printOut(Integer[] arrayRand)
	{
//		String output = "";
//		
//		//Load up output separate
//		for (int loop = 0; loop < 6; loop++) 
//		{
//		    output = output + arrayRand[loop] + ", ";
//		}
//		return output;
		String arrayString = Arrays.toString(arrayRand);
		return arrayString.substring(1, arrayString.length() -1);
	}
	
	protected void sortAllArrays(ListKoodidest a_List) 
	{
    	for (Map.Entry<String, Integer[]> entry : a_List.getB().entrySet()) 
    	{
    		Integer[] a_NotSorted = entry.getValue();
//    		System.out.println(printOut(a_NotSorted));
    		Arrays.sort(a_NotSorted);
//    		System.out.println(printOut(a_NotSorted) + entry.getKey());
		}
	}
	
//   protected void generateCsvFile(String sFileName)
//   {
//	    try {
//	    	FileWriter writer = new FileWriter(sFileName);
//	    	
//			writer.append(printOut(a_Sorted) + '\n');
//          writer.flush();
//	        writer.close();
//		    
//	    } catch (Exception e) {
//	    	System.out.println("ERROR: unable to create file " + sFileName);	
//	    }
//   }
	
	protected void start(String s_FileName)
	{
		Integer[] arrayRand = new Integer[6];
	    
	    //Your array gets sorted and method randNumToArray() will be used.
	    Arrays.sort(arrayRand = randNumToArray());
//	    System.out.println("Mitte sorteeritud nüüd allpool.");
	    ListKoodidest c_List = new ListKoodidest();
	    sortAllArrays(c_List);
//	    System.out.println('\n' + "Sorteeritud nüüd allpool.");
	    
	    for (Map.Entry<String, Integer[]> entry : c_List.getB().entrySet())  //keySet() 50 ms, entrySet() 75 ms
	    {   
	    	Integer[] a_Sorted = entry.getValue();
//	    	System.out.println(printOut(a_Sorted));
	    	
//		    try {
//		    	FileWriter writer = new FileWriter(s_FileName, true);  //true- lisab asjad kuni faili lõpuni,mitte ei kirjuta faili üle.
//		    	
//				writer.append(printOut(a_Sorted) + '\n');
//		        writer.flush();
//		        writer.close();
//			    
//		    } catch (Exception e) {
//		    	System.out.println("ERROR: unable to create file " + s_FileName);	
//		    }

	    	if (Arrays.equals(arrayRand,a_Sorted)) 
	    	{
	    		JOptionPane.showMessageDialog(null, "RN: " + printOut(arrayRand) + "\n" + "See on CSV-s: " + entry.getKey(), 
	    				"Kombinatsioon juba olemas!", JOptionPane.INFORMATION_MESSAGE);
//	    		System.out.println("RN: " + printOut(arrayRand) + entry.getKey() + " Kombinatsioon juba olemas");
	    		return;
			}
		}
		JOptionPane.showMessageDialog(null, printOut(arrayRand) + "\n", "Unikaalne kombinatsioon!",
				JOptionPane.INFORMATION_MESSAGE);
	}	
}

