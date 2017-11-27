import models.GameManager;
import views.MenuView;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//MenuView m=new MenuView("Title",800,600);  
		
       new GameManager().start();
	} 

}