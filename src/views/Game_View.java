package views;

import java.awt.Color;

import javax.swing.JPanel;

public class Game_View extends Display {

	public Game_View(String title, int width, int height) {
		super(title, width, height);
		// TODO Auto-generated constructor stub
		
		// On dirait notre Map un panel noir , on pourrait mettre une photo apres 
		p=new JPanel();
		p.setBackground(Color.BLACK); 
		frame.setContentPane(p);   
		
		
		
		
		
	} 
	
	
	

} 