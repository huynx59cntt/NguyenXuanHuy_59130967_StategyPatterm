/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1.TinhToan;

/**
 *
 * @author asus
 */
public class Chia implements ITinh{

    @Override
    public float tinh(float a, float b) {
        if(b==0)
            System.out.println("Lỗi chia cho 0");
        else
            return a/b;
        return 0;
    }
}
