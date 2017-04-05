public class Papelaria {
    public static Papelaria instancia;

    protected int totalLapis;
    protected int totalBorracha;
    protected int totalApontador;

  private Papelaria(){
  }

  public static Papelaria getInstancia() {
    if (instancia == null)
     instancia = new Papelaria();
     return instancia;
  }
}
