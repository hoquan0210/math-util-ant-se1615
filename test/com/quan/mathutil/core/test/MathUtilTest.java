/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.quan.mathutil.core.test;

import com.quan.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 846ab
 */
public class MathUtilTest {

    //@Test là 1 annotation để báo với JVM biết rằng hàm này là hàm main() và
    //chạy code trong hàm này.
    //Nếu thiếu @Test trước hàm, thì JUnit không vận hành!!!
    @Test
    //TEST CASE 1: n = 0, expected = 1
    //TEST CASE 2: n = 1, expected = 1
    //TEST CASE 3: n = 2, expected = 2
    //TEST CASE 4: n = 3, expected = 6
    public void testFactorialGivenRightArgumentReturnsWell() {
        long expected = 1;
        long atual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, atual);

        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
    }

    @Test
    //Test case 5: n = 4, expected = 24
    //Test case 6: n = 5, expected = 120
    public void testFactorialGivenRightArgumentReturnsWell2() {
        long expected = 1;
        long atual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, atual);

        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    //bắt Exception thì sao???
    @Test(expected = IllegalArgumentException.class) //không nên dùng Exception
    //bắt lớp Con thay vì lớp Cha
    //Test case 7: n = -5, expected = hi vọng thấy ngoại lệ ném ra
    //nếu -5 đưa vào hàm thì phải thấy ngoại lệ xuất hiệnn
    //nếu ngoại lệ xuất hiện khi tính -5!, NGHĨA LÀ HÀM CHẠY ĐÚNG, NHƯ THIẾT KẾ
    //muốn đo có ngoại lệ xuất hiện hay không khi nhập -5
    //DO NGOẠI LỆ KHÔNG PHẢI LÀ VALUE KIỂU LONG ĐỂ SO SÁNH
    //CÁCH VIẾT KHÁC: KHI CHẠY -5!, expected = IllegalArgumentException.class
    //nghĩa là có sự xuất hiện của 1 object thuộc class IllegalArgumentException
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }

//    @Test
//    public void testGreen() {
//        Assert.assertEquals(10, 10);
//    }
//
//    @Test
//    public void testRed() {
//        Assert.assertEquals(10, 100);
//    }
}
