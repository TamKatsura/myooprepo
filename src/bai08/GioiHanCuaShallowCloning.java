package bai08;

import java.util.ArrayList;

import bai08.vidu3.HoaDon;
import bai08.vidu3.SanPham;

public class GioiHanCuaShallowCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dssp = new ArrayList<SanPham>();
		dssp.add(new SanPham(1, "Nokia"));
		dssp.add(new SanPham(2, "SamSung"));
		HoaDon hd1 = new HoaDon(1, dssp);
		System.out.println(hd1);
		// Thuc hien shallow cloning
		HoaDon hd2;
		try {
			hd2 = (HoaDon) hd1.clone();
			hd2.setMaHoaDon(15);
			hd2.getDssp().getFirst().setTenSanPham("Iphone");
			System.out.println(hd1);
			System.out.println(hd2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}