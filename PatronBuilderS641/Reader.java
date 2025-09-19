public class Reader {
    private String element;
    private String converter;

    //Constructor de las clases
    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }
    //Metodos
    public void parseInput(){
        Switch (element) {
            case "LINE";
            converter.makeLine();
            break;
            case "PRAGRAPH";
            converter.makepragraph();
            break;
            case "TABLE";
            converter.makeLine();
            break;
            default:
            System.out.println("opción no valida");
        }
    }
}
