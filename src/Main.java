import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ListBook listBook = new ListBook();
        boolean check= false;
        int n;
        do {
            try {
                System.out.println("---Menu---");
                System.out.println("1. Them thong tin SV muon sach");
                System.out.println("2. Danh sach SV da muon sach");
                System.out.println("3. Danh sach SV tra sach vào cuoi thang");
                System.out.println("0. Thoat");
                n=Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Moi chon");
                continue;
            }
            switch (n){
                case 1:
                    listBook.add();
                    break;
                case 2:
                    listBook.show();
                    break;
                case 3:
                    listBook.traSach();
                    break;
                case 0:
                    check=true;
                    break;
            }
        }while (!check);
    }
}
