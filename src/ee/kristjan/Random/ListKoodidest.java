package ee.kristjan.Random;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* This class made for holding all the combinations what we need to compare with random combination. */
public class ListKoodidest 
{	
//    int[] array1145 = {29, 22, 48, 34, 5, 45};  //kb 1145
//    int[] array1144 = {4 ,6, 23, 29, 10, 30}; 
//    int[] array1143 = {17, 25, 2, 41, 45, 19}; 
//    int[] array1142 = {25, 2, 10, 31, 18, 9}; 
//    int[] array1141 = {8, 45, 43, 30, 36, 13}; 
//    int[] array1140 = {8, 45, 24, 22, 46, 16};  //kb 1140

//    ListKoodidest() 
//    {
//    	getB().put("kombination1145", array1145);  //kb 1145
//    	getB().put("kombination1144", array1144);
//    	getB().put("kombination1143", array1143);
//    	getB().put("kombination1142", array1142);
//    	getB().put("kombination1141", array1141);
//    	getB().put("kombination1140", array1140);  //kb 1140
//    }
	HashMap<String, Integer[]> a_All = new HashMap<String, Integer[]>();   //int[] ja Integer[] vahel ei ole väga suur erinevus, Integer[] võib olla väärtusega = null.
	
    ListKoodidest() 
    {
        try {
            BufferedReader input = new BufferedReader(new FileReader("C:/Users/Kristjani-PC/Desktop/Text3.csv"));     //Siin lisame aadressi, kust võetakse sisend csv fail.
            													   //"C:/Users/Kristjani-PC/Desktop/Text3.csv", "J:/Desktop/Text3.csv"
            String line;
            int counter = 1;
//          input.readLine();   //Selle reaga jätame esimese rea csv failis vahele.
            
            while ((line = input.readLine()) != null)      //null - tühi
            {
            	String[] splitByColumn = line.split(";");
                String[] splitted = splitByColumn[0].split(",");   //peab splittima kõik 6 numbrit, splitib komakoha juurest.
                List<Integer> splittedInList = new ArrayList<Integer>();
                
                for (String number : splitted)     //Täiustatud for tsükkel ehk for tsükkel millega on parem käia objekte läbi.
                {
                	splittedInList.add(Integer.valueOf(number.trim()));   //trim() - võtab tühjad space-id lõpust ja algusest
                }
//              getB().put("kombinatsioon_" + counter, (Integer[]) splittedInList.toArray());      <- Castimine siin, castimine pole hea tava.
                getB().put(" kombinatsioon_" + counter, splittedInList.toArray(new Integer[splittedInList.size()]));  //Teeme nii, kui me ei taha castida.
                counter++;                                        											//size() - on funktsioon, mis tagastab listi suuruse.
            }
            input.close();   //close bufferreader after use
            
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

