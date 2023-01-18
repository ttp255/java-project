import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * DanhSachSinhVien
 */
public class DanhSachSinhVien{
    private ArrayList<SinhVien1> danhSach;

    public DanhSachSinhVien() {
        this.danhSach=new ArrayList<SinhVien1>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien1> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien1 sv){
        this.danhSach.add(sv);
    }
    public void InDanhSachSinhVien(){
        for (SinhVien1 sinhvien : danhSach) {
                System.out.println(sinhvien);
        }
    }
    public boolean KiemTraDanhSachRong(){
       return  this.danhSach.isEmpty();
    }
    public int LayRaSoLuong(){
        return this.danhSach.size();

    }
    public void lamRong(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTai(SinhVien1 sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaSinhVien(SinhVien1 sv){
        return this.danhSach.remove(sv);
    }
    public void timSinhVien(String ten){
        for (SinhVien1 sinhvien : danhSach) {
            if(sinhvien.getHoTen().indexOf(ten)>=0){
                System.out.println(sinhvien);
            }
        }            
     }
     public void sapXepTangDan(){
        Collections.sort(this.danhSach,new Comparator<SinhVien1>() {

            @Override
            public int compare(SinhVien1 sv1, SinhVien1 sv2) {
                // TODO Auto-generated method stub
                if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return 1;
                }else if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return -1;

                }else{
                    return 0;
                }
            }   
            
        });
     }
    public void ghiDoiTuong(File f){
       
        try {
            File file=new File("E:\\vd1\\luu.ttp");
        
            OutputStream os;
            os = new FileOutputStream(file);
            ObjectOutputStream oos =new ObjectOutputStream(os);
           for (SinhVien1 sv : danhSach) {
                oos.writeObject(sv);
            
           }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void DocSinhVien(File f) {
        File file =new File("E:\\vd1\\luu.ttp");
        InputStream is;
        try {
            is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien1 sv=null;
            while(true){
                Object oj =ois.readObject();
                if(oj==null){
                    break;

                }
                if(oj!=null){
                    sv=(SinhVien1) oj;
                    this.themSinhVien(sv);
                }
            }
            ois.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

  
        
     
 }
    

