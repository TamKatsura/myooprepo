package Bai05;

public class QuanLyNhanVat {
	public static void main(String[] args) {

		KiemKhach kiemKhach = new KiemKhach("001", "An", "Nam", 1200, 1500, "");
		BoBinh boBinh = new BoBinh("002", "Hùng", "Nam", 2500, 1300, "Giáp vàng");
		PhuThuy phuThuy = new PhuThuy("003", "Liên", "Nữ", 3500, "Bùa yêu", 2500);
		KyBinh kyBinh = new KyBinh("004", "Lan", "Nữ", 1500, "Ngựa thần", 90);
		System.out.println(kiemKhach);
		kiemKhach.hanhDong();
		System.out.println(boBinh);
		boBinh.hanhDong();
		System.out.println(phuThuy);
		phuThuy.hanhDong();
		System.out.println(kyBinh);
		kyBinh.hanhDong();
	}
}