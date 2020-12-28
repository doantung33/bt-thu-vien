import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
    ArrayList<TheMuon>arrayList = new ArrayList<>();
    SinhVien sinhVien= new SinhVien();
    Scanner scanner = new Scanner(System.in);
    public void add(){
        TheMuon theMuon =new TheMuon();
        theMuon.setSinhVien(sinhVien.add());
        System.out.println("Nhap so phieu muon cua the");
        int soPhieu= Integer.parseInt(scanner.nextLine());
        theMuon.setSoPhieuMuon(soPhieu);
        System.out.println("Nhap ngay muon sach(dd)");
        String ngayMuon= scanner.nextLine();
        theMuon.setNgayMuon(ngayMuon);
        System.out.println("Nhap thang muon sach(MM)");
        String thangMuon= scanner.nextLine();
        theMuon.setThangMuon(thangMuon);
        System.out.println("Nhap nam muon sach(yyyy)");
        String namMuon= scanner.nextLine();
        theMuon.setNamMuon(namMuon);
        System.out.println("Nhap ngay tra sach(dd)");
        String ngayTra= scanner.nextLine();
        theMuon.setNgayTra(ngayTra);
        System.out.println("Nhap thang tra sach(MM)");
        String thangTra= scanner.nextLine();
        theMuon.setThangTra(thangTra);
        System.out.println("Nhap nam tra sach(yyyy)");
        String namTra= scanner.nextLine();
        theMuon.setNamTra(namTra);
        System.out.println("Nhap ten sach muon");
        String sach= scanner.nextLine();
        theMuon.setTenSach(sach);
        arrayList.add(theMuon);
    }
    public void show(){
        for (TheMuon a: arrayList) {
            if (a instanceof TheMuon){
                System.out.println(a.toString());
                System.out.println();
                System.out.println();
            }
        }
    }
    public void traSach(){
        String day="30";
        String  day1="31";
        System.out.println("Danh sach SV tra sach vao cuoi thang la");
        for (int i = 0; i < arrayList.size(); i++) {
            if (day.equals(arrayList.get(i).getNgayTra())||day1.equals(arrayList.get(i).getNgayTra())){
                System.out.println(arrayList.get(i));
                System.out.println();
            }

        }
    }
}
