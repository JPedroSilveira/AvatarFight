package br.ufrgs.avatarfight;

public class DobradorFogo extends PessoaImpl implements Dobrador {

    public DobradorFogo(String nome, Investimento investimento) {
        super(nome);
        this.vida = 350;
        this.dano = 80;
        this.defesa = 10;
        this.chanceStun = 5;

        if (investimento == Investimento.VIDA) {
            this.vida += 150;
        } else if (investimento == Investimento.DANO) {
            this.dano += 10;
        } else if (investimento == Investimento.DEFESA) {
            this.defesa += 10;
        } else if (investimento == Investimento.STUN) {
            this.chanceStun += 5;
        }
    }

    @Override
    public float calcAtaqueSimples() {
        return dano;
    }

    @Override
    public float calcAtaqueMedio() {
        return dano * 1.5f + vida * 0.05f;
    }

    @Override
    public float calcAtaqueMaximo() {
        return vida * 0.15f + dano * 2;
    }

    @Override
    public float calcDefesa(Dobrador dobrador) {
        return this.defesa * dobrador.getMultiplicadorDefesaFogo();
    }

    @Override
    public float getMultiplicadorDefesaFogo() {
        return 2;
    }

    @Override
    public float getMultiplicadorDefesaAr() {
        return 0.5f;
    }

    @Override
    public float getMultiplicadorDefesaAgua() {
        return 3;
    }

    @Override
    public float getMultiplicadorDefesaTerra() {
        return 2;
    }
}
