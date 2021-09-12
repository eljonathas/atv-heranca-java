public class Mamifero extends Animal {
  private String alimento;

  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  public String getAlimento() {
    return alimento;
  }

  @Override
  public String toString() {
    return "Animal: "+getNome()+"\n"+
      "Comprimento: "+getComprimento()+"\n"+
      "Numero de Patas: "+getNumeroDePatas()+"\n"+
      "Cor: "+getCor()+"\n"+
      "Ambiente: "+getAmbiente()+"\n"+
      "Velocidade: "+getVelocidade()+"\n"+
      "Alimento: "+alimento+"\n";
  }
}
