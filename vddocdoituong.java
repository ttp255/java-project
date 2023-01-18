import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;
import java.io.ObjectInputStream;

public class vddocdoituong {
    public static void main(String[] args) {
        File f=new File("E:\\vd1\\object.ttp");
        InputStream is;
        try {
            is = new FileInputStream(f);
            ObjectInputStream ois =new ObjectInputStream(is);
         
            SinhVien1 sv=(SinhVien1) ois.readObject();
            System.out.println(sv);
            ois.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

    }
}
