package bai08;

import bai08.vidu2.SanPham;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham(12, "Xiaomi");
		System.out.println(sp1);
		// Thuc hien phep gan
		SanPham sp2;
		try {
			sp2 = (SanPham) sp1.clone();
			sp2.setTenSanPham("Nokia");
			sp2.setMaSanPham(18);
			// Xuat gia tri
			System.out.println(sp1);
			System.out.println(sp2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}