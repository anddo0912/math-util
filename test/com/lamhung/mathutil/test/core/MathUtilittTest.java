/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamhung.mathutil.test.core;

import com.lamhung.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LamHung
 */
public class MathUtilittTest {
    
    //đây là class sẽ sử dụng các hàm của thư viện JUNit hay là Framework
    //kiểm tra code chinsg - hàm tishGiaiThua() bên 
    //class.core.MathUtil 
    //viết code để test code chính bên kia!!!!
    
    
    //có quy tắc đặt tên hàm kiểm thử 
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công , trả về ngon 
    //ta sẽ xài hàm kiểu wekk - đưa 5! - 6!, hok chơi -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy cái hàm này 
    //@Test phía hậu trường chính là public static void main()
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 1; //test thử tình huống tử tế đầu vào, mày phải chạy đúng 
        long expected = 1; //hy vọng 0 giai thừa = 1
        
        long actual; //gọi hàm cần test core/app chính /code chính
        actual = MathUtil.getFactorial(n);
        
        //so sánh ex với ac dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        //hàm giúp so sánh 2 giá trị nào đó có giống nhau ko 
        //nếu giống nhau -> thảy màu xanh đèn đường đường thông, code ngon 
           //ít nhất cho case đang test
           //-> thảy màu đỏ đèn đường 
           //nếu KO GIỐNG NHAU -> thày mày đỏ đèn đường 
           //                       hàm ý expected và actual ko giống nhau
           //
        //gộp thêm vài case thành công /đưa đầu vào ngon !! hàm phải tính ngon 
        Assert.assertEquals(2, MathUtil.getFactorial(2));//tui muốn 2! = 2
        Assert.assertEquals(6, MathUtil.getFactorial(3));//tui muốn 3! = 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));//tui muốn 4! = 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));//tui muốn 5! = 120
        Assert.assertEquals(720, MathUtil.getFactorial(6));//tui muốn 6! = 720
    }
    
    //nếu đưa vào cà chớn âm , > 20; Thiết kế của hàm là ném ra ngoại lệ 
    //Tao kì vọng ngoại lệ xuất hiện khi n < 0 , n > 20
    //rất mong ngoại lệ xuất hiên với n cà chớn này
    
    //nếu hàm làm những việc ngoại lệ mà mình đã kì vọng 
    //-> HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ  -> XANH PHẢI XUẤT HIỆN 
    
    //nếu hàm éo ném ra ngoại lệ 
    //sure, Hàm chạy sai thiết kế, sai kì vọng, màu đỏ
    
    
    //Test case:
    //input: -5
    //expected: Illegal xuất hiện 
    //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu 
    //là những thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thẻ do lường = cách chúng có xuất hiện hay k     
    
    
    //MÀU ĐỎ ĐÓ EM 
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm @test chạy, hay hàm getF() chạy 
//                                    // sẽ ném về ngoiaj lệ NumberFormat
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @test chạy, hay hàm getF() chạy 
                                    // sẽ ném về ngoiaj lệ NumberFormat
    }
    
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xang khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Assert.assertThrow
        //MathUtil.getFactorial(-5); 
    }
    
    
    //Băt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        
        
        //chủ động kiểm soat ngoại lệ 
        try {
            MathUtil.getFactorial(21); 
        } catch (Exception e) {
            //bắt try -Cacth là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mình cần cso xuất hiện hay ko???
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invalid argument. N must be between 0..20", 
                    e.getMessage());
        }
    }
    
    
    
}
