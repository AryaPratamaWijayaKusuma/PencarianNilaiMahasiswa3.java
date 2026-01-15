import java.util.Scanner;

public class PencarianNilaiMahasiswa {

    // Method Binary Search dengan perhitungan langkah
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int langkah = 0;

        while (left <= right) {
            langkah++;
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Jumlah langkah pencarian: " + langkah);
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Jumlah langkah pencarian: " + langkah);
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Menyimpan array nilai terurut
        int[] nilaiMahasiswa = {60, 65, 70, 75, 80, 85, 90, 95};

        System.out.println("Data nilai mahasiswa:");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }

        // b. Mencari nilai tertentu
        System.out.print("\n\nMasukkan nilai yang ingin dicari: ");
        int cari = input.nextInt();

        int hasil = binarySearch(nilaiMahasiswa, cari);

        // c. Menampilkan hasil
        if (hasil != -1) {
            System.out.println("Status: Nilai ditemukan");
            System.out.println("Indeks ditemukan: " + hasil);
        } else {
            System.out.println("Status: Nilai tidak ditemukan");
            System.out.println("Indeks ditemukan: -1");
        }

        input.close();
    }
}