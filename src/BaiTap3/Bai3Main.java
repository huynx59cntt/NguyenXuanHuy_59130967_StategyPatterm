/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import BaiTap3.QLSV.QLSVTheoTen;
import BaiTap3.QLSV.QLSV;
import BaiTap3.QLSV.QLSVTheoDiem;
import BaiTap3.SinhVien.SinhVien;
import BaiTap3.SoSanh.SoSanhTheoDiem;
import BaiTap3.SoSanh.SoSanhTheoTen;
import java.text.ParseException;
import java.text.SimpleDateFormat;




/**
 *
 * @author asus
 */
public class Bai3Main {
    public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    SinhVien sv1 = new SinhVien("Nguyễn Xuân Huy",sdf.parse("1999/12/02"), 8) ;
    SinhVien sv2 = new SinhVien("Trần Thị Kim Ngân",sdf.parse("1999/17/12"), 9) ;
    SinhVien sv3 = new SinhVien("Lê Văn Tèo", sdf.parse("1999/3/12"), 6) ;
        
     QLSV dsTheoTen = new QLSVTheoTen();
     dsTheoTen.them(sv1);
     dsTheoTen.them(sv2);
     dsTheoTen.them(sv3);
     System.out.println("Danh sách theo tên mới thêm vào: ");
     dsTheoTen.inDS();
     System.out.println("\n\nDanh sách tên sau khi sắp xếp: ");
     dsTheoTen.QLSV(new SoSanhTheoTen());
     dsTheoTen.sapXep();
     dsTheoTen.inDS();
     
     //quẩn lý danh sách sinh viên theo điểm
     QLSV dsTheoDiem = new QLSVTheoDiem();
     dsTheoDiem.them(sv1);
     dsTheoDiem.them(sv2);
     dsTheoDiem.them(sv3);
     System.out.println("\n\nDanh sách theo Điểm mới thêm vào: ");
     dsTheoDiem.inDS();
     System.out.println("\n\nDanh sách Điếm sau khi sắp xếp: ");
     dsTheoDiem.QLSV(new SoSanhTheoDiem());
     dsTheoDiem.sapXep();
     dsTheoTen.inDS();   
    }
}
