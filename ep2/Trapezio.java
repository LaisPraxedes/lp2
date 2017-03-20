class Trapezio extends FiguraGeometrica  {
   private double baseMaior,baseMenor,altura,ladoA,ladoB;
   public void setBaseMaior (double baseMaior){
   this.baseMaior=baseMaior;
    }
   public double getBaseMaior(){
     return this.baseMaior;

   }
   public void setBaseMenor (double baseMenor){
   this.baseMenor=baseMenor;
   }
   public double getBaseMenor(){
     return this.baseMenor;
   }
   public void setAltura (double altura){
     this.altura=altura;
   }
   public double getAltura(){
       return this.altura;
    }
    public void setLadoA (double ladoA){
      this.ladoA=ladoA;
    }
    public double getLadoA(){
     return this.ladoA;
    }
    public void setLadoB (double ladoB){
       this.ladoB=ladoB;
    }
    public double getLadoB(){
     return this.ladoB;
    }
    public void calcularPerimetro(){
       return getBaseMaior()+getBaseMenor()+getLadoA()+getLadoB();
    }
    public void calcularArea(){
       return ((getBaseMaior+getBaseMenor())*getAltura)()/2;
    }
}
