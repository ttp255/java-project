import java.util.LinkedList;
import java.util.Queue;

public class vdQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV=new LinkedList<>();
        danhSachSV.offer("TTP 1");
        danhSachSV.offer("TTP 3");
        danhSachSV.offer("PHam Tan Tai");
        danhSachSV.offer("pham tna tai");

        while(true){
            String ten= danhSachSV.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
            
        }
    }

