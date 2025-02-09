package Principal;

import Models.BalancoDiario;
import Models.Segurado;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);

        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(2);
        veicSeg.setHoras(0);

        System.out.println(veicSeg.doViewCupom());

        BalancoDiario bd = new BalancoDiario();

        System.out.println(bd.doGerarRelatorio());
    }
}
