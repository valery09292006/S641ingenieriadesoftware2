public class Canela extends IngredienteDecorador {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + canela";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 300;
    }
}
