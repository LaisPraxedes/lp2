class Cicunferencia extends FiguraGeometrica  {
  private double raio;
  private double pi = 3.14;
  public void setRaio (double raio){
   this.raio=raio;
  }
  public double getRaio(){
     return this.raio;
  }
   public void calcularPerimetro(){
       return 2*pi*getRaio();
   }
   public void calcularArea(){
       return pi*Math.pow(Raio(),2);
   }
}
