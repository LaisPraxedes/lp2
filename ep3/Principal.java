import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

  public class Principal 
{
     public static void main (String [] args)
     {
       ArrayList<Aluno> vetoralunos = new ArrayList<Aluno> ();
       Aluno a1 = new Aluno ();
       Aluno a2 = new Aluno ();
       Aluno a3 = new Aluno ();
       Aluno a4 = new Aluno ();
       Aluno a5 = new Aluno ();
       a1.setNome ("Lais");
       a1.setIdade (18);
       a2.setNome ("Nathalia");
       a2.setIdade (17);
       a3.setNome ("Matheus");
       a3.setIdade (17);
       a4.setNome ("Victor");
       a4.setIdade (16);
       a5.setNome ("Birma");
       a5.setIdade (17);
       vetoralunos.add (a1);
       vetoralunos.add (a2);
       vetoralunos.add (a3);
       vetoralunos.add (a4);
       vetoralunos.add (a5);
       for (int i = 0; i < 5; i++) {
        System.out.println("Aluno: " + vetoralunos.get(i).getNome() + "  Idade: " + vetoralunos.get(i).getIdade());
    }
       Collections.sort (mais, new Comparator() {
            public int compare(Object o1, Object o2, Object o3, Object o4, Object o5) {
                Aluno a1 = (Aluno) o1;
                Aluno a2 = (Aluno) o2;
                return a1.getIdade() < a2.getIdade() ? -1 : (a1.getIdade() > a2.getIdade() ? +1 : 0);
        } 
       System.out.println (mais());   
 
     }











}

