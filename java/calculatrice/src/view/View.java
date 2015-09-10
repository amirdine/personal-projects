package view;

import view.util.CalculatorPane;
import view.util.Position;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class View {
	
	public KeypadView keypadView;
	public ScreenView screenView;
	
	public Scene getScene(){
		
		Group root  = new Group();
		Scene scene = new Scene(root, 252, 312, Color.WHITE);
		
		keypadView = new KeypadView();
		screenView = new ScreenView();
				
		CalculatorPane calculatorPane = new CalculatorPane();
		
		calculatorPane.add(keypadView.getKeyPad(), new Position(60,4));
		calculatorPane.add(screenView.getScreen(), new Position(20,15));
		
		root.getChildren().add(calculatorPane.getContent());
		
		return scene;	
	}
	
}