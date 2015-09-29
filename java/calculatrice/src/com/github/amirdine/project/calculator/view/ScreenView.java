package com.github.amirdine.project.calculator.view;

import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ScreenView {
	
	
	private TextField screen;
	
	public Node getScreen(){
		
		screen = new TextField();
		screen.setStyle("-fx-background-color: aquamarine;");
		screen.setEditable(false);
		screen.setPrefWidth(224);
		screen.setPrefHeight(40);
		 
		return screen;	
	}
	
	public void writeOnScreen(String string){
		screen.setText(string);
	}
	
	public void clearScreen(){
		screen.setText("");
	}
	
}