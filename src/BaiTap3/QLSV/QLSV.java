/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.QLSV;

import BaiTap3.SinhVien.SinhVien;
import BaiTap3.SoSanh.ISoSanh;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author asus
 */
public abstract class QLSV {
    ISoSanh sv;
    ArrayList<SinhVien> ds = new ArrayList<>();

    public void QLSV(ISoSanh sv) {
        this.sv = sv;
    }
    
    
    public void them(SinhVien sv){
        ds.add(sv);
    }
    public void sapXep(){
        for(int i =0; i<ds.size()-1;i++)
            for(int j = i+1; j < ds.size(); j++)
            {
                if(sv.soSanh(ds.get(i), ds.get(j)) > 0){
                    Collections.swap(ds, i, j);
                }
            }     
    }
    public void inDS(){
        for(int i =0; i<ds.size(); i++){
            System.out.println( ds.get(i).hienThi());
        }
    }
}
