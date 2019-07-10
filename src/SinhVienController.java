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
}
