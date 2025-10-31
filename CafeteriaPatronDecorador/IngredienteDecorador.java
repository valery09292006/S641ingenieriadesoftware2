public abstract class IngredienteDecorador implements Bebida {
    protected Bebida bebida; // bebida envuelta

    public IngredienteDecorador(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double getCosto();
}
