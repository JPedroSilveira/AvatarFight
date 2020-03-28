package br.ufrgs.avatarfight;

/**
 * Define as funções básicas de um dobrador
 */
interface Dobrador extends Pessoa {

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
     * Pega o multiplicador do dano para o elemento fogo que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaFogo();

    /**
     * Pega o multiplicador do dano para o elemento ar que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaAr();

    /**
     * Pega o multiplicador do dano para o elemento água que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaAgua();

    /**
     * Pega o multiplicador do dano para o elemento terra que a classe sofrerá
     * @return Retorna o valor float
     */
    float getMultiplicadorDefesaTerra();

}
