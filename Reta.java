public class Reta{
   private Ponto p1,p2;
   public void setP1(Ponto p)
   {
           this.p1=p;
   }
   public Ponto getP1()
   {
           return this.p1;
   }
   public void setP2(Ponto p)
   {
           this.p2=p;
   }
   public Ponto getP2()
   {
           return this.p2;
   }
   public Ponto calcularArea() {
       double c1,c2,area;
       c1=p1.getY()-p2.getY();
       c2=p2.getX()-p1.getX();
       area=(c1*c2)/2+c1*c2;
       return this.p=area;
   }
}
