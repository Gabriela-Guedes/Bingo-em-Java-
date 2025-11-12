import java.util.Scanner;
import java.util.List;

public class MainBingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bingo bingo = new Bingo();
        int opcao;

        do {
            System.out.println("\n===== JOGO DO BINGO =====");
            System.out.println("1 - Sortear um novo numero");
            System.out.println("2 - Exibir numeros ja sorteados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Integer numero = bingo.sortearNumero();
                    if (numero != null) {
                        System.out.println("Numero sorteado: " + numero);
                    } else {
                        System.out.println("Todos os numeros ja foram sorteados!");
                    }
                    break;

                case 2:
                    List<Integer> numeros = bingo.getNumerosSorteados();
                    if (numeros.isEmpty()) {
                        System.out.println("Nenhum numero foi sorteado ainda.");
                    } else {
                        System.out.println("Numeros sorteados: " + numeros);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o jogo... Ate logo!");
                    break;

                default:
                    System.out.println("Opçao invalida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}