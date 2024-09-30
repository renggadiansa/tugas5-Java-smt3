public class StringOperation {
    public static void main(String[] args) {
        String str = "Selamat Datang di PENS";

        String upperCaseStr = str.toUpperCase();
        System.out.println("Huruf kapital: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Huruf kecil: " + lowerCaseStr);

        int length = str.length();
        System.out.println("Panjang string: " + length);

        int indexOfPENS = str.indexOf("PENS");
        if (indexOfPENS != -1) {
            System.out.println("Indeks kata 'PENS': " + indexOfPENS);
        } else {
            System.out.println("Kata 'PENS' tidak ditemukan dalam string.");
        }
    }
}
