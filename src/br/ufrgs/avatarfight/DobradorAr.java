package br.ufrgs.avatarfight;

public class DobradorAr extends PessoaImpl implements Dobrador {

    public DobradorAr(String nome, Investimento investimento) {
        super(nome);
        this.vida = 500;
        this.dano = 60;
        this.defesa = 15;
        this.chanceStun = 10;

        if (investimento == Investimento.VIDA) {
            this.vida += 80;
        } else if (investimento == Investimento.DANO) {
            this.dano += 10;
        } else if (investimento == Investimento.DEFESA) {
            this.defesa += 15;
        } else if (investimento == Investimento.STUN) {
            this.chanceStun += 15;
        }
    }

    @Override
    public float calcAtaqueSimples() {
        return dano;
    }

    @Override
    public float calcAtaqueMedio() {
        return dano * 1.5f + defesa * 0.5f;
    }

    @Override
    public float calcAtaqueMaximo() {
        return defesa * 1.5f + dano * 2;
    }

    @Override
    public float calcDefesa(Dobrador dobrador) {
        return this.defesa * dobrador.getMultiplicadorDefesaAr();
    }

    @Override
    public float getMultiplicadorDefesaFogo() {
        return 2;
    }

    @Override
    public float getMultiplicadorDefesaAr() {
        return 2;
    }

    @Override
    public float getMultiplicadorDefesaAgua() {
        return 1;
    }

    @Override
    public float getMultiplicadorDefesaTerra() {
        return 0.5f;
    }
}