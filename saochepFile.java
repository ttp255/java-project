import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class saochepFile {
    public static void main(String[] args) {
        File f1=new File("E:\\abcd.doc");
       
        File f2 =new File("E:\\abc.doc");
        File f3 =new File("E:\\TTP.doc");
        f3.renameTo(f1);
       
     
        


    }
}
