package Bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Bai10.model3.HinhHoc;
import Bai10.model3.HinhTron;
import Bai10.model3.HinhVuong;

public class SoSanhDienTichVer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HinhHoc> dshh = new ArrayList<HinhHoc>();
		dshh.add(new HinhVuong(13));
		dshh.add(new HinhTron(22.5));
		dshh.add(new HinhVuong(1.5));
		dshh.add(new HinhTron(0.75));
		dshh.add(new HinhVuong(8));
		dshh.add(new HinhTron(12));
		System.out.println("Sap xep theo dien tich");
		Collections.sort(dshh, new Comparator<HinhHoc>() {

			@Override
			public int compare(HinhHoc o1, HinhHoc o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
			}

		});
		for (HinhHoc item : dshh) {
			System.out.println(item);
		}
	}

}
