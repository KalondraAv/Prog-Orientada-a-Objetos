package atv;

public class Quadrado {
		/** Toda Classe tem Atributos e Métodos
		    Atributos: caracterísitcas
		    Métodos: ações/funções
		      Método construtor
		      Método GET
		      Método SET
		**/
	
		//Atributos
		double lado;
		double area;
		double perim;
		
		//Método Construtor
		public Quadrado(double lado) {
			this.lado = lado;
		}
		
		//Métodos Próprios
		public void calcularArea() {
			this.area = this.lado * this.lado;
		}
		
		public void calcularPerim() {
			this.perim = this.lado * 4;
		}
		
		public void imprimirResultado() {
			System.out.println("Lado: "+this.lado);
			System.out.println("Área: "+this.area);
			System.out.println("Perímetro: "+this.perim);
;		}
	}
