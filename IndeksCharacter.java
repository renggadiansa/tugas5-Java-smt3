import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndeksCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.print("Karakter yang dicari: ");
        char karakter = scanner.nextLine().charAt(0);

        List<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == karakter) {
                indeks.add(i);
            }
        }

        if (!indeks.isEmpty()) {
            System.out.print("Karakter '" + karakter + "' terdapat pada indek: ");
            for (int i = 0; i < indeks.size(); i++) {
                System.out.print(indeks.get(i));
                if (i < indeks.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Karakter '" + karakter + "' tidak ditemukan dalam kalimat.");
        }

        scanner.close();
    }
}
