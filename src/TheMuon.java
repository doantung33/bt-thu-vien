public class TheMuon {
    private int soPhieuMuon;
    private String ngayMuon;
    private String thangMuon;
    private String namMuon;
    private String ngayTra;
    private String thangTra;
    private String namTra;
    private String tenSach;
    private SinhVien sinhVien;

    public TheMuon() {
    }

    public TheMuon(int soPhieuMuon, String ngayMuon, String thangMuon, String namMuon, String ngayTra, String thangTra, String namTra, String tenSach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.thangMuon = thangMuon;
        this.namMuon = namMuon;
        this.ngayTra = ngayTra;
        this.thangTra = thangTra;
        this.namTra = namTra;
        this.tenSach = tenSach;
        this.sinhVien = sinhVien;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getThangMuon() {
        return thangMuon;
    }

    public void setThangMuon(String thangMuon) {
        this.thangMuon = thangMuon;
    }

    public String getNamMuon() {
        return namMuon;
    }

    public void setNamMuon(String namMuon) {
        this.namMuon = namMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getThangTra() {
        return thangTra;
    }

    public void setThangTra(String thangTra) {
        this.thangTra = thangTra;
    }

    public String getNamTra() {
        return namTra;
    }

    public void setNamTra(String namTra) {
        this.namTra = namTra;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return   sinhVien +
                "\nTheMuon [" +
                " soPhieuMuon= " + soPhieuMuon +
                ", ngayMuon= " + ngayMuon +"/"+thangMuon+"/"+namMuon+
                ", ngayTra= " + ngayTra +"/"+thangTra+"/"+namTra+
                ", tenSach= " + tenSach +
                ']';
    }
}
