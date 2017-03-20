public class Principal{
  public static void main(String args[]){
 Lista y = new Lista();
 y.inserir(1);
 y.inserir(2);
 y.inserir(3);
 System.out.println("Lita: ");
 y.mostrar();
 System.out.println("Pesquisar 3:  ");
 y.pesquisa(3);
 System.out.println("Pesquisar 4:  ");
 y.pesquisa(4);
 System.out.println("Remover 2:  ");
 y.remove(2);
 System.out.println("Lita: ");
 y.mostrar();
 }
}
