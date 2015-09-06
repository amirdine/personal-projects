package calculator.view.util;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class CalcPane {
	
	
		private static AnchorPane anchorpane;
		
		
		public CalcPane() {
			anchorpane = new AnchorPane();
		}
		
		public void add(Node component, Position position){
			 
			anchorpane.getChildren().add(component);
			AnchorPane.setTopAnchor(component, position.x);
			AnchorPane.setLeftAnchor(component, position.y); 
		}
		
		public AnchorPane getContent(){
			return anchorpane;
		}

}
