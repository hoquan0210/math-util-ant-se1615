/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.quan.mathutil.core.test;

import static com.quan.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import static ... tên-class.tên-hàm; thì sau này
//khi gọi hàm static bỏ luôn tên class chấm, hiểu ngầm tên class
//code gọi ra như hàm của C
//.* là đại diện cho tất cả các hàm static trong class vừa import
//nếu rảnh thì chấm từ tên hàm static (không có dấu ngoặc)

/**
 *
 * @author 846ab
 */
//KĨ THUẬT DDT - DATA DRIVEN TESTING
//TRÁNH NHẦM LẪN VỚI TDD
//DDT: KĨ THUẬT TỔ CHỨC CÁC TEST CASES CHO GỌN GÀNG
//TÁCH CÁC CÂU LỆNH KIỂM THỬ VÀO BỘ DATA DÙNG ĐỂ TEST RIÊNG RA 2 NƠI
//PHIÊN BẢN TEST JUNIT Ở TRÊN ĐANG TRỘN DATA TEST VÀ GỌI HÀM
//LẪN LỘN VỚI NHAU, KHÔNG SAI, NHƯNG NHÌN KHÔNG RÕ RÀNG
//Nếu ta muốn check hàm getF() với các giá trị đầu vào và có trả về đầu ra mong
//đợi hay không, kiểu như:
//0 -> 1
//1 -> 1
//2 -> 2
//3 -> 6
//4 -> 24
//5 -> 120
//6 -> 720
//...
//có chỗ nào định nghĩa riêng data, thì ta sẽ dễ dàng cảm nhận các case đã đủ
//hay chưa, đã đại diện đủ hay chưa!!!
//lát hồi ta nhồi data vào hàm assertEquals(?getF(?)), cảm giác viết code để
//test hàm nhìn rõ ràng hơn
//kĩ thuật đẩy data test ra 1 chỗ khác, rồi nhồi ngược lại vào hàm, kĩ thuật
//này được gọi là DDT - viết test case theo kiểu hướng về tách data, còn gọi là
//PARAMETERIZED TESTING
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //chuẩn vị data để nhồi vào hàm test
    //quy ước hàm chuẩn bị data phải là static - nằm ở 1 chỗ cố định trong ram
    //để object nào cũng thấy được!!!
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    @Parameterized.Parameter(value = 0) //map biến này vào cột 0
    public int n;
    @Parameterized.Parameter(value = 1) //map biến này vào cột 1
    public long expected;

    //2 biến này sẽ map vào 2 cột tương ứng
    //của hàm initData
    //sau đó ta nhồi 2 biết này vào trong hàm
    //assertEquals() như cũ
    @Test //xài data từ 2 biến trên và chạy compare
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }
}

//KẾT LUẬN CHUNG CHO XANH ĐỎ:
//XANH: KHI TẤT CẢ CÁC CASE, TÌNH HUỐNG ĐỀU PHẢI XANH - EXPECTED == ACTUAL
//ĐỎ: CHỈ CẦN 1 THẰNG ĐỎ, TẤT CẢ LÀ ĐỎ!!!
//XANH: MỆNH ĐỀ AND, XANH KHI TẤT CẢ CÙNG XANH
//ĐỎ: MỆNH ĐỀ OR, CHỈ CÓ 1 THẰNG ĐỎ, CẢ ĐÁM ĐỎ
//LÍ DO: HÀM ĐƯỢC GỌI LÀ ĐÚNG, THÌ PHẢI ĐÚNG HẾT VỚI CÁC CASES
//       HÀM CÓ 1 THẰNG SAI, ĐÁM CÒN LẠI ĐÚNG/XANH, HÀM KHÔNG ỔN ĐỊNH
//       DO CÓ 1 THẰNG SAI -> KẾT LUẬN CHUNG HÀM LÀ SAI
//CHỈ CẦN 1 THẰNG ĐỎ, DÁM KẾT LUẬN CODE KHÔNG Ổ ĐỊNH, KHÔNG CHO ĐI TIẾP
//CODE KHÁC, PHẢI SỬA CHO XANH -> PHẦN LÝ THUYẾT CỐT LÕI CỦA CI
//TÍCH HỢP LIÊN TỤC - CONTINUOS INTEGRATION
