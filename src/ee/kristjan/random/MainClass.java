package ee.kristjan.random;

/** (Eesti keeles) Genereerida 6 erinevat suvalist numbrit, mis peavad j‰‰ma vahemikku
1-48 ja ei tohi korduda. Lisaks vırdleb programm Text3.csv faili pıhjal kombinatsioone loodud
suvalise kombinatsiooniga (6 erinevat numbrit). Loodud kombinatsioon peab olema unikaalne! */
/** (In English) Generate 6 different random numbers, what needs to stay between 1-48
and these numbers can't be repeated. Program compares combinations based on the Text3.csv file
with created random combination (6 different numbers). Created combination must be unique! */

/* This class made for starting the program. */
public class MainClass
{
	public static void main(String[] args)
	{
		ProgramBody body = new ProgramBody();
//		body.start("J:/Desktop/VL_Output.csv");
		body.start("C:/Users/Kristjani-PC/Desktop/VL_Output.csv");
	}
}
