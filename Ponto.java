class Ponto
{
     public double x,y;
        public void setX (double x){
                this.x=x;
        }
        public double getX(){
                return this.x;
         }
         public void setY (double y){
                this.y=y;
         }
         public double getY (){
                return this.y;
         }
         public Ponto()
         {
               System.out.println ("Construtor 1-"+this);
         }

     public Ponto(double x, double y)
     {
           System.out.println("Construtor 2");
           this.x = x;
           this.y = y;
     }
    public static void  main (String [] args){
         Ponto p1=new Ponto();
         p1.setX(10);
         p1.setY(30);
         Ponto p2=new Ponto();
         p2.setX(15);
         p2.setY(20);
         Reta r1= new Reta();
        // r1.setP1(p1);
        // r1.setP2(p2); 
        // r1.getP1().getX();
        // r1.getP1().getY();
        // r1.getP2().getX();
        // r1.getP2().getY();
        // System.out.println (r1.getP1().getX() + " " + r1.getP2().getY());
        // double c1,c2,q,d; 
        // c1=p1.getY()-p2.getY();
        // c2=p2.getX()-p1.getX();
        // q=Math.pow(c1,2)+Math.pow(c2,2);
        // d=Math.sqrt(q);  
       // System.out.println (d);
        System.out.println (r1);
    }
}
