public class Ingresso {
  private double valor;

  public Ingresso(double valor) {
    this.valor = valor;
  }

  public void imprimeValor(){
    System.out.println("Valor do ingresso: " + this.valor);
  }
  
  public double getValor() {
    return valor;
  }
}
