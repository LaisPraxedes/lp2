   public class Triangulo extends FiguraGeometrica 
   {
      private double base,altura,lado1,lado2;
      public void setBase(double base)
      {
          this.base=base;
      }
      public double getBase()
      {
           return this.base;
      }
      public void setAltura(double altura)
      {
           this.altura=altura;
      }
      public double getAltura()
      {
           return this.altura;
      }
      public void setLado1(double lado1)
      {
           this.lado1=lado1;
      }
      public double getLado1()
      {
           return this.lado1;
      }
      public void setLado2 (double lado2)
      {
           this.lado2=lado2;
      }
      public double getLado2()
      {
           return this.lado2;
      }

    public double calcularPerimetro()
    {
     double perimetro=getLado1()+getLado2()+getBase();
     return perimetro;
    }
    public double calcularArea()
    {
      double area=(getBase()*getAltura())/2;
      return area;
    }
}
