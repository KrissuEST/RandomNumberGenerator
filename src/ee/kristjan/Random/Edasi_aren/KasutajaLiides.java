package ee.kristjan.Random.Edasi_aren;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class KasutajaLiides extends JFrame
{
//	public KasutajaLiides() 
//	{
//		createAndShowGUI();
//	}
	
	public void paint(Graphics g) 
    {
		setTitle("Loto programm");
		setSize(500, 500);
	    setLocation(700, 300);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		doDrawing(g);
//		JPanel panel = new JPanel();
//		frame.add(panel);
//		placeComponents(frame);
    }
	
//    public void paintComponent(Graphics g) 
//    {
//        doDrawing(g);
//    }
	
    public void update(Graphics g)   //siin on kõik doubleBuffering teema.
    {
    	Graphics offScreenGraphics = null;
    	paint(offScreenGraphics);
    }
	
    public void doDrawing(Graphics g) {
        g.setColor(Color.RED);
        //Siin joonistatakse väline ristküliku.
        g.drawRect(10, 10, 10, 10);
    }  
    
//    private static void placeComponents() 
//    {
//    	frame.setLayout(null);
//    	
//		JLabel randKombLabel = new JLabel("Random komb: ");
//		randKombLabel.setBounds(20, 10, 130, 30);
//		randKombLabel.setFont(new Font("Arial", Font.BOLD, 15));
//		frame.add(randKombLabel);
//		
//		String nr1 = "1,2,3,4,5,6";
//		String nr2 = "4,5,6,7,8,9";
//		String nr3 = "7,8,9,10,11,12";
//		String nr4 = "10,11,12,13,14,15";
//		String nr5 = "13,14,15,16,17,18";
//		
//		JLabel randNrLabel = new JLabel("<html>" + nr1 + "<br>" + nr2 + "<br>" + nr3 + "<br>" + nr4 + "<br>" + nr5 + "</html>");
//		randNrLabel.setBounds(140, 10, 220, 100);
//		randNrLabel.setFont(new Font("Arial", Font.BOLD, 15));
//		randNrLabel.setBackground(Color.GREEN);
//	    randNrLabel.setOpaque(true);
//	    frame.add(randNrLabel);
//		
//		JLabel doCsvFileLabel = new JLabel("Tee csv fail: ");
//		doCsvFileLabel.setBounds(20, 130, 100, 30);
//		doCsvFileLabel.setFont(new Font("Arial", Font.BOLD, 15));
//		frame.add(doCsvFileLabel);
//		
//        JCheckBox csvCheckBox = new JCheckBox();
//        csvCheckBox.setBounds(120, 130, 100, 30);
//        frame.add(csvCheckBox);
//
//		JLabel teatedLabel = new JLabel("Selline teade");
//		teatedLabel.setBounds(20, 170, 340, 70);
//		teatedLabel.setFont(new Font("Arial", Font.BOLD, 15));
//		teatedLabel.setBackground(Color.RED);
//		teatedLabel.setForeground(Color.WHITE);
//		teatedLabel.setOpaque(true);
//		frame.add(teatedLabel);
//
//		JButton loginButton = new JButton("Login");
//		loginButton.setBounds(20, 260, 80, 25);
//		loginButton.setFont(new Font("Arial", Font.BOLD, 17));
//		loginButton.setSize(100, 70);
//		frame.add(loginButton);
//		
//		JButton registerButton = new JButton("Register");
//		registerButton.setBounds(130, 260, 80, 25);
//		registerButton.setFont(new Font("Arial", Font.BOLD, 17));
//		registerButton.setSize(100, 70);
//		frame.add(registerButton);
//		
//		JButton registerButton2 = new JButton("Register2");
//		registerButton2.setBounds(240, 260, 120, 25);
//		registerButton2.setFont(new Font("Arial", Font.BOLD, 17));
//		registerButton2.setSize(120, 70);
//		frame.add(registerButton2);
//    }

}
