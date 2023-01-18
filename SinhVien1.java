import java.io.Serializable;

public class SinhVien1 implements Comparable<SinhVien1> ,Serializable{
    private String maSinhVien;
    private String hoTen;
    private int nam;
    private double diemTrungBinh;
   
    public SinhVien1(String maSinhVien) {
        this.maSinhVien=maSinhVien;
    }
    public SinhVien1(String maSinhVien, String hoTen, int nam, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.nam = nam;
        this.diemTrungBinh = diemTrungBinh;
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    @Override
    public String toString() {
        return "SinhVien1 [diemTrungBinh=" + diemTrungBinh + ", hoTen=" + hoTen + ", maSinhVien=" + maSinhVien
                + ", nam=" + nam + "]";
    }
    @Override
    public int compareTo(SinhVien1 o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(diemTrungBinh);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((hoTen == null) ? 0 : hoTen.hashCode());
        result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
        result = prime * result + nam;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien1 other = (SinhVien1) obj;
        if (Double.doubleToLongBits(diemTrungBinh) != Double.doubleToLongBits(other.diemTrungBinh))
            return false;
        if (hoTen == null) {
            if (other.hoTen != null)
                return false;
        } else if (!hoTen.equals(other.hoTen))
            return false;
        if (maSinhVien == null) {
            if (other.maSinhVien != null)
                return false;
        } else if (!maSinhVien.equals(other.maSinhVien))
            return false;
        if (nam != other.nam)
            return false;
        return true;
    }

    
    
    
}
