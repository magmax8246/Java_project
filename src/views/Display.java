package views;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension; 
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel; 

public class Display {
	protected JFrame frame;   
	protected  Canvas canvas;    
	protected JPanel p;
	  
	
    protected String title;
	protected int width, height;  
	
	public Display(String title, int width, int height) 
	{
		this.title=title;   
		this.width=width;  
		this.height=height;
		createDisplays(); 
	}
	
	public JFrame getJFrame() {
		return frame;
	}
	public void Fermer_fenetre() { 
		frame.dispose();
	}
	
	private void createDisplays() {  
		
		frame=new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		//frame.getContentPane().setBackground(Color.BLACK);
		frame.setVisible(true);
		
		canvas=new Canvas();
		canvas.setPreferredSize(new Dimension(width,height)); 
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		frame.add(canvas);
		frame.pack();   
		//Mettre la frame en plein ecran
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		
		
	} 
	
 
	
	public Canvas getCanvas() {
		return canvas;
	}
	 
	
	
	

}