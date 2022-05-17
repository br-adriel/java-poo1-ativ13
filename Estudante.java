
/**
 * @author Adriel Faria dos Santos
 * @version 17/05/2022
 */
public class Estudante
{
    private String cpf;
    private int nivelLeitura;

    public Estudante(String cpf, int nivelLeitura) {
        this.cpf = cpf;
        this.nivelLeitura = nivelLeitura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNivelLeitura() {
        return nivelLeitura;
    }

    public void setNivelLeitura(int nivelLeitura) {
        this.nivelLeitura = nivelLeitura;
    }
}
