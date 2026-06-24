public class SzyfrCezara {
    public static String szyfruj(int klucz, String text) {
        StringBuilder zaszyfrowanie = new StringBuilder();
        for (char znak : text.toCharArray()) {
            char przesunietyZnak;
            if (Character.isLetter(znak)) {
                if (Character.isLowerCase(znak)) {
                    przesunietyZnak = (char) ((znak + klucz - 'a') % 26 + 'a');
                } else {
                    przesunietyZnak = (char) ((znak + klucz - 'A') % 26 + 'A');
                }
                zaszyfrowanie.append(przesunietyZnak);
            } else {
                zaszyfrowanie.append(znak);
            }
        }
        return zaszyfrowanie.toString();
    }
    public static String odszyfruj(int klucz, String text) {
        StringBuilder zaszyfrowanie = new StringBuilder();
        for (char znak : text.toCharArray()) {
            char przesunietyZnak;
            if (Character.isLetter(znak)) {
                if (Character.isLowerCase(znak)) {
                    przesunietyZnak = (char) ((znak + klucz - 'a') % 26 + 'a');
                } else {
                    przesunietyZnak = (char) ((znak + klucz - 'A') % 26 + 'A');
                }
                zaszyfrowanie.append(przesunietyZnak);
            } else {
                zaszyfrowanie.append(znak);
            }
        }
        return zaszyfrowanie.toString();
    }
}
