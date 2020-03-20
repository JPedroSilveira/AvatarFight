package br.ufrgs.avatarfight;

public interface Fight {

    /**
     * Realiza um ataque de um dobrador no outro
     * @param tipo Tipo de ataque
     * @return Retorna um relatório de dano
     */
    String dobradorAtaca(TipoAtaque tipo);

    /**
     * Diz se a batalha já terminou
     * @return true para batalha finalizada e false para o contrário
     */
    boolean fimDeBatalha();

    /**
     * Retorna um texto com o nome do vencedor
     * @return String contendo o nome do vencedor
     */
    String getVencedor();

    /**
     * Retorna o turno da jogada
     * @return Inteiro com o número da rodada
     */
    int getTurno();
}
