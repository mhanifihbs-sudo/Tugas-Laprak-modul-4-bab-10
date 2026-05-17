import java.io.File;

public class CekUkuranFile {
    public static void main(String[] args) {
        File file = new File("test.txt"); // Sesuaikan nama file
        
        if (file.exists()) {
            long ukuranBytes = file.length();
            double ukuranKB = (double) ukuranBytes / 1024;
            double ukuranMB = ukuranKB / 1024;
            
            if (ukuranMB >= 1.0) {
                System.out.printf("Ukuran file: %.2f MB\n", ukuranMB);
            } else {
                System.out.printf("Ukuran file: %.2f KB\n", ukuranKB);
            }
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}