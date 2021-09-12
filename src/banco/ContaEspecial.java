package banco;

public class ContaEspecial extends ContaCorrente {
  private float limite;

  public ContaEspecial(float saldo, float limite) {
    super(saldo);
    this.limite = limite;
  }

  @Override
  public boolean sacar(float valor) {
    if (valor <= limite && valor <= saldo || (saldo - valor) >= -limite) {
      saldo -= valor;
      return true;
    }
    
    System.out.println("Saldo insuficiente ou maior que o limite permitido");
    return false;
  }

  public float getLimite() {
    return limite;
  }

  @Override
  public String toString() {
    return "ContaEspecial {\n" +
        "limite= " + limite + "\n" + 
        "saldo= " + saldo + "\n" +
      "}";
  }
}
