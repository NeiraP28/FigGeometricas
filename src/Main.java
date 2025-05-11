
public class Main {

	public static void main(String []args) {
		Triangulo t1= new Triangulo ("Bermudas", 20, 10, 15 );
		Triangulo t = new Triangulo ("Triangulo T", 200, 100, 150);
		Cuadrado c = new Cuadrado ("Cuadrado", 15,15);
		Rombo rom = new Rombo ("Rombo", 9,13,5);
		Rectangulo r = new Rectangulo("Rectangulo",30,60);
		Romboide romboide = new Romboide("Romboide", 20,50);
		Trapecio trapecio = new Trapecio("Trapecio", 12, 10, 12,16, 10, 16,8);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		Main.imprimirCalculos(c);
		Main.imprimirCalculos(rom);
		Main.imprimirCalculos(r);
		Main.imprimirCalculos(romboide);
		Main.imprimirCalculos(trapecio);

		
		
		}//main 
	
	//aqui se debe implementar una interface llamada FiguraGeometrica y crear la clase de cada figura 
     public static void imprimirCalculos (FiguraGeometrica fg) {
    	 System.out.println();
    	 System.out.println("+-------------------------+");
    	 System.out.println("|El área de [" + fg.nombre() + "]");
    	
    	 System.out.println("| es " + fg.calcularArea());
    	 System.out.println("|El perímetro de [" + fg.nombre() + "]");
    	 System.out.println("| es " + fg.calcularPerimetro());
    	 System.out.println("+-------------------------+");
    	 
    	 
     }//imprimirCalculos
	}//class Main

