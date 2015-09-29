package com.github.amirdine.project.calculator.model;

import com.github.amirdine.project.calculator.model.service.Calculator;

public class ScreenModel {

	private String operation = new String();
	private Calculator calculator = new Calculator();

	public boolean equalFlag = false;

	public String getCalcul() {
		return operation;
	}

	public String result() {

		calculator.calcul(operation);
		operation = calculator.result();

		return calculator.result();
	}

	public void addChar(char c) {

		if (Character.isDigit(c) && equalFlag)
			clear();

		operation = operation + c;
	}

	public void delete() {

	}

	public void clear() {
		operation = "";
	}

}
