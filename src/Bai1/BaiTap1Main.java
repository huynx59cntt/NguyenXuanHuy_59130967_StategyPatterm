/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import Bai1.Context.Context;
import Bai1.Context.TinhCong;
import Bai1.Context.TinhTru;
import Bai1.TinhToan.Cong;
import Bai1.TinhToan.Tru;


/**
 *
 * @author asus
 */
public class BaiTap1Main {
    public static void main(String[] args) {
        Context cong = new TinhCong();
        cong.setTinhToan(new Cong());
        System.out.println("Tổng là: " + cong.tinh(75, 12));
        
        Context tru = new TinhTru();
        tru.setTinhToan(new Tru());
        System.out.println("Trừ là" + tru.tinh(54, 78));
           
    }
}
