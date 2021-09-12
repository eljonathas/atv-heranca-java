public class Peixe extends Animal {
  private String caracteristica;

  public String getCaracteristica() {
    return caracteristica;
  }

  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
  }

  @Override
  public String toString() {
    return "Animal: "+getNome()+"\n"+
      "Comprimento: "+getComprimento()+"\n"+
      "Numero de Patas: "+getNumeroDePatas()+"\n"+
      "Cor: "+getCor()+"\n"+
      "Ambiente: "+getAmbiente()+"\n"+
      "Velocidade: "+getVelocidade()+"\n"+
      "Caracteristica: "+caracteristica+"\n";
  }
}
