import java.util.Scanner;

public class Main {
   
    // Função que calcula o saldo de vitórias e retorna a classificação do jogador
    public static String calcularSaldoENivel(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel;

        // Determinação do nível com base na quantidade de vitórias
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        // Retorna a mensagem formatada com o saldo de vitórias e o nível do jogador
        return "O Herói tem um saldo de " + saldoVitorias + " está no nível de " + nivel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de vitórias e derrotas do jogador
        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        // Calcula e exibe o resultado
        String resultado = calcularSaldoENivel(vitorias, derrotas);
        System.out.println(resultado);
    }
}

