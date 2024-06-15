public class Hero {
    private String nome;
    private int xp;

    // Construtor
    public Hero(String nome, int xp) {
        this.nome = nome;
        this.xp = xp;
    }

    // Método para obter o nível do herói
    public String obterNivel() {
        if (xp < 1000) {
            return "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            return "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            return "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            return "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            return "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            return "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }

    // Método principal (exemplo de uso)
    public static void main(String[] args) {
        // Criando um herói com nome e XP
        Hero heroi = new Hero("Efraim", 2000);
        
        // Obtendo o nível do herói e exibindo
        String nivel = heroi.obterNivel();
        System.out.println("O herói " + heroi.nome + " está no nível " + nivel);
    }
}
