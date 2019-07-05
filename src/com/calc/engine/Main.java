package com.calc.engine;

public class Main {
	
	static MathEquation[] equations = new MathEquation [4];
	
	public static void main (String args []) {
		
		equations[0] = create(10,5,'a');
		equations[1] = create(10,5,'s');
		equations[2] = create(10,5,'m');
		equations[3] = create(10,5,'d');
		
		for (MathEquation equation:equations) {
			
			equation.execute();
			System.out.println(equation.getResult());
			
		}
	}
	
	
	
	public static MathEquation create (double leftVar, double rightVar, char operation) {
		
		
		MathEquation equation = new MathEquation();
		equation.setLeftVar(leftVar);
		equation.setOperation(operation);
		equation.setRightVar(rightVar);
		
		return equation;
	}

}
