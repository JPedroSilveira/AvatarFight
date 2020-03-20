package br.ufrgs.avatarfight;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Dobrador[] dobradores = new Dobrador[2];

        for (int x = 0; x <= 1; x++) {
            System.out.println("Olá, bem vindo a luta!");
            System.out.println("Jogador "+(x + 1)+", digite o nome do seu dobrador: ");
            String nome = keyboard.next().trim();

            System.out.println("Jogador "+(x + 1)+", escolha um investimento: ");
            System.out.println(" - 1: Vida.");
            System.out.println(" - 2: Defesa");
            System.out.println(" - 3: Dano");
            System.out.println(" - 4: Stun");
            int investimentoEscolhido = keyboard.nextInt();

            Investimento investimento;

            switch (investimentoEscolhido) {
                case 1:
                    investimento = Investimento.VIDA;
                    break;
                case 2:
                    investimento = Investimento.DEFESA;
                    break;
                case 3:
                    investimento = Investimento.DANO;
                    break;
                default:
                    investimento = Investimento.STUN;
            }

            System.out.println("Jogador "+(x + 1)+", escolhe uma das dobras: ");
            System.out.println(" - 1: Ar.");
            System.out.println(" - 2: Água");
            System.out.println(" - 3: Terra");
            System.out.println(" - 4: Fogo");
            int dobra = keyboard.nextInt();

            switch (dobra) {
                case 1:
                    dobradores[x] = new DobradorAr(nome, investimento);
                    break;
                case 2:
                    dobradores[x] = new DobradorAgua(nome, investimento);
                    break;
                case 3:
                    dobradores[x] = new DobradorTerra(nome, investimento);
                    break;
                default:
                    dobradores[x] = new DobradorFogo(nome, investimento);
            }
        }

        Fight fight = new FightImpl(dobradores[0], dobradores[1]);

        while(!fight.fimDeBatalha()) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Turno: " + fight.getTurno());
            if (fight.getTurno() % 2 == 0) {
                System.out.println("Jogador 1 escolha o tipo de ataque: ");
            } else {
                System.out.println("Jogador 2 escolha o tipo do seu ataque: ");
            }

            System.out.println(" - 1: Ataque Simples.");
            System.out.println(" - 2: Ataque Médio");
            System.out.println(" - 3: Ataque Máximo");
            int ataqueEscolhido = keyboard.nextInt();

            TipoAtaque tipoAtaque;

            switch (ataqueEscolhido) {
                case 3:
                    tipoAtaque = TipoAtaque.MAXIMO;
                    break;
                case 2:
                    tipoAtaque = TipoAtaque.MEDIO;
                    break;
                default:
                    tipoAtaque = TipoAtaque.SIMPLES;
            }

            System.out.println(fight.dobradorAtaca(tipoAtaque));
            System.out.println("--------------------------------------------------------");
        }

        System.out.println(fight.getVencedor());
    }
}
