/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2.GioHang;

import BaiTap2.HangHoa.HangHoa;
import BaiTap2.ThanhToan.IThanhToan;
import java.util.ArrayList;


/**
 *
 * @author asus
 */
public abstract class GioHang{
    IThanhToan hinhthucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<>();

    public void GioHang(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }
   
    public void them(HangHoa ds){
        dsHH.add(ds);
    }
    
   
    public double thanhToan(){
        int sum =0;
        for(int i = 0; i < dsHH.size(); i++){
            sum += dsHH.get(i).getGia();
            System.out.println(sum);
        }
        return hinhthucTT.thanhToan(sum);
    }
}
