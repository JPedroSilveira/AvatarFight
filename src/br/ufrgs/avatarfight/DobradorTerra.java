package br.ufrgs.avatarfight;

public class DobradorTerra extends DobradorImpl implements Dobrador {

    public DobradorTerra(String nome, Investimento investimento) {
        super(nome);
        this.vida = 600;
        this.dano = 40;
        this.defesa = 25;
        this.chanceStun = 40;

        if (investimento == Investimento.VIDA) {
            this.vida += 50;
        } else if (investimento == Investimento.DANO) {
            this.dano += 10;
        } else if (investimento == Investimento.DEFESA) {
            this.defesa += 15;
        } else if (investimento == Investimento.STUN) {
            this.chanceStun += 25;
        }
    }

    @Override
    public float calcAtaqueSimples() {
        return dano;
    }

    @Override
    public float calcAtaqueMedio() {
        return dano * 1.5f + defesa;
    }

    @Override
    public float calcAtaqueMaximo() {
        return dano * 2 + defesa * 2;
    }

    @Override
    public float calcDefesa(Dobrador dobrador) {
        return this.defesa * dobrador.getMultiplicadorDefesaTerra();
    }

    @Override
    public float getMultiplicadorDefesaFogo() {
        return 1;
    }

    @Override
    public float getMultiplicadorDefesaAr() {
        return 2;
    }

    @Override
    public float getMultiplicadorDefesaAgua() {
        return 3;
    }

    @Override
    public float getMultiplicadorDefesaTerra() {
        return 1;
    }
}
