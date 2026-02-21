// ----- CLASSE JOGADOR CORRIGIDA -----
class Jogador {
    private String nome;
    private int pontuacao;
    private int vida;
    private static final int VIDA_MAXIMA = 100; // Constante

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.vida = VIDA_MAXIMA;
        System.out.println("Jogador " + this.nome + " entrou no jogo!");
    }
    
    // A pontuação só aumenta
    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            System.out.println(this.nome + " ganhou " + pontos + " pontos! Total: " + this.pontuacao);
        }
    }

    // Controla o dano recebido
    public void receberDano(int dano) {
        if (dano > 0 && this.vida > 0) {
            this.vida -= dano; // Subtrai o dano da vida
            if (this.vida < 0) {
                this.vida = 0; // Vida nunca negativa
            }

            System.out.println(this.nome + " recebeu " + dano + " de dano! Vida atual: " + this.vida);

            if (this.vida == 0) {
                System.out.println(this.nome + " foi derrotado!");
            }
        }
    }

    // Controla a cura recebida, sem passar da vida máxima
    public void receberCura(int cura) {
        if (cura > 0 && this.vida > 0) {
            this.vida += cura;
            if (this.vida > VIDA_MAXIMA) {
                this.vida = VIDA_MAXIMA;
            }
            System.out.println(this.nome + " recuperou " + cura + " de vida! Vida atual: " + this.vida);
        }
    }

    // Ressucitar o jogador
    public void ressucitarCorpo(int corpo) {
        if (this.vida == 0) {
            this.vida = VIDA_MAXIMA;
            System.out.println(this.nome + " foi ressuscitado! Vida atual: " + this.vida);
            
        }
    }

    // Getters
    public int getPontuacao() { return this.pontuacao; }
    public int getVida() { return this.vida; }
    public String getNome() { return this.nome; }
}

