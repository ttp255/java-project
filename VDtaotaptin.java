import java.io.File;
import java.io.IOException;

public class VDtaotaptin {
    public static void main(String[] args) throws IOException {
        File folder1 =new File("E:\\Vdtaptin");
        System.out.println("Kiem tra foder1 co ton tai k: "+folder1.exists());
        File folder2 =new File("E:\\vdtaptin2");
        System.out.println("Kiem tra foder1 co ton tai k: "+folder2.exists());
        File d1=new File("E:\\Vdtaptin\\directory_1");
        d1.mkdir();
        File d2=new File("E:\\Vdtaptin\\directory_1\\directory_2\\directory_3\\directory_4");
        d2.mkdirs();

        File d3=new File("E:\\Vdtaptin\\directory_1\\vd.txt");
        d3.createNewFile();
    }
}
