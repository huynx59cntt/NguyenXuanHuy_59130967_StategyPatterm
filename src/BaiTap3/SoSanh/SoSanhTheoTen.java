/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.SoSanh;

import BaiTap3.SinhVien.SinhVien;

/**
 *
 * @author asus
 */
public class SoSanhTheoTen implements ISoSanh{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());    
    }
}