import java.util.Collections;
import java.util.ArrayList;

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
       Disciplina d1 = new Disciplina();
       Disciplina d2 = new Disciplina();
       d1.setNome("LP2");
       d1.setProf("Hebert");
       d2.setNome("WEB");
       d2.setProf ("Marcelo");
       a1.setNome ("Lais");
       a1.setIdade (18);
       a2.setNome ("Nathalia");
       a2.setIdade (17);
       a3.setNome ("Matheus");
       a3.setIdade (16);
       a4.setNome ("Victor");
       a4.setIdade (15);
       a5.setNome ("Birma");
       a5.setIdade (14);
       vetoralunos.add (a1);
       vetoralunos.add (a2);
       vetoralunos.add (a3);
       vetoralunos.add (a4);
       vetoralunos.add (a5);
       for (int i = 0; i < 5; i++) {
        System.out.println("Aluno: " + vetoralunos.get(i).getNome() + "  Idade: " + vetoralunos.get(i).getIdade());
    }
        Collections.sort(vetoralunos);
         for (int i=0;i<5;i++)
         {
           System.out.println(vetoralunos.get(i).getNome() + " - " + vetoralunos.get(i).getIdade());
         } 
     }











}

