public class Ejecutar {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimple();
        System.out.println(cafe.descripcion() + " = $" + cafe.costo());

        cafe = new ConLeche(cafe);
        cafe = new ConAzucar(cafe);

        System.out.println(cafe.descripcion() + " = $" + cafe.costo());
    }
}
