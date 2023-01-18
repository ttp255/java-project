import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VDghi {
    public static void main(String[] args) {
       
            PrintWriter pw;
            try {
                pw = new PrintWriter("E:\\VD\\TTP.txt", "UTF-8");
                pw.println("xin chao");
                pw.print(3.14);
                pw.print(' ');
                pw.println("la so Pi");
                Student st=new Student(21110388, "TTP");
                pw.print(st);
                pw.flush();
                pw.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
          
           
       
    }
}