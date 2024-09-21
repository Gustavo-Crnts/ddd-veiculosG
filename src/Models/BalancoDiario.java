package Models;

public class BalancoDiario {
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculos veiculos){
        qtdeCarros++;
        total += veiculos.doTotal();
    }
    public String doGerarRelatorio(){
        return String.format("Quantidade de carros: %i\n Valor total: R$%2.f", qtdeCarros, total);
    }
}
