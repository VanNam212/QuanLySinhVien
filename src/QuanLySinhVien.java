import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        SinhVienController sinhVienController = new SinhVienController();
        int choose;
        do {
            System.out.println("Nhap lua chon: ");
            choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1: {
                    String nameSV;
                    int yearSV;
                    String addressSV;
                    float pointSV;
                    System.out.println("Nhap ten: ");
                    nameSV = new Scanner(System.in).nextLine();
                    System.out.println("Nhap nam sinh: ");
                    yearSV = new Scanner(System.in).nextInt();
                    System.out.println("Nhap dia chi: ");
                    addressSV = new Scanner(System.in).nextLine();
                    System.out.println("Nhap diem: ");
                    pointSV = new Scanner(System.in).nextFloat();
                    SinhVien sv = new SinhVien(nameSV, yearSV, addressSV, pointSV);
                    sinhVienController.add(sv);
                    break;
                }
                case 2: {
                    sinhVienController.findAll();
                    break;
                }
            }
        } while (choose != 0);
    }

    public static void menu() {
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi danh sach");
        System.out.println("0. Thoat");
    }
}
