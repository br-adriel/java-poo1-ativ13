
/**
 * Resoluçao da primeira questao
 * 
 * @author Adriel Faria dos Santos 
 * @version 17/05/2022
 */
public class SerieLucas
{
    private int p;
    private int q;
    private int indice = -1;

    public SerieLucas(int p, int q)
    {
        this.p = p;
        this.q = q;
    }

    /*
     * Calcula o termo de uma posicao especifica
     * 
     * pos: Posicao do termo na sequencia
     * 0 -> primeiro termo
     * 1 -> segundo termo
     */
    private int calcular(int pos) {
        if (pos <= 1) {
            return pos;
        }
        
        int a = this.p * calcular(pos-1);
        int b = this.q * calcular(pos-2);
        return a - b;
    }
    
    /*
     * Retorna o proximo termo
     */
    public int proximo() {
        this.indice += 1;
        return calcular(this.indice);
    }
    
    /*
     * Retorna o termo apos n pulos
     */
    public int proximo(int pulo) {
        // Impede o pulo de fazer o indice ir para antes do inicio da serie
        this.indice = (this.indice + pulo < -1) ? -1 : this.indice + pulo;
        return proximo();
    }
}
