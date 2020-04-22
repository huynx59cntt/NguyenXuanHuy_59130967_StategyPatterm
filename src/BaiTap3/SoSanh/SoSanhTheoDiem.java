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
public class SoSanhTheoDiem implements ISoSanh{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
          return  Float.compare(o1.getDiemTB(), o2.getDiemTB());
    }
    
}
