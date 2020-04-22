/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap2.GioHang.GioHang;
import BaiTap2.GioHang.TTCOD;
import BaiTap2.GioHang.TTOnline;
import BaiTap2.HangHoa.HangHoa;
import BaiTap2.ThanhToan.ThanhToanCOD;
import BaiTap2.ThanhToan.ThanhToanOnline;


/**
 *
 * @author asus
 */
public class Bai2Main {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa("Ổi", 10000, "Trái cây");
        HangHoa h2 = new HangHoa("Tủ Lạnh", 1540000, "Đồ điện");
        HangHoa h3 = new HangHoa("Vây cá mập", 1400000, "Hải sản");
        
        GioHang dsHangOnl = new TTOnline();
        dsHangOnl.them(h1);
        dsHangOnl.them(h2);
        dsHangOnl.them(h3);
        dsHangOnl.GioHang(new ThanhToanOnline());
        System.out.println("Vậy tổng giỏ hàng thanh toán bằng Online là: "+ dsHangOnl.thanhToan());
        
        GioHang dsHangCOD = new TTCOD();
        dsHangCOD.them(h1);
        dsHangCOD.them(h2);
        dsHangCOD.them(h3);
        dsHangCOD.GioHang(new ThanhToanCOD());
        System.out.println("Vậy tổng giỏ hàng thanh toán bằng COD là: "+ dsHangCOD.thanhToan());
    
    }
}
