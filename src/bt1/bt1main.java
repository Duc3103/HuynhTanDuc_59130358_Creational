/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Duc_PC
 */
public class bt1main {
    public static void main(String[] args ) throws ParseException{
    HoaDonHeader hdHeader = new HoaDonHeader("HD003", "Huỳnh Tấn Đức", new SimpleDateFormat("dd/MM/yyyy").parse("12/06/2020"));
        HoaDon hd = new HoaDon.Builder().setHeader(hdHeader).
                addCTHD(new CTHD("Ipadpro", 1, 20000, 10)).
                addCTHD(new CTHD("Pen", 1, 3000, 1)).build();
        System.out.println(hd.toString());
    }   
}
