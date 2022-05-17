
/**
 * @author Adriel Faria dos Santos
 * @version 17/05/2022
 */
public class Estado {

    private String nome;
    private Cidade[] cidades;

    public Estado(String nome, Cidade[] cidades) {
        this.nome = nome;
        this.cidades = cidades;
    }

    public Estado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade[] getCidades() {
        return cidades;
    }

    public void setCidades(Cidade[] cidades) {
        this.cidades = cidades;
    }

    public double mediaNivelLeitura() {
        double soma = 0;
        for (Cidade cid : this.cidades) {
            soma += cid.mediaNivelLeitura();
        }
        return soma / this.cidades.length;
    }
}
