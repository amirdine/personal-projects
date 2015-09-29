package com.github.amirdine.project.calculator.controller;

import java.util.Observable;

import com.github.amirdine.project.calculator.model.KeypadModel;
import com.github.amirdine.project.calculator.view.KeypadView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class KeypadController extends Observable {

	
	private KeypadView  keypadView;
	private KeypadModel keypadModel;
	
	public char clikedButtonValue;
	
	public KeypadController(KeypadView keypadView, KeypadModel keypadModel) {
		this.keypadView  = keypadView;
		this.keypadModel = keypadModel;
	}

	
	public void run(){	
		listenAllButtons();
	}
	
	
	private void listenAllButtons(){
		
		for(int i=0; i< keypadView.buttons.length; i++){
			for(int j=0; j < keypadView.buttons[0].length; j++){
				listenButton(keypadView.buttons[i][j]);
			}
		}
	}
	
	
	private void listenButton(final Button button){
		
		button.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent event) {
	              updateClickedButtonValue(button.getText().charAt(0));
	            }
	    });
	}
	
	
	private void updateClickedButtonValue(char clikedButtonValue){
		this.clikedButtonValue = clikedButtonValue;
       	setChanged();
   		notifyObservers();
	}
	

}