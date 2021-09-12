public class VIP {
  private Ingresso ingresso;
  private double valorAdicional;
  
  public VIP(Ingresso ingresso, double valorAdicional) {
    this.ingresso = ingresso;
    this.valorAdicional = valorAdicional;
  }

  public double getValor() {
    return ingresso.getValor() + valorAdicional;
  }

  public double getValorAdicional() {
    return valorAdicional;
  }

  public void setValorAdicional(double valorAdicional) {
    this.valorAdicional = valorAdicional;
  }

  public Ingresso getIngresso() {
    return ingresso;
  }

  public void setIngresso(Ingresso ingresso) {
    this.ingresso = ingresso;
  }
}
