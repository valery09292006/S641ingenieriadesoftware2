// Decorador de leche
public class ConLeche extends CafeDecorador {
    public ConLeche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + " + Leche";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 500;
    }
}
