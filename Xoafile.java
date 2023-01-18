import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Xoafile {
    public static void xoaFile(File fx){
        if(fx.isDirectory()){
            System.out.println("Da xoa: "+fx.getAbsolutePath());
            fx.delete();
        }else if(fx.isDirectory()){
            File[] mangCon=fx.listFiles();
            for (File f : mangCon) {
                xoaFile(f);
            
          
            }
            System.out.println("Da xoa: "+fx.getAbsolutePath());
            fx.delete();




        }
    }
    public static void main(String[] args) {
        File f0 =new File("E:\\Vdtaptin\\directory_1\\directory_2\\directory_3\\directory_4");
        File f1 =new File("E:\\VD");
        
       xoaFile(f0);
       xoaFile(f1);


    }
}
