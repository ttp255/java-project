public class Sinhvien implements Comparable <Sinhvien>{
    private double maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTb;
   
    
    public Sinhvien(double maSinhVien, String hoVaTen, String tenLop, double diemTb) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTb = diemTb;
    }
    public double getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(double maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public double getDiemTb() {
        return diemTb;
    }
    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }
    public String getTen(){
        String s= this.hoVaTen.trim();
        if(s.indexOf(" ")>=0){
            int vt=s.lastIndexOf(" ")+1;
            return s.substring(vt);
        }else{
            return s;
        }
    
    }
    public int compareTo(Sinhvien o) {
    	// <0
    	// =0
    	// >0
    	// Dua tren so sanh ten
    	// Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen
    	String tenThis = this.getTen();
    	String tenO=o.getTen();
    	
    	return tenThis.compareTo(tenO);
    }
  
    
    @Override
    public String toString() {
        return "Sinhvien [diemTb=" + diemTb + ", hoVaTen=" + hoVaTen + ", maSinhVien=" + maSinhVien + ", tenLop="
                + tenLop + "]";
    }
}
