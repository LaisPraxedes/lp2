 public class Retangulo extends FiguraGeometrica
 {
    private double base,altura;
    public void setBase (double base)
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
    public double calcularaPerimetro()
    {
      return 2*(getBase()+getAltura());
    }
    public double calcularArea()
    { 
      return getBase()*getAltura();
    }
}
