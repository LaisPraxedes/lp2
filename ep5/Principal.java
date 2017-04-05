  class Principal{
     public static void main(String [] args){
        Papelaria p1 = Papelaria.getInstancia();
        Papelaria p2 = Papelaria.getInstancia();
        Papelaria p3 = Papelaria.getInstancia();
        Papelaria p4 = Papelaria.getInstancia();
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       System.out.println(p4);
    }
}
