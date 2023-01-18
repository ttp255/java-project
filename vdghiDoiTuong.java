import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * vdghiDoiTuong
 */
public class vdghiDoiTuong {
    public static void main(String[] args) {
        
        try {
            File f=new File("E:\\vd1\\object.ttp");
        
            OutputStream os;
            os = new FileOutputStream(f);
            ObjectOutputStream oos =new ObjectOutputStream(os);
            SinhVien1 sv= new SinhVien1("21110", "TTP", 20003, 6.5);
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        
    }
    
}