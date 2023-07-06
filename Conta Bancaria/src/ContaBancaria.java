import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Lorena Silva Moreira";
        String tipoConta = "Conta Corrente";
        double saldo = 2249.56;
        int opcao = 0;


        System.out.println("*****************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Débito em conta: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                ** O que o senhor(a) deseja realizar?
                1 - Consultar seu saldo
                2 - Transferir Via Pix
                3 - Receber valor
                4 - Saida
                
                """;

        Scanner leitura = new Scanner (System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Valor a pagar: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inexistente. Selecionar outra opção");

            }

        }
    }
}
