class No 
{
  
    private int x;

    private No prox,ant;
 
    public void setX (int x)
    
    {
    
      this.x=x;
    
     }
   
    public int getX()
    {
   
       return this.x;
   
    }
   
    public void setProx (No prox)
    
    {
    
         this.prox=prox;
   
    }

     public No getProx ()
  
    {
    
         return this.prox;
     
    } 

     public void setAnt (No ant)
   
     {
      
            this.ant=ant;
   
     }
  
     public No getAnt ()
  
     {
  
         return this.ant;
    
     }

}

  
 

    public class Lista
{
 
        private No cabeca=null, a=null;
      public void mostrar()
      {
         No cursor=cabeca;
         while (cursor != null
)
      
   {
            System.out.println(" " + cursor.getX());
            cursos= cursor.getProx();
         }
      }
      public void inserir(int x)
      {
       No num = new No();
       num.setX(x);
       
       if (cabeca == null)
      
   {
        cabeca = num;
        a = num;
         }else{
         num.setAnt(aux);
         aux.setProx(novo);
         aux=novo;
         }
       }
  public void remove(int item){
    No cursor = cabeca;
    No outro;
    while (cursor != null){
        if (cursor.getX() == item){
           outro = cursor.getAnt();
           outro.setProx(cursor.getProx());
           cursor.setAnt(outro);
        }
        cursor = cursor.getProx();
    }
}
  public void pesquisa(int x){
    No cursor= cabeca;
    int aux=0;
  while(cursor != null){
      if (cursor.getX()= x){
        aux =1;
       }
       cursor=cursor.getProx();  
       if (aux==1){
        System.out.println("O elemento esta na lista");
       }else{
        System.out.println("O elemento nao esta na lista");
        }
  }   
   
  }
}
