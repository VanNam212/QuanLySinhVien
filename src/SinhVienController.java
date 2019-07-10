import java.util.Arrays;

public class SinhVienController {
    SinhVien[] sinhViens = new SinhVien[20];
    private int size = 0;

    public void add(SinhVien sv) {
        if (size == sinhViens.length) {
            int newSize = sinhViens.length * 2;
            sinhViens = Arrays.copyOf(sinhViens, newSize);
        }
        sinhViens[size++] = new SinhVien(sv.getNameSV(), sv.getYearSV(), sv.getAddressSV(), sv.getPointSV());
    }

    public void findAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(sinhViens[i]);
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Dia chi khong ton tai");
        } else {
            for (int i = index; i < size - 1; i++) {
                sinhViens[i].setNameSV(sinhViens[i + 1].getNameSV());
                sinhViens[i].setAddressSV(sinhViens[i + 1].getAddressSV());
                sinhViens[i].setYearSV(sinhViens[i + 1].getYearSV());
                sinhViens[i].setPointSV(sinhViens[i + 1].getPointSV());
            }
            size--;
            sinhViens = Arrays.copyOf(sinhViens, size);
            System.out.println("Complete");
        }
    }
}
