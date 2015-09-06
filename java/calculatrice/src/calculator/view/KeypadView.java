package calculator.view;


import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class KeypadView {

	
    public Button[][] buttons;	
	

     public Node getKeyPad(){
		
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10));
        gridpane.setHgap(4);
        gridpane.setVgap(5);
	    
	    String[][] keysLabel = {
	    		
	      { "(" , ")", "D", "C" },
	      { "7" , "8", "9", "/" },
	      { "4" , "5", "6", "*" },
	      { "1" , "2", "3", "-" },
	      { "0" , ".", "=", "+" },
	    
	    };
	    
	    buttons = new Button[5][4];
	    
	    for(int i = 0; i < 5; i++){
	       for(int j = 0; j < 4; j++){
	    	  buttons[i][j] = createButton(keysLabel[i][j]);
	          gridpane.add(buttons[i][j] ,  j, i);
	       }
	    }
	    
	    return gridpane;
	}
	

	private Button createButton(String buttonName){
		
		Button button = new Button( buttonName);	
		button.setMinHeight(42.0);
		button.setMinWidth(52.0);
		return button;
	}
	
	
}
