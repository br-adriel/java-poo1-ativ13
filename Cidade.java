
/**
 * @author Adriel Faria dos Santos
 * @version 17/05/2022
 */
public class Cidade {

    private String nome;
    private Escola[] escolas;

    public Cidade(String nome, Escola[] escolas) {
        this.nome = nome;
        this.escolas = escolas;
    }

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola[] getEscolas() {
        return escolas;
    }

    public void setEscolas(Escola[] escolas) {
        this.escolas = escolas;
    }

    public double mediaNivelLeitura() {
        double soma = 0;
        for (Escola esc : this.escolas) {
            soma += esc.mediaNivelLeitura();
        }
        return soma / this.escolas.length;
    }
}
