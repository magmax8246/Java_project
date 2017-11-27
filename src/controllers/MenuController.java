package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import views.Game_View;
import views.MenuView;
import views.SettingsView;

public class MenuController implements ActionListener{
	
	private MenuView menuView;
	private Game_View gameView;
	
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
		//disant que new conduit directement au jeux pour le moment( Mais normalement conduit à
		// fenetre ou l user choisit les etudiants avec les uv à mettre ) 
		menuView.Fermer_fenetre();
		new Game_View("Our Game",800,600); 
		
		
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
		 if (((JButton)e.getSource()).getActionCommand().equals("New"))
			on_click_new();
		else 
		 if (((JButton)e.getSource()).getActionCommand().equals("Settings"))
			on_click_settings();
				
	 }

}


