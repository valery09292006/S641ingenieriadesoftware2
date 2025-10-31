public class Crema extends IngredienteDecorador {
    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + crema";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 700;
    }
}
