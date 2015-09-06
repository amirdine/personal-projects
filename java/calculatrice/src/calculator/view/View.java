package calculator.view;

import calculator.view.util.CalcPane;
import calculator.view.util.Position;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class View {
	
	
	public Scene getScene(){
		
		Group root = new Group();
		Scene scene = new Scene(root, 252, 312, Color.WHITE);
		
		KeypadView keypadView = new KeypadView();
		ScreenView screenView = new ScreenView();
				
		CalcPane calcPane = new CalcPane();
		
		calcPane.add(keypadView.getKeyPad(), new Position(60,4));
		calcPane.add(screenView.getScreen(), new Position(20,15));
		
		root.getChildren().add(calcPane.getContent());
		
		return scene;
		
	}
	
}
