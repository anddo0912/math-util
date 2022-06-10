/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamhung.mathutil.main;

import com.lamhung.mathutil.core.MathUtil;

/**
 *
 * @author LamHung
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tinhs7 giai thừa coi chạy đúng như thiết kế hay ko 
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tês
        //ví dụ: -5 coi tính đc hok
        //        0 coi tính mấy
        //20 coi tính mấy!!!
        //TEst case một tình huống hàm app/màn hình 
        
        long expected = 120; //tao kì vọng ói về 120 nếu tính 5!
        int n = 5;
        long actual = MathUtil.getFactorial(5);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual+  " actual");
        
    }
}
