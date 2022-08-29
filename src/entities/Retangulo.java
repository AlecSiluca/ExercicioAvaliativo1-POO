package entities;

public class Retangulo {
	public double width;
	public double height;
	
	public double area() {
		return this.width * this.height;
	}
	public double perimetro() {
		return this.height*2 + this.width*2;
	}	
	public double diagonal() {
		return Math.sqrt(this.height*this.height + this.width*this.width);
	}
}