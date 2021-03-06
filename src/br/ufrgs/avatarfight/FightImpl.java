package br.ufrgs.avatarfight;

import java.util.Random;

public class FightImpl implements Fight {

    private Dobrador dobradorUm;

    private Dobrador dobradorDois;

    private int turno;

    public FightImpl(Dobrador[] dobradores) {
        this.dobradorUm = dobradores[0];
        this.dobradorDois = dobradores[1];
        this.turno = 0;
    }

    @Override
    public String dobradorAtaca(TipoAtaque tipo) {
        Dobrador dobradorAtacando;
        Dobrador dobradorDefendendo;

        if (turno % 2 == 0) {
            dobradorAtacando = dobradorUm;
            dobradorDefendendo = dobradorDois;
        } else {
            dobradorAtacando = dobradorDois;
            dobradorDefendendo = dobradorUm;
        }

        this.turno += 1;

        if (!dobradorAtacando.getEstaEmStun()) {
            boolean ataqueComStun = false;

            float danoParcial;
            if (tipo == TipoAtaque.SIMPLES) {
                danoParcial = dobradorAtacando.calcAtaqueSimples();
            } else if (tipo == TipoAtaque.MEDIO) {
                danoParcial = dobradorAtacando.calcAtaqueMedio();
            } else { // tipo == TipoAtaque.MAXIMO
                danoParcial = dobradorAtacando.calcAtaqueMaximo();
            }

            float porcentagemDefesa = dobradorDefendendo.calcDefesa(dobradorAtacando);

            float danoBruto = danoParcial * (porcentagemDefesa / 100);

            Random rand = new Random();

            int valorMaximo = 100;
            int random = rand.nextInt(valorMaximo);

            if (random < dobradorAtacando.getChanceStun()) {
                ataqueComStun = true;
            }

            dobradorDefendendo.sofrerDano(danoBruto);
            dobradorDefendendo.setEstaEmStun(ataqueComStun);

            String mensagem = dobradorAtacando.getNome() + " atacou " + dobradorDefendendo.getNome() + " causando " + danoBruto;

            if (ataqueComStun) {
                mensagem += " e também foi atordoado!";
            } else {
                mensagem += ".";
            }

            return mensagem;
        } else {
            return dobradorAtacando.getNome() + " está atordoado e não pode atacar!";
        }
    }

    @Override
    public boolean fimDeBatalha() {
        return this.dobradorUm.estaMorto() || this.dobradorDois.estaMorto();
    }

    @Override
    public String getVencedor() {
        if (this.dobradorUm.estaMorto()) {
            return this.dobradorDois.getNome() + " venceu!";
        } else if (this.dobradorDois.estaMorto()) {
            return this.dobradorUm.getNome() + " venceu!";
        }

        return "Ambos ainda estão aptos para batalhar!";
    }

    @Override
    public int getTurno() {
        return this.turno;
    }
}
