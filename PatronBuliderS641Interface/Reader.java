public class Reader {
    // Atributos
    private String element;
    private ConverterI converter;

    // Constructor de las clases
    public Reader(String element, ConverterI converter) {
        this.element = element;
        this.converter = converter;
    }

    // Metodos
    public void parseInput() {
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            case "PRAGRAPH":
                converter.makeParagraph();
                break;
            case "TABLE":
                converter.makeTable();
                break;
            default:
                System.out.println("opción no valida");
        }
    }
}
