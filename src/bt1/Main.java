/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author ADMIN
 */
public class Main {
      public static void main(String[] args) {
        // TODO code application logic here
         HoaDon hd1 = new HoaDon.hoaDonBuilder()
            .addHeader(new HoaDonHeader("HD01","01/03/1999","Nguyen Van Phung"))
            .addCTHD(new CTHD("O Cam",1, 15000,1))
            .addCTHD(new CTHD("Bong Den",2, 5000000,5 ))
            .builder();
            System.err.println(hd1.toString());
    }
}
