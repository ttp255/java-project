import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    private Map<String,String> Dulieu=new TreeMap<String, String>();
    public void ThemTu(String tuKhoa,String yNghia){
         this.Dulieu.put(tuKhoa, yNghia);

    }
    public void xoaTu(String tuKhoa){
        this.Dulieu.remove(tuKhoa);

    }
    public String TraTu(String tuKhoa){
        return this.Dulieu.get(tuKhoa);
    }
    public void InTuKhoa(){
        Set<String> TapHopTuDien=this.Dulieu.keySet();
        System.out.println(Arrays.toString(TapHopTuDien.toArray()));

        
    }
    public int laySoLuong(){
        return this.Dulieu.size();
    }
    public void XoaTatCa(){
        this.Dulieu.clear();
    }
    public static void main(String[] args) {
        TuDien tuDien=new TuDien();
        int luaChon=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("---------");
            System.out.println("Tra từ điển Anh - Việt:\n"
            + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
            + "2. Xóa từ\n"
            + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
            + "4. In ra danh sách từ khóa\n"
            + "5. Lấy số lượng từ\n"
            + "6. Xóa tất cả các từ khóa\n"
            + "0. Thoát khỏi chương trình\n");
            luaChon=sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
                String tuKhoa;
                String yNghia;
                System.out.println("nhap tu khoa: ");
                tuKhoa=sc.nextLine();
                System.out.println("nhap y nghia: ");
                yNghia=sc.nextLine();
                tuDien.ThemTu(tuKhoa, yNghia);
             
            }else if(luaChon==2||luaChon==3){
                System.out.println("nhap tu Khoa: ");
                String tuKhoa=sc.nextLine();
                if(luaChon==2){
                    tuDien.xoaTu(tuKhoa);
                }else{
                    System.out.println("Y nghia la: "+tuDien.TraTu(tuKhoa));
                }
            } else if(luaChon==4){
                tuDien.InTuKhoa();
            }  else if(luaChon==5){
                System.out.println("So luong tu: "+tuDien.laySoLuong());
            }else{
                tuDien.XoaTatCa();
            }
        }while(luaChon!=0);
    }
}
