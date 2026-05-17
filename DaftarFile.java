import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        
        File direktori = new File("C:/Coding/Java/Praktikum10"); 
        
        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();
            
            System.out.println("Isi dari direktori " + direktori.getName() + ":");
            if (daftarFile != null) {
                for (File file : daftarFile) {
                    
                    if (file.isFile()) { 
                        System.out.println("- " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan sebuah direktori.");
        }
    }
}