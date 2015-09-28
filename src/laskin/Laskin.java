package laskin;

public class Laskin {

    private static int tulos;  // Muuttuja tulokselle
    
    public void nollaa() {     // Nollaa tuloksen
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }
    
    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
        if (n == 0) throw new ArithmeticException("Division by zero");
        else tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        if (n < 0) throw new ArithmeticException("Square root of negative number");
        else tulos = Double.valueOf(Math.sqrt(n)).intValue();
    }
    
    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

}
