package bailuyentap;

import java.util.ArrayList;
import java.util.List;

import bailuyentap.model.BanhXe;
import bailuyentap.model.DongCo;
import bailuyentap.model.HoaDon;
import bailuyentap.model.Laptop;
import bailuyentap.model.LopHoc;
import bailuyentap.model.SanPham;
import bailuyentap.model.SinhVien;
import bailuyentap.model.XeHoi;

public class QuanLySanPham {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<XeHoi> cars = new ArrayList<XeHoi>();
		XeHoi car1 = new XeHoi(1, "Toyota", 2, 1000, new DongCo("Dong co xang", 140));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car1);
		XeHoi car2 = new XeHoi(1, "Vinfast", 2, 1500, new DongCo("Dong co dien", 140));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car2);
		XeHoi car3 = new XeHoi(1, "Lambo", 2, 1000, new DongCo("Dong co xang", 140));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car3);
		XeHoi car4 = new XeHoi(1, "Audi", 2, 2000, new DongCo("Dong co xang", 140));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car4);
		XeHoi car5 = new XeHoi(1, "Honda", 2, 1000, new DongCo("Dong co xang", 140));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car5);
		System.out.println("Danh sach xe hoi");
		for (XeHoi item : cars) {
			System.out.println(item);
		}
		// Tao list 7 laptop
		List<Laptop> lts = new ArrayList<Laptop>();
		lts.add(new Laptop(1, "Dell", 1, 15000000, 16, "i7"));
		lts.add(new Laptop(2, "MSI", 1, 17000000, 32, "i9"));
		lts.add(new Laptop(3, "Lenovo", 1, 15000000, 16, "i7"));
		lts.add(new Laptop(4, "Mac Air 3", 1, 15000000, 16, "i7"));
		lts.add(new Laptop(5, "HP", 1, 15000000, 16, "i7"));
		lts.add(new Laptop(6, "ROG", 1, 15000000, 16, "i7"));
		lts.add(new Laptop(7, "Asus", 1, 15000000, 16, "i7"));
		for (Laptop item : lts) {
			System.out.println(item);
		}
		// Tao 1 doi tuong kieu SV co 1 hoadon chua 5 sanpham gom laptop va XeHoi

		List<SanPham> listSanPham = new ArrayList<SanPham>();

		listSanPham.add(new Laptop(123, "Mac", 5, 1500, 365, "i7"));
		listSanPham.add(car5);
		listSanPham.add(new Laptop(234, "Win", 5, 1500, 365, "i7"));
		listSanPham.add(car4);
		listSanPham.add(new Laptop(357, "Dell", 5, 1500, 365, "i7"));

		HoaDon hoaDon = new HoaDon(123);
		hoaDon.setDssp(listSanPham);

		System.out.println(hoaDon);

		SinhVien sv = new SinhVien("Nguyen Van Son", new LopHoc("CNTT", null));
		sv.addHoaDon(hoaDon);

		System.out.println(sv);

	}

}