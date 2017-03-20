class Quadrado extends FiguraGeometrica
{
   private double lado;
   public void setLado()
   {
     this.lado=lado; 
   }
   public double getLado()
   {
     return this.lado;
   }
   public double calcularPerimetro()
   {
      return 4*lado;
   }
   public double calcularArea()
   {
      return Math.pow(lado,2); 
   }
}
