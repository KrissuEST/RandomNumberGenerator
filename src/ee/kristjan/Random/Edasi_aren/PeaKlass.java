package ee.kristjan.Random.Edasi_aren;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

/**(Eesti keeles) Genereerida 6 erinevat suvalist numbrit, mis peavad j‰‰ma vahemikku 
1-48 ja ei tohi korduda. */
/**(In English) Generate 6 different random numbers, what needs to stay between 1-48 
and those numbers must not be repeated. It's like a lottery. */

/* This class made for starting the program. */
public class PeaKlass 
{
    public static void main(String[] args) 
    {
    	ProgrammiKeha keha = new ProgrammiKeha();
    	keha.start("J:/Desktop/Text.csv");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	KasutajaLiides kl = new KasutajaLiides();
                kl.setVisible(true);
            }
        });
//    	KasutajaLiides liides = new KasutajaLiides();
//    	liides.paint(Graphics g); 
    }
//    
//    public void paint(Graphics g)
//    {
//     
//    }

}
