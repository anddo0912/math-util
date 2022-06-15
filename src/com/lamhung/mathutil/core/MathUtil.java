/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamhung.mathutil.core;

/**
 *
 * @author LamHung
 */
public class MathUtil {
    
    
    //trong claas này cung cap cho ai do nhieu hàm xử lí toán hc 
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó,ko cần lưu lại trạng thái /giá trị 
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa
    //n!= .2.3.4.5....n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng , tăng nhanh về giá trị
    //21 giai thừa tràn kiểu long 
    //bài này quy ước tính n! trong khoảng từ 0 đến 20
//    public static long getFactorial(int n){
//        if ( n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        
//        if (n == 1 || n == 0)
//            return 1;//ket thuc cuoc choi som neu biet 
//        
//        long product = 1;
//        
//        for (int i = 2; i <= n; i++)
//            product *= i;
//        
//        return product;
//    }
    
    //Học đệ quy trong 30s -RECURSION
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Ví dụ: con búp bê Nga, giống nhau và lồng trong nhau 
    //búp bê to , nhỏ hơn, nhỏ hơn nữa, nhỏ hơn nữa, ... đến điểm dừng
    
    //tính giùm tui 6!
    //n! = 1.2.3.4.5.6.....n
    //6! = 6* 5!
    //5! = 5 x 4!
    //.....
    //chốt hạ: n! = n x (n - 1)!
    
     public static long getFactorial(int n){
        if ( n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20. Plz");
        
        if ( n == 1 || n == 0)
            return 1;
        
        return n * getFactorial(n - 1); //công thức đệ quy 
    }
    
}
