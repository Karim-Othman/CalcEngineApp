package com.calc.engine;

public class Main {
	
	// Without using Constructor
	
	static MathEquation[] equations = new MathEquation[5] ;
	
	public static void main (String args []) {
		
		equations[0] = new MathEquation('a',10.0,5.0);
		equations[1] = new MathEquation('s',10,5);
		equations[2] = new MathEquation('m',10,5);
		equations[3] = new MathEquation('d',10,5);
		equations[4] = new MathEquation();
		
		for (MathEquation equation:equations) {
			equation.execute();
			System.out.println(equation.getResult());
			
		}
	}
	
	
	
	

}
