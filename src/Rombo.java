
public class Rombo implements FiguraGeometrica {

	private String nombre;
	private double diagMenor;
	private double diagMayor;
	private double lado;
	
	public Rombo(String nombre, double diagMenor, double diagMayor, double lado) {
		super();
		this.nombre = nombre;
		this.diagMenor = diagMenor;
		this.diagMayor = diagMayor;
		this.lado = lado;
	}//constructor
	
	//métodos para hacer los cálculos 
	
	public double calcularArea() {
    	return (getDiagMenor()*getDiagMayor())/2;
    }//calcularArea
	
	public double calcularPerimetro() {
    	return (getLado() + getLado())*2;
    }
	

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getDiagMenor() {
		return diagMenor;
	}//getDiagMenor

	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}//setDiagMenor

	public double getDiagMayor() {
		return diagMayor;
	}//getDiagMayor

	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}//setDiagMayor

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagMenor=" + diagMenor + ", diagMayor=" + diagMayor + ", lado=" + lado
				+ "]";
	}//toString
	
	@Override
	public String nombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	
	
	
	
}
