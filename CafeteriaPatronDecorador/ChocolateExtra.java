public class ChocolateExtra extends IngredienteDecorador {
    public ChocolateExtra(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + chocolate extra";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1000;
    }
}
