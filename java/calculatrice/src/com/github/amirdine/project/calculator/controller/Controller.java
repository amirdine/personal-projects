package com.github.amirdine.project.calculator.controller;

import com.github.amirdine.project.calculator.model.Model;
import com.github.amirdine.project.calculator.view.View;



public class Controller {
	
	private View  view;
	private Model model;
	
	public Controller(View view, Model model){
		
		this.view  = view;
		this.model = model;
	}
	
	
	public void start(){
		
        KeypadController keypadCT = new KeypadController(view.keypadView, model.keypadModel);
        ScreenController screenCT = new ScreenController(view.screenView, model.screenModel);
         
        screenCT.manageCalculatorDisplay(keypadCT);
	}

	
}