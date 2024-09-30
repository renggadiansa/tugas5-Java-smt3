import java.util.Scanner;

public class SwitchName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String nama pertama: ");
        String namaPertama = scanner.nextLine();

        System.out.print("String nama kedua: ");
        String namaKedua = scanner.nextLine();

        String firstName = namaPertama.substring(namaPertama.lastIndexOf(" ") + 1);
        String secondName = namaKedua.substring(namaKedua.lastIndexOf(" ") + 1);

        String newNamaPertama = namaPertama.replace(firstName, secondName);
        String newNamaKedua = namaKedua.replace(secondName, firstName);

        System.out.println("String nama pertama: " + newNamaPertama);
        System.out.println("String nama kedua: " + newNamaKedua);

        scanner.close();
    }
}
