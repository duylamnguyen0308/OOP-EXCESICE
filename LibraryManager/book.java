package LibraryManager;

public class book {
    private String tenSach;
    private String tacGia;
    private int soLuong;

    public book(String tenSach, String tacGia, int soLuong) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
