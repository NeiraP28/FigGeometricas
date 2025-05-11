
public class Romboide implements FiguraGeometrica{

	private String nombre;
	private double altura;
	private double base;
	
	public Romboide(String nombre, double altura, double base) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.base = base;
	}//constuctor
	
	//metodos para hacer los calculos 
	public double calcularArea() {
		return getBase()* getAltura();
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getBase() + getAltura())*2;
	}//calcularPerimetro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", altura=" + altura + ", base=" + base + "]";
	}//toString
	
	@Override
	public String nombre() {
		// TODO Auto-generated method stub
		return nombre;
	
	}
	
	
}//class Romboide 
