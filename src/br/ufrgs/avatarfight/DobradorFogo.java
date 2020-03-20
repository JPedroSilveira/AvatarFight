package br.ufrgs.avatarfight;

public class DobradorFogo extends DobradorImpl {

    public DobradorFogo(String nome, Investimento investimento) {
        super(nome);
        this.vida = 350;
        this.dano = 80;
        this.defesa = 10;
        this.chanceStun = 5;
        this.elemento = Elemento.FOGO;

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
    public float calcDefesa(Elemento elemento) {
        if (elemento == Elemento.AR) {
            return this.defesa * 3;
        } else if (elemento == Elemento.AGUA) {
            return this.defesa * 0.5f;
        } else if (elemento == Elemento.FOGO) {
            return this.defesa * 2;
        } else { //if (elemento == Elemento.TERRA)
            return this.defesa;
        }
    }

}
