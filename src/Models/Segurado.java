package Models;

public class Segurado extends Veiculos implements ISeguroService{
    private double seguro;

    public double getSeguro() {
        return seguro;
    }

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    public double doTotal() {
        return super.doTotal() - doDesconto();
    }

    public String doViewCupom() {
        return super.doViewCupom();
    }

    @Override
    public double doDesconto() {
        return super.doTotal() * seguro / 100;
    }
}
