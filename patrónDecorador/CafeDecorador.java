public abstract class CafeDecorador implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorador(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion();
    }

    @Override
    public double costo() {
        return cafeDecorado.costo();
    }
}
