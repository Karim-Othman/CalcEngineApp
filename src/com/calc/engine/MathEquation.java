package com.calc.engine;

public class MathEquation {
	
	private double leftVar;
	private double rightVar;
	private char operation;
	private double result=0;
	
	public void setLeftVar (double leftVar) {this.leftVar=leftVar;};
	public void setRightVar (double rightVar) {this.rightVar=rightVar;};
	public void setOperation (char operation) {this.operation=operation;};
	
	public double getLeftVar () {return this.leftVar;};
	public double getRightVar () {return this.rightVar;};
	public double getResult () {return this.result;};
	
	// Creating Constructor that doesn't take any arguments
	
	public MathEquation() {
		
	}
	
	//Creating First Constructor
	public MathEquation (char operation) {
		
		this.operation=operation;
	}
	
	//Creating Second Constructor
		public MathEquation (char operation, double leftVar, double rightVar) {
			
			this(operation);
			this.leftVar=leftVar;
			this.rightVar=rightVar;
		}
	
	public double execute () {
		
		
		switch(this.operation) {
		
		case 'a':
			this.result=this.leftVar+this.rightVar;
			break;
			
		case 's':
			this.result=this.leftVar-this.rightVar;
			break;
			
		case 'd':
			this.result=this.rightVar==0?0:(this.leftVar/this.rightVar);
			break;
			
		case 'm':
			this.result=this.leftVar*this.rightVar;
			break;
		default:
			System.out.println("Operation not defined");
			break;
		
		
		}
		
		return this.result;
		
	}
	

}
