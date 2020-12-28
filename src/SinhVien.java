import java.util.Scanner;

public class SinhVien {
    private String ten;
    private String ngaySinh;
    private int maSV;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String ten, String ngaySinh, int maSV, String lop) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.maSV = maSV;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public SinhVien add(){
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien= new SinhVien();
        System.out.println("Nhap ten sinh vien");
        String ten = scanner.nextLine();
        sinhVien.setTen(ten);
        System.out.println("Nhap ngay sinh sinh vien (dd/MM/yyyy)");
        String ngaySinh = scanner.nextLine();
        sinhVien.setNgaySinh(ngaySinh);
        System.out.println("Nhap ma sinh vien");
        int ma = Integer.parseInt(scanner.nextLine());
        sinhVien.setMaSV(ma);
        System.out.println("Nhap lop cua sinh vien");
        String  lop =(scanner.nextLine());
        sinhVien.setLop(lop);
        return sinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien [" +
                " ten= " + ten +
                ", ngay sinh= " + ngaySinh +
                ", ma SV= " + maSV +
                ", lop= " + lop +" ]";
    }
}
