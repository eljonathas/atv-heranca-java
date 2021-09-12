public class CamaroteInferior {
  private VIP vip;
  private String localizacao = "Camarote Inferior";

  public CamaroteInferior(VIP vip) {
    this.vip = vip;
  }

  public String getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public VIP getVip() {
    return vip;
  }

  public void setVip(VIP vip) {
    this.vip = vip;
  }

  public void imprimeValor(){
    System.out.println("Valor do ingresso (VIP Camarote Inferior): R$ " + vip.getValor());
  }
}
