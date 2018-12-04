package bin;

public class MathFunctions{
	private double a,b;
	
	public MathFunctions(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public MathFunctions() {
		
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public void setA(double a) {
		this.a=a;
		
	}
	public void setB(double b) {
		this.b=b;
	}
	
	public double Add() {
		
		return getA()+getB();
	}
	
	public double Subtract() {
		
		return a-b;
	}
	public double Multiplication() {
	
		return a+b;
	}
	public double Division() {
		
		if(b == 0) {
			return 0;
		}else {
			return a/b;
		}
	}
	
	
}
