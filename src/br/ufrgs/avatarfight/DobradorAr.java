package br.ufrgs.avatarfight;

public class DobradorAr extends DobradorImpl {

    public DobradorAr(String nome, Investimento investimento) {
        super(nome);
        this.vida = 500;
        this.dano = 60;
        this.defesa = 15;
        this.chanceStun = 10;
        this.elemento = Elemento.AR;

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
    public float calcDefesa(Elemento elemento) {
        if (elemento == Elemento.AR) {
            return this.defesa * 2;
        } else if (elemento == Elemento.AGUA) {
            return this.defesa;
        } else if (elemento == Elemento.FOGO) {
            return this.defesa * 0.5f;
        } else { //if (elemento == Elemento.TERRA)
            return this.defesa * 3;
        }
    }
}