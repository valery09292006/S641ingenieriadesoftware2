public class EjecutarConverter {
    public static void main(String[] args) {
        
        Converter ASCII = new ASCIIConverter();
        Converter PostScript = new PostScriptConverter();
        Converter PDF = new PDFConverter();

        Reader lector1 = new Reader("LINE", ASCII);
        lector1.parseInput();

        Reader lector2 = new Reader("LINE", PDF);
        lector2.parseInput();

        Reader lector3 = new Reader("PARAGRAPH", PostScript);
        lector3.parseInput();

    }
}