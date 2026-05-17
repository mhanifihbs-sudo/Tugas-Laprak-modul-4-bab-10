import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File direktori = new File("C:/ContohFolder"); 
        
        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();
            
            // 1. Hapus semua file di dalamnya terlebih dahulu
            if (daftarFile != null) {
                for (File file : daftarFile) {
                    file.delete(); 
                }
            }
            
          
            if (direktori.delete()) {
                System.out.println("Direktori beserta isinya berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}