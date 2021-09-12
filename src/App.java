import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Ingresso ingresso = new Ingresso(100);
    System.out.println("Ingresso criado. Escolha uma opção:\n1 - Ingresso Normal\n2 - Ingresso VIP");
    int opcao = Integer.parseInt(sc.nextLine());
    
    switch(opcao){
      case 1:
      Normal normal = new Normal(ingresso);
      
      normal.imprimeValor();
      break;
      case 2:
      VIP vip = new VIP(ingresso, 30);
      
      System.out.println("VIP selecionado. Escolha uma opção:\n1 - Camarote superior\n2 - Camarote inferior");
      int opcao2 = Integer.parseInt(sc.nextLine());
      
      switch(opcao2){
        case 1:
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(vip, 20);
        
        camaroteSuperior.imprimeValor();
        break;
        case 2:
        CamaroteInferior camaroteInferior = new CamaroteInferior(vip);
        
        camaroteInferior.imprimeValor();
        break;
        default:
        System.out.println("Opção inválida");
        break;
      }
      break;
      default:
      System.out.println("Opção inválida");
      break;
    }
  }
}
