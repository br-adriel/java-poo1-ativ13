import java.util.ArrayList;

/**
 * @author Adriel Faria dos Santos
 * @version 18/05/2022
 */
public class Mercado {

    private String nome;
    private ArrayList<Venda> vendas;

    public Mercado(String nome, ArrayList<Venda> vendas) {
        this.nome = nome;
        this.vendas = vendas;
    }

    public Mercado(String nome) {
        this.nome = nome;
        this.vendas = new ArrayList<Venda>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public void addVenda(Venda venda) {
        this.vendas.add(venda);
    }
    
    public double totalVendas() {
        double total = 0;
        for (Venda v : this.vendas) {
            total += v.total();
        }
        return total;
    }
    
    public double totalVendasMes(String mes) {
        double total = 0;
        for (Venda venda : this.vendas) {
            if (venda.getDataString().contains("/"+ mes +"/")) {
                total += venda.total();
            }
        }
        return total;
    }
    
    public ArrayList<Venda> vendasMes(String mes) {
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        for (Venda venda : this.vendas) {
            if (venda.getDataString().contains("/"+ mes +"/")) {
                vendas.add(venda);
            }
        }
        return vendas;
    }
}
