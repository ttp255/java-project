import java.util.ArrayDeque;
import java.util.Deque;

public class vdDeque {
    public static void main(String[] args) {
        Deque<String>danhsachsv =new ArrayDeque<>();
        danhsachsv.offer("TTp");
        danhsachsv.offer("TTP");
        danhsachsv.offerLast("PPT");
        danhsachsv.offerFirst("TTTP");
        while(true){
            
            String ten = danhsachsv.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);

            }
        }
    }

