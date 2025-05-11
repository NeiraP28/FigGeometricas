
public class Cuadrado implements FiguraGeometrica{
private String nombre;
private double altura;
private double base;
public Cuadrado(String nombre, double altura, double base) {
	super();
	this.nombre = nombre;
	this.altura = altura;
	this.base = base;
}//constructor 

//metodos para el calculo 
public double calcularArea() {
	return getBase()* getAltura();
}//calcularArea

public double calcularPerimetro() {
	return (getBase() + getAltura())*2;
}//calcularPerimetro

public String getNombre() {
	return nombre;
}//getNombre

public void setNombre(String nombre) {
	this.nombre = nombre;
}//setNombre

public double getAltura() {
	return altura;
}//getAltura

public void setAltura(double altura) {
	this.altura = altura;
}//setAltura

public double getBase() {
	return base;
}//getBase

public void setBase(double base) {
	this.base = base;
}//setBase

@Override
public String toString() {
	return "Cuadrado [nombre=" + nombre + ", altura=" + altura + ", base=" + base + "]";
}

@Override
public String nombre() {
	// TODO Auto-generated method stub
	return nombre;
}














	
	
}//class Cuadrado 
