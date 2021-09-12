public class CamaroteSuperior {
  private String localizacao = "Camarote Superior";
  private double adicional;
  private VIP vip;

  public CamaroteSuperior(VIP vip, double adicional){
    this.vip = vip;
    this.adicional = adicional;
  }

  public String getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public double getAdicional() {
    return adicional;
  }

  public void setAdicional(double adicional) {
    this.adicional = adicional;
  }

  public VIP getVip() {
    return vip;
  }

  public void setVip(VIP vip) {
    this.vip = vip;
  }

  public void imprimeValor(){
    System.out.println("Valor do ingresso (VIP Camarote Superior): R$ " + (vip.getValor() + adicional));
  }
}
