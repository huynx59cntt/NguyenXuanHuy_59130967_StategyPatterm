/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1.Context;

import Bai1.TinhToan.ITinh;

/**
 *
 * @author asus
 */
public abstract class Context {
    ITinh tinhToan;

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    
    public float tinh(float a, float b)
    {
        return tinhToan.tinh(a, b);
    }
}
