class Principal  {

public static void main (String[] args){

 System.out.println("Triangulo");
 Triangulo tri = new Triangulo;
  tri.setBase(10);
  tri.setAltura(5);
  tri.setLado1(3);
  tri.setLado2(4);
 System.out.println("Perimetro: " + tri.calcularPerimetro() + " Area: " + tri.calcularArea());
 System.out.println("Retangulo: ");
 Retangulo ret = new Retangulo;
  ret.setBase(10);
  ret.setAltura(5);
 System.out.println("Perimetro: " + ret.calcularPerimetro() + " Area: " + ret.calcularArea());
 System.out.println("Quadrado");
 Quadrado qua = new Quadrado;
  qua.setLado(5);
 System.out.println("Perimetro: " + qua.calcularPerimetro() + " Area: " + qua.calcularArea());
 System.out.println("Circunferencia: ");
 Circunferencia cir = new Circunferencia;
  cir.setRaio(5);
 System.out.println("Perimetro: " + cir.calcularPerimetro() + " Area: " + cir.calcularArea());
 System.out.println("Trapezio");
 Trapezio tra = new Trapezio;
  tra.setBaseMaior(10);
  tra.setBaseMenor(5);
  tra.setAltura(8);
  tra.setLado1(3);
  tra.setLado2(4);
 System.out.println("Perimetro: " + tra.calcularPerimetro() + " Area: " + tra.calcularArea());
