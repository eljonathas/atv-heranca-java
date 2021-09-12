public class Normal {
  private Ingresso ingresso;

  public Normal(Ingresso ingresso) {
    this.ingresso = ingresso;
  }

  public void setIngresso(Ingresso ingresso) {
    this.ingresso = ingresso;
  }

  public Ingresso getIngresso() {
    return ingresso;
  }

  public void imprimeValor() {
    System.out.println("Valor do ingresso normal: R$ " + ingresso.getValor());
  }
}
