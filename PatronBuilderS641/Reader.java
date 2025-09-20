public class Reader {
    // Atributos
    private String element;
    private Converter converter;

    //Constructor de las clases
    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }
    //Metodos
    public void parseInput(){
        switch (element) {
            case "LINE":
            converter.makeline();
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
