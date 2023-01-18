import java.util.PriorityQueue;
import java.util.Queue;

public class vdQueue2 {
    public static void main(String[] args) {
        Queue<String> danhSachsv =new PriorityQueue<>();
        danhSachsv.offer("PPTT 3");
        danhSachsv.offer("PPTT 2");
        danhSachsv.offer("ttp");
        danhSachsv.offer("TTp");
        while(true){
            String ten=danhSachsv.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
    }
}
