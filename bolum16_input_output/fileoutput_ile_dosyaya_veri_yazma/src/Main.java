import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        //File file = new File("dosya.txt");

        try {
            fos = new FileOutputStream("dosya.txt",true);//(dosya.txt,true) yazarsak onceden olanlari silmez yanina eklee

            fos.write(65);

            //byte [] array = {101,75,66,68};//array olarak da yazdirabiliriz
            //fos.write(array);

            /*String s = "Abdullah Bilgi";//Stringleri yazarken byte a donusturmek gerekiyor
            byte [] s_array = s.getBytes();
            fos.write(s_array);*/


        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception olustu...");
        } catch (IOException e) {
            System.out.println("Dosyaya yazilirken bir hata olustu...");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
        }

    }




}
