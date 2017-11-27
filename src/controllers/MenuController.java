package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import views.MenuView;
import views.SettingsView;

public class MenuController implements ActionListener{
	
	private MenuView menuView;
	
	public MenuController(MenuView menuView) {
		// TODO Auto-generated constructor stub
		this.menuView=menuView;
		
	}
	
	public void on_click_Quit()
	{   
		System.exit(1);  	
	}  
	
	public void on_click_load() 
	{ 
		
	}
	
	public void on_click_settings() 
	{ 
		menuView.Fermer_fenetre();
		new SettingsView("Settings",800,600); 
		
	}
	
	public void on_click_new() 
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
		// test pour connaitre quel bouton a declancher l evenement
		if (((JButton)e.getSource()).getActionCommand().equals("Quit"))
			on_click_Quit();
		else 
		 if (((JButton)e.getSource()).getActionCommand().equals("Load"))
			on_click_load();
		else 
		 if (((JButton)e.getSource()).getActionCommand().equals("new"))
			on_click_new();
		else 
		 if (((JButton)e.getSource()).getActionCommand().equals("Settings"))
			on_click_settings();
				
	 }

}


