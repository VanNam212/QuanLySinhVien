import java.util.Scanner;

public class SinhVien {
    private String nameSV;
    private int yearSV;
    private String addressSV;
    private float pointSV;

    public SinhVien() {
    }

    public SinhVien(String nameSV, int yearSV, String addressSV, float pointSV) {
        this.nameSV = nameSV;
        this.yearSV = yearSV;
        this.addressSV = addressSV;
        this.pointSV = pointSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public int getYearSV() {
        return yearSV;
    }

    public void setYearSV(int yearSV) {
        this.yearSV = yearSV;
    }

    public String getAddressSV() {
        return addressSV;
    }

    public void setAddressSV(String addressSV) {
        this.addressSV = addressSV;
    }

    public float getPointSV() {
        return pointSV;
    }

    public void setPointSV(float pointSV) {
        this.pointSV = pointSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "nameSV='" + nameSV + '\'' +
                ", yearSV=" + yearSV +
                ", addressSV='" + addressSV + '\'' +
                ", pointSV=" + pointSV +
                '}';
    }
}
