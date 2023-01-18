import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.AllPermission;
import java.util.List;

public class Vddoc {
    public static void main(String[] args) {
       /*  File f1=new File("E:\\VD\\TTP.txt");
        try {
            BufferedReader br =Files.newBufferedReader(f1.toPath(), StandardCharsets.UTF_8);
            String line =null;
            while(true){
               line= br.readLine();
               if(line==null){
                    break;

               }else{
                    System.out.println(line);
               }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }/* */


        File f2=new File("E:\\VD\\TTP.txt");
        try {
            BufferedReader br=Files.newBufferedReader(f2.toPath(), StandardCharsets.UTF_8);
            List<String> allTest =Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for (String line :allTest) {
                System.out.println(line);
                
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
