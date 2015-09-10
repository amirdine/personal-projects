package model;

public class Model {
	
	public ScreenModel screenModel;
	public KeypadModel keypadModel;
	

	public Model(){
		screenModel = new ScreenModel();
		keypadModel = new KeypadModel();
	}

}
