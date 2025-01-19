package principal;

public class Principal {
    public static void main(String[] args) {
        String nomeDoPrimeiroNinja = "Uchiha Obito";
        short idadeDoPrimeiroNinja = 15;
        String missaoDoPrimeiroNinja = "Salvar Rin da vila da Pedra";
        char nivelDeDificuldadeDoPrimeiroNinja = 'S';
        String statusDeConclusaoDoPrimeiroNinja = "";

        if (idadeDoPrimeiroNinja >= 15) {
            statusDeConclusaoDoPrimeiroNinja = "Concluída";
        } else {
            statusDeConclusaoDoPrimeiroNinja = "Não Concluída";
        }

        System.out.println("Nome: " + nomeDoPrimeiroNinja);
        System.out.println("Idade: " + idadeDoPrimeiroNinja);
        System.out.println("Missão: " + missaoDoPrimeiroNinja);
        System.out.println("Nível: " + nivelDeDificuldadeDoPrimeiroNinja);
        System.out.println("Status da Missão: " + statusDeConclusaoDoPrimeiroNinja);
        System.out.println();

        String nomeDoSegundoNinja = "Sakura Haruno";
        short idadeDoSegundoNinja = 13;
        String missaoDoSegundoNinja = "Escoltar Tazuna ao país das Ondas";
        char nivelDeDificuldadeDoSegundoNinja = 'A';
        String statusDeConclusaoDoSegundoNinja = "";

        if (idadeDoSegundoNinja >= 15) {
            statusDeConclusaoDoSegundoNinja = "Não Concluída";
        } else {
            statusDeConclusaoDoSegundoNinja = "Não Concluída";
        }

        System.out.println("Nome: " + nomeDoSegundoNinja);
        System.out.println("Idade: " + idadeDoSegundoNinja);
        System.out.println("Missão: " + missaoDoSegundoNinja);
        System.out.println("Nível: " + nivelDeDificuldadeDoSegundoNinja);
        System.out.println("Status da Missão: " + statusDeConclusaoDoSegundoNinja);
        System.out.println();

        String nomeDoTerceiroNinja = "kakuzu";
        short idadeDoTerceiroNinja = 91;
        String missaoDoTerceiroNinja = "Matar o Senju Hashirama";
        char nivelDeDificuldadeDoTerceiroNinja = 'S';
        String statusDeConclusaoDoTerceiroNinja = "";

        if (idadeDoTerceiroNinja >= 15) {
            statusDeConclusaoDoTerceiroNinja = "Concluída";
        } else {
            statusDeConclusaoDoTerceiroNinja = "Não Concluída";
        }

        System.out.println("Nome: " + nomeDoTerceiroNinja);
        System.out.println("Idade: " + idadeDoTerceiroNinja);
        System.out.println("Missão: " + missaoDoTerceiroNinja);
        System.out.println("Nível: " + nivelDeDificuldadeDoTerceiroNinja);
        System.out.println("Status da Missão: " + statusDeConclusaoDoTerceiroNinja);
    }
}
