/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quan.mathutil.main;

import com.quan.mathutil.core.MathUtil;

/**
 *
 * @author 846ab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Kĩ thuật 1 - dùng mắt luận kết quả - manual test
        //Gọi hàm với các giá trị đầu vào chuẩn bị sẵn ở test case
        //in ra kết quả, dùng mắt luật đúng sai giữa EXPECTED vs. ACTUAL
        //in ra kết quả xử lí của hàm theo
        //- sout()
        //- log file (môn Java Web)
        //- popup kết quả xử lí (Windows Form/Desktop app, output ra trang web)

        //kĩ thuật manual test dùng sout() -> CHÍNH LÀ CÁCH TA LÀM UNIT TESTING
        //TEST CASE #1: input n = 0; expected == 0! ==1; actual == ???
        long expectedValue = 1; //hy vọng hàm trả về 1
        long actualValue = MathUtil.getFactorial(0);
        System.out.println("Test 0! | expected = " + expectedValue
                + "| actual = " + actualValue);

        //TEST CASE #2: input n = 1; expected == 1! ==1; actual == ???
        expectedValue = 1; //hy vọng hàm trả về 1
        actualValue = MathUtil.getFactorial(1);
        System.out.println("Test 1! | expected = " + expectedValue
                + "| actual = " + actualValue);

        //TEST CASE #3: input n = 5; expected == 5! ==120; actual == ???
        expectedValue = 120; //hy vọng hàm trả về 120
        actualValue = MathUtil.getFactorial(5);
        System.out.println("Test 5! | expected = " + expectedValue
                + "| actual = " + actualValue);

        //TEST CASE #4: input n = -5; hy vọng bị chửi
        System.out.println("See the Illegal Argument Exception if n = -5");
        MathUtil.getFactorial(-5);

        //VIỆC KẾT LUẬN HÀM ĐÚNG/SAI THÌ MẮT TA PHẢI DUYỆT QUA TỪNG CẶP
        //EXPECTED CÓ == ACTUAL HAY KHÔNG? VÀ DUYỆT HẾT MỚI DÁM KẾT LUẬN
        //HƠI MẤT SỨC, DỄ SAI SÓT NẾU CÓ NHIỀU CASE TEST KHÁC NHAU
        //NẾU MÁY LÀM LUÔN PHẦN MẤT SỨC NÀY -> TEST AUTOMATION
        //MÁY QUÉT QUA HẾT CÁC CẶP EXPECTED VÀ ACTUAL VÀ CHỐT
        // ĐÚNG HOẶC SAI!!!
        //NHỜ TRÒ NÀY -> TỰ ĐỘNG HOÁ ĐƯỢC VIỆC KIỂM SOÁT CHẤT LƯỢNG CODE
        //DEV SỬA CODE, CHỈ QUÉT 1 LƯỢT -> KẾT LUẬN LUÔN
        //LÕI CỦA CI - CONTINUOUS INTEGRATION - TÍCH HỢP LIÊN TỤC
    }

}

// để test 1 hàm/1 method/1 class có những phương pháp/cách thức cụ thể sau
//1. TEST DÙNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI - TRÂU BÒ DÙNG SỨC - MANUAL TEST
//2. DÙNG MẮT XEM 2 MÃ MÀU XANH ĐỎ LÀ ĐỦ
//- XANH: HÀM ĐÚNG; ĐỎ: HÀM SAI (so sáng EXPECTED vs. ACTUAL)
//- TEST AUTOMATION; KĨ THUẬT HIỆN ĐẠI HƠN, ĐỠ DÙNG SỨC ĐỂ LUẬN KẾT QUẢ
//ĐÒI HỎI CODE NHIỀU HƠN 1 CHÚT
