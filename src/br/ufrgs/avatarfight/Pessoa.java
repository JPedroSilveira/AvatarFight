package br.ufrgs.avatarfight;

/**
 * Define uma pessoa comum
 */
public interface Pessoa {
    /**
     * Salva um novo valor para o estado de stun
     * @param estaEmStun Novo estado de stun
     */
    void setEstaEmStun(boolean estaEmStun);

    /**
     * Retorna a chance de dar stun no ataque do dobrador
     * @return Retorna a chance de stun
     */
    float getChanceStun();

    /**
     * Calcula o dano do ataque simples do dobrador
     * @return Dano do ataque
     */
    float calcAtaqueSimples();

    /**
     * Calcula o dano do ataque médio do dobrador
     * @return Dano do ataque médio
     */
    float calcAtaqueMedio();

    /**
     * Calcula o dano do ataque máximo do dobrador
     * @return Dano do ataque máximo
     */
    float calcAtaqueMaximo();

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
