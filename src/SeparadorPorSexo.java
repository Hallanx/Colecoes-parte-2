import java.util.Scanner;
import java.util.ArrayList;

public class SeparadorPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome da pessoa (ou digite 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
            }
        }

        System.out.println("\n--- Grupo de Homens ---");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("\n--- Grupo de Mulheres ---");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

        scanner.close();
    }
}