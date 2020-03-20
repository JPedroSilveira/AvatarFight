package br.ufrgs.avatarfight;

public class DobradorTerra extends DobradorImpl {

    public DobradorTerra(String nome, Investimento investimento) {
        super(nome);
        this.vida = 600;
        this.dano = 40;
        this.defesa = 25;
        this.chanceStun = 40;
        this.elemento = Elemento.TERRA;

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
    public float calcDefesa(Elemento elemento) {
        if (elemento == Elemento.AR) {
            return this.defesa * 0.5f;
        } else if (elemento == Elemento.AGUA) {
            return this.defesa * 3;
        } else if (elemento == Elemento.FOGO) {
            return this.defesa * 2;
        } else { //if (elemento == Elemento.TERRA)
            return this.defesa;
        }
    }

}
