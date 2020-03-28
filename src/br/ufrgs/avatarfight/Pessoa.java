package br.ufrgs.avatarfight;

/**
 * Define uma pessoa comum
 */
public interface Pessoa {

    /**
     * Subtrai o valor de entrada da vida do dobrador
     * @param dano Valor a ser subtraido
     */
    void sofrerDano(float dano);

    /**
     * Pega o nome do dobrador
     * @return Nome do dobrador
     */
    String getNome();

    /**
     * Verifica se o dobrador está morto
     * @return Retorna se o dobrador está morto ou não
     */
    boolean estaMorto();

    /**
     * Retorna se o dobrador está em estado de stun
     * @return Retorna true para jogar em estado de stun e false para o contrário
     */
    boolean getEstaEmStun();

    /**
     * Calcula a porcentagem de defesa contra um determinado elemento
     * @param dobrador Dobrador que está atacando
     * @return Porcentagem de defesa contra o elemento de entrada
     */
    float calcDefesa(Dobrador dobrador);

}
