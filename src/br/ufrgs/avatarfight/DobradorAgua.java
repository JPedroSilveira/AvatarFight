package br.ufrgs.avatarfight;

public class DobradorAgua extends PessoaImpl implements Dobrador {

    public DobradorAgua(String nome, Investimento investimento) {
        super(nome);
        this.vida = 350;
        this.dano = 80;
        this.defesa = 10;
        this.chanceStun = 10;

        if (investimento == Investimento.VIDA) {
            this.vida += 100;
        } else if (investimento == Investimento.DANO) {
            this.dano += 20;
        } else if (investimento == Investimento.DEFESA) {
            this.defesa += 10;
        } else if (investimento == Investimento.STUN) {
            this.chanceStun += 10;
        }
    }

    @Override
    public float calcAtaqueSimples() {
        return this.dano;
    }

    @Override
    public float calcAtaqueMedio() {
        return this.dano * 1.5f + this.vida * 0.05f;
    }

    @Override
    public float calcAtaqueMaximo() {
        return this.vida * 0.15f + this.dano * 2;
    }

    @Override
    public float calcDefesa(Dobrador dobrador) {
        return this.defesa * dobrador.getMultiplicadorDefesaAgua();
    }

    @Override
    public float getMultiplicadorDefesaFogo() {
        return 0.5f;
    }

    @Override
    public float getMultiplicadorDefesaAr() {
        return 1;
    }

    @Override
    public float getMultiplicadorDefesaAgua() {
        return 2;
    }

    @Override
    public float getMultiplicadorDefesaTerra() {
        return 3;
    }
}
