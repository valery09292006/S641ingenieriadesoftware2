public class CafeSimple implements Cafe {
    @Override
    public String descripcion() {
        return "Café simple";
    }

    @Override
    public double costo() {
        return 2000;
    }
}
