package view;

import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ScreenView {
	
	
	public Node getScreen(){
		
	     TextField screen = new TextField();
		 screen.setStyle("-fx-background-color: aquamarine;");
		 screen.setEditable(false);
		 screen.setPrefWidth(224);
		 screen.setPrefHeight(40);
		 
		 return screen;	
	}
	
}