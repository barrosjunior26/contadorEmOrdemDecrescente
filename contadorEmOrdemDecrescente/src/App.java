import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        //
        //Entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes).
        //
        //Declaração de variáveis
        int opcao = 0;
        //
        //Adicionando um loop para que o usuário possa repetir a operação ou apenas sair dela.
        do{
            //Solicitando a entrada de dados ao usuário
            System.out.print("Digite o primeiro número: ");
            int num1 = leia.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = leia.nextInt();
            //
            //Processamento dos dados e exibição do resultado para o usuário
            if (num1 > num2) {
                for(num1 = num1; num1 >= num2; num1--){
                    System.out.println(num1);
                }
            }else if (num2 > num1) {
                for(num2 = num2; num2 >= num1; num2--){
                    System.out.println(num2);
                }
            }else{
                System.out.println("\nOS VALORES DIGITADOS SÃO IGUAIS, REPITA A OPERAÇÃO");
            }
            System.out.print("Digite 1 para nova operação ou 0 para sair do sistema: ");
            opcao = leia.nextInt();
        }while(opcao != 0);
        System.out.println("Saindo do sistema...");
    }
}
