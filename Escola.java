
import java.util.ArrayList;

/**
 * @author Adriel Faria dos Santos
 * @version 17/05/2022
 */
public class Escola {

    private String nome;
    private ArrayList<Estudante> estudantes;

    public Escola(String nome, ArrayList<Estudante> estudantes) {
        this.nome = nome;
        this.estudantes = estudantes;
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public double mediaNivelLeitura() {
        double soma = 0.0;
        for (Estudante est : this.estudantes) {
            soma += est.getNivelLeitura();
        }
        return soma / this.estudantes.size();
    }

    public ArrayList<Estudante> acimaMedia(double media) {
        ArrayList<Estudante> resultado = new ArrayList<Estudante>();
        for (Estudante est : this.estudantes) {
            if (est.getNivelLeitura() > media) {
                resultado.add(est);
            }
        }
        return resultado;
    }

    public ArrayList<Estudante> acimaMedia() {
        double media = mediaNivelLeitura();
        return acimaMedia(media);
    }
}
