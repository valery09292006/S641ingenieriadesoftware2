public class EjecutarConverterI {
    public static void main(String[] args) {

        ConverterI ASCII = new ASCIIConverterI();
        ConverterI PostScript = new PostScriptConverterI();
        ConverterI PDF = new PDFConverterI();

        Reader lector1 = new Reader("LINE", ASCII);
        lector1.parseInput();

        Reader lector2 = new Reader("LINE", PDF);
        lector2.parseInput();

        Reader lector3 = new Reader("PARAGRAPH", PostScript);
        lector3.parseInput();

    }
}