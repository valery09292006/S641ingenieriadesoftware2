public class Leche extends IngredienteDecorador {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 500;
    }
}
