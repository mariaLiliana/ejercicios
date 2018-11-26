package modelo;
import static java.lang.System.exit;	
	import static java.lang.System.in;
	import static java.lang.System.out;
	import static java.lang.Integer.parseInt;
	import static java.lang.Double.parseDouble;
	import java.util.Scanner;
	public class Objectos{
	public static final void main(String args[]){
	Scanner escaner=new Scanner(in);
	Cubo cubo=null;
	int opcion=4;
	while(true){
	switch(opcion){
	case 1:
	case 2:
	case 3:
	double resultado=opcion==1?cubo.calcularArea():opcion==2?cubo.calcularPerimetro():cubo.calcularVolumen();
	out.println((opcion==1?"Area":opcion==2?"Perimetro":"Volumen")+": "+resultado);
	opcion=6;
	continue;
	case 4:
	out.println("Ingresa el lado:");
	double lado=parseDouble(escaner.nextLine());
	cubo=new Cubo(lado);
	break;
	case 5:
	exit(0);
	case 6:
	out.println("Dato actual: "+cubo.lado);
	out.println("Desea continuar?\n1 - Salir al menu de calculos\n2 - Salir al inicio");
	opcion=parseInt(escaner.nextLine());
	if(opcion==1){
	out.println("Menu de calculos\n1 - Calcular Area\n2 - Calcular Perimetro\n3 - Calcular Volumen");
	opcion=parseInt(escaner.nextLine());
	}
	else{opcion=4;}
	continue;
	}
	out.println("Dato actual: "+cubo.lado);
	out.println("Opciones\n1 - Calcular Area\n2 - Calcular Perimetro\n3 - Calcular Volumen\n4 - Cancelar\n5 - Salir");
	opcion=parseInt(escaner.nextLine());
	}
	}
	}
	class Cuadrado{
	protected double lado;
	
	public Cuadrado(double lado){this.lado=lado;}
	public double calcularArea(){return lado*lado;}
	public double calcularPerimetro(){return lado*4;}
	}
	class Cubo extends Cuadrado{
	public Cubo(double lado){super(lado);}
	@Override public double calcularArea(){return super.calcularArea()*6;}
	@Override public double calcularPerimetro(){return super.calcularPerimetro()*3;}
	public double calcularVolumen(){return lado*lado*lado;}
	}

