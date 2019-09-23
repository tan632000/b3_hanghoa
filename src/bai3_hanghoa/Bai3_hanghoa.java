/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_hanghoa;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3_hanghoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        HangThucPham htp = new HangThucPham();
        htp.inputInfo();
        htp.showInfo();
        Calendar cal = Calendar.getInstance();    
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int m = cal.get((Calendar.MONTH)+1);
        int y = cal.get(Calendar.YEAR);
        int a = y*365+m*30+d;
        int b = htp.day2+htp.month2*30+htp.year2*365;
        if(a>b){    
            System.out.println("San pham da het han");
        }else{
            System.out.println("San pham chua het han");
        }
    }
}
