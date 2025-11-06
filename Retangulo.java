package formasGeom;

public class Retangulo {
	    /** Toda Classe tem Atributos e Métodos
            Atributos: caracterísitcas
            Métodos: ações/funções
             Método construtor
             Método GET
             Método SET
        **/

        //Atributos
        double comp;
        double larg;
        double area;
        double perim;

       //Método Construtor
       public Retangulo(double comp) {
	       this.comp = comp;
       }

       public Retangulo(double larg) {
           this.larg = larg;
       }

       //Métodos Próprios
       public void calcularArea() {
	       this.area = this.comp * this.larg;
       }

       public double calcularAreaConstrutor() {
	       return this.comp * this.larg;
      }


     public void calcularPerim() {
	     this.perim = (this.comp * 2)+(this.larg * 2);
     }

     public void imprimirResultado() {
	     System.out.println("Comprimento: "+this.comp);
	     System.out.println("Largura: "+this.larg);
	     System.out.println("Área: "+this.area);
	     System.out.println("Perímetro: "+this.perim);
     }
}
