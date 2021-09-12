public class Animal {
  private String nome;
  private String comprimento;
  private String numeroDePatas;
  private String cor;
  private String ambiente;
  private String velocidade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getComprimento() {
    return comprimento;
  }

  public void setComprimento(String comprimento) {
    this.comprimento = comprimento;
  }

  public String getNumeroDePatas() {
    return numeroDePatas;
  }

  public void setNumeroDePatas(String numeroDePatas) {
    this.numeroDePatas = numeroDePatas;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public String getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(String velocidade) {
    this.velocidade = velocidade;
  }

  @Override
  public String toString() {
    return "Animal: "+nome+"\n"+
      "Comprimento: "+comprimento+"\n"+
      "Numero de Patas: "+numeroDePatas+"\n"+
      "Cor: "+cor+"\n"+
      "Ambiente: "+ambiente+"\n"+
      "Velocidade: "+velocidade+"\n";
  }
}
