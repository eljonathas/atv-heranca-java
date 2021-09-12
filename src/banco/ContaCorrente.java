package banco;

public class ContaCorrente {
  protected float saldo;

  public ContaCorrente(){
    this.saldo = 0;
  }

  public ContaCorrente(float saldo){
    this.saldo = saldo;
  }

  public void depositar(float valor){
    this.saldo += valor;
  }

  public boolean sacar(float valor){
    if(this.saldo >= valor){
      this.saldo -= valor;
    } else {
      System.out.println("Saldo insuficiente");
      return false;
    }
    return true;
  }

  public boolean transferir(ContaCorrente conta, float valor){
    if(this.saldo >= valor){
      this.saldo -= valor;
      conta.depositar(valor);
    } else {
      System.out.println("Saldo insuficiente");
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "ContaCorrente {\n" +
      "saldo= "+ saldo +"\n"+
      "}";
  }
}
