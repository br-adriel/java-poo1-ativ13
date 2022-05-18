import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Adriel Faria dos Santos
 * @version 18/05/2022
 */
public class Venda {
    private Date data;
    private ArrayList<Item> itens;
    private SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    public Venda(String data, ArrayList<Item> itens) {
        try {
            this.data = formatador.parse(data);
        } catch (java.text.ParseException pe) {
            pe.printStackTrace();
        }
        this.itens = itens;
    }
    
    public Venda(String data) {
        try {
            this.data = formatador.parse(data);
        } catch (java.text.ParseException pe) {
            pe.printStackTrace();
        }
        this.itens = new ArrayList<Item>();
    }

    public Date getData() {
        return this.data;
    }
    
    public String getDataString() {
        return formatador.format(this.data);
    }

    public void setData(String data) {
        try {
            this.data = formatador.parse(data);
        } catch (java.text.ParseException pe) {
            pe.printStackTrace();
        }
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }
    
    public double total() {
        double total = 0;
        for (Item i : this.itens) {
            total += i.total();
        }
        return total;
    }
}
