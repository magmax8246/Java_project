package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.MenuController;

public class MenuView extends Display{
	
	private MenuController menuController;  
	


	public MenuView(String title, int width, int height) { 
		super(title, width, height);
		// TODO Auto-generated constructor stub
		
		
		   
		   JPanel p=new JPanel();
		   JButton bnew=new JButton("New");
		   //setBounds(250,250, width/2, height/2);
		   JButton bload=new JButton("Load"); 
		   JButton bsettings=new JButton("Settings"); 
		   JButton bquit=new JButton("Quit");  
		    
		   
		  
		    p.add(bnew); 
		    p.add(bload);
		    p.add(bsettings);
		    p.add(bquit);
		    
		  //Ajouter le Jlabel
			JLabel label = new JLabel("UTBM GAME");
			//colorer le label
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			
		     p.add(label);
		     p.setBackground(Color.BLACK);  
		    //ajouter le panel dans la fenetre
		    frame.setContentPane(p); 
		     
		 
		   //Les evenements
		   menuController=new MenuController(this);
		   bquit.addActionListener(menuController); 
		   bsettings.addActionListener(menuController); 
		   bnew.addActionListener(menuController); 
		   bload.addActionListener(menuController); 
		   
		   
		   
		   
	}   
	 
  

	
  
}
