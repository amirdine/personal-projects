package model.service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

	private String result;

	private ScriptEngineManager mgr = new ScriptEngineManager();
	private ScriptEngine engine = mgr.getEngineByName("JavaScript");

	public void calcul(String expression) {
		try {
			result = engine.eval(expression).toString();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

	public String result() {
		return result;
	}
}
