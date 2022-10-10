/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.quan.mathutil.core;

/**
 *
 * @author 846ab
 */
public class MathUtil {

    //hàm tính n! = 1.2.3...n
    //0! = 1! = 1
    //vì giai thừa tăng cực nhanh, 21! tràn kiểu long (18 số 0)
    //không có giai thừa âm
    //quy ước: n nhận vào từ 0..20!
    //viết tính giai thừa theo đệ quy
    //n! = 1.2.3.4...n
    //c1: viết kiểu for, con heo đất, nhồi dần kết quả vào 1 biến
    //product = product * i; //i chạy từ 1..n
    //c2: đệ quy - recursion
    //Gọi lại chính mình với 1 quy mô/giá trị khác
    //5! = 1.2.3.4.5
    //5! = 5.4!
    //4! = 4.3!
    //.....
    //1! = 1
    //=> n! = n x (n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20 ");
        }

        if (n == 0 || n == 1) {
            return 1; // tình huống đặc biệt
        }
        //sống sót đến đây n = 2...20
        //hàm này đang tính n! mà n! = n* (n-1)!
        return n * getFactorial(n - 1);
    }
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. n must be between 0..20 ");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1; // tình huống đặc biệt
//        }
//        long product = 1; //tích khởi đầu là 1, biến tích luỹ acc
//        for (int i = 2; i <= n; i++) {
//            product *= i; //product = product * i;
//        }
//        return product;
//    }

    //tư duy viết code theo kiểu gọi là TDD - Test Driven Development 
    //                                       (1 skill viết code - có thể thêm vào CV)
    //Test First Development: khi viết code thì song song đó phải viết các tình huống
    //kiểm thử code/hàm/class
    //tư duy viết code kèm kiểm thử:
    //hàm của ta getFactorial(n đưa vào) -> trả về n! trong giới hạn long
    //ta suy nghĩ luôn tình huống kiểm thử -> TEST CASE
    //TEST CASE: 1 TÌNH HUỐNG TA XÀI APP, TỨC LÀ TA ĐƯA DATA ĐẦU VÀO VÀ CHỜ APP TRẢ RA KQUA
    //                                    VÀ SO SÁNH APP TRẢ CÓ ĐÚNG KÌ VỌNG??
    //TDD là kĩ thuật vừa viết code vừa suy nghĩ luôn các TEST CASE kiểm thử code
    //CASE 1: n = 0, Expected == getFactorial(0) == 1
    //CASE 2: n = 1, Expected == getFactorial(1) == 1
    //CASE 3: n = 2, Expected == getFactorial(2) == 2
    //CASE 4: n = 3, Expected == getFactorial(3) == 6
    //CASE 5: n = 4, Expected == getFactorial(4) == 24
    //CASE ...: n = 21, Expected == getFactorial(21) == Ngoại lệ vì n! quá lớn
    //                                                  không lưu được trong long ĐC
    //CASE ...: n < 0, Expected == getFactorial(-5) == Ngoại lệ vì không tính
    //                                                 giai thừa âm!!!
}
