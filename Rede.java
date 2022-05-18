
import java.util.ArrayList;

/**
 * @author Adriel Faria dos Santos
 * @version 18/05/2022
 */
public class Rede {

    private String nome;
    private ArrayList<Mercado> mercados;

    public Rede(String nome, ArrayList<Mercado> mercados) {
        this.nome = nome;
        this.mercados = mercados;
    }

    public Rede(String nome) {
        this.nome = nome;
        this.mercados = new ArrayList<Mercado>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Mercado> getMercados() {
        return mercados;
    }

    public void setMercados(ArrayList<Mercado> mercados) {
        this.mercados = mercados;
    }

    public void addMercado(Mercado m) {
        this.mercados.add(m);
    }

    public void totalVendas() {
        double total = 0;
        for (Mercado m : this.mercados) {
            total += m.totalVendas();
        }
    }
    
    public ArrayList<Venda> vendas() {
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        for (Mercado mercado : this.mercados) {
            vendas.addAll(mercado.getVendas());
        }
        return vendas;
    }
    
    public ArrayList<Venda> vendasMes(String mes) {
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        for (Mercado mercado : this.mercados) {
            vendas.addAll(mercado.vendasMes(mes));
        }
        return vendas;
    }

}
