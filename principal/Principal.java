package principal;

public class Principal {
    public static void main(String[] args) {
        String nomeDoPrimeiroNinja = "Uchiha Obito";
        short idadeDoPrimeiroNinja = 15;
        String missaoDoPrimeiroNinja = "Salvar Rin da vila da Pedra";
        char nivelDeDificuldadeDoPrimeiroNinja = 'S';
        String statusDeConclusaoDoPrimeiroNinja = "Não Concluída";

        if (idadeDoPrimeiroNinja < 15) {
            if (nivelDeDificuldadeDoPrimeiroNinja == 'C' || nivelDeDificuldadeDoPrimeiroNinja == 'D') {
                statusDeConclusaoDoPrimeiroNinja = "Concluída";
            }
        } else {
            statusDeConclusaoDoPrimeiroNinja = "Concluída";
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
        String statusDeConclusaoDoSegundoNinja = "Não Concluída";

        if (idadeDoSegundoNinja < 15) {
            if (nivelDeDificuldadeDoSegundoNinja == 'C' || nivelDeDificuldadeDoSegundoNinja == 'D') {
                statusDeConclusaoDoSegundoNinja = "Concluída";
            }
        } else {
            statusDeConclusaoDoSegundoNinja = "Concluída";
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
        String statusDeConclusaoDoTerceiroNinja = "Não Concluída";

        if (idadeDoTerceiroNinja < 15) {
            if (nivelDeDificuldadeDoTerceiroNinja == 'C' || nivelDeDificuldadeDoTerceiroNinja == 'D') {
                statusDeConclusaoDoTerceiroNinja = "Concluída";
            }
        } else {
            statusDeConclusaoDoTerceiroNinja = "Concluída";
        }

        System.out.println("Nome: " + nomeDoTerceiroNinja);
        System.out.println("Idade: " + idadeDoTerceiroNinja);
        System.out.println("Missão: " + missaoDoTerceiroNinja);
        System.out.println("Nível: " + nivelDeDificuldadeDoTerceiroNinja);
        System.out.println("Status da Missão: " + statusDeConclusaoDoTerceiroNinja);
    }
}
