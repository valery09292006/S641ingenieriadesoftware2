public class ConAzucar extends CafeDecorador {
    public ConAzucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + " + Azúcar";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 200;
    }
}
