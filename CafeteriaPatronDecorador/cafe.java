public class cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double getCosto() {
        return 2500;
    }
}
