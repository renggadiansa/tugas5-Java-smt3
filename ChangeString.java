import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String kalimat utama: ");
        String kalimatUtama = scanner.nextLine();

        System.out.print("String yang diganti: ");
        String kataDiganti = scanner.nextLine();

        System.out.print("String pengganti: ");
        String kataPengganti = scanner.nextLine();

        String kalimatBaru = kalimatUtama.replace(kataDiganti, kataPengganti);

        System.out.println("Kalimat utama menjadi: " + kalimatBaru);

        scanner.close();
    }
}
