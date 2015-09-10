package controller;

import java.util.Observable;
import java.util.Observer;

import model.ScreenModel;
import view.ScreenView;

public class ScreenController implements Observer {
	
	
	private ScreenView  screenView;
	private ScreenModel screenModel;
	
	public ScreenController(ScreenView screenView, ScreenModel screenModel) {
		this.screenView  = screenView;
		this.screenModel = screenModel;
	}


	public void update(Observable obs, Object arg) {
		
		if(obs instanceof KeypadController){
		 
			char clickedButtonValue = ((KeypadController) obs).clikedButtonValue;
			
			if(clickedButtonValue == '='){
				screenModel.equalFlag = true;
				screenView.writeOnScreen(screenModel.result());
				return;
			}
			
			if(clickedButtonValue == 'C'){
				screenModel.clear();
				screenView.clearScreen();
				return;
			}
			
			screenModel.addChar(clickedButtonValue);
			screenModel.equalFlag = false;
			screenView.writeOnScreen(screenModel.getCalcul());
		}			
	}
	
	public void manageCalculatorDisplay(KeypadController keypadCT){
		keypadCT.addObserver(this);
		keypadCT.run();
	}
	
}