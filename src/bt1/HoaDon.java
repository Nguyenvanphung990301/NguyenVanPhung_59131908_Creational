/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;



/**
 *
 * @author ADMIN
 */
public class HoaDon {
   HoaDonHeader hdheader;
    ArrayList<CTHD> DS;
    protected HoaDon(hoaDonBuilder builder){
        this.hdheader = builder.hdheader;
        this.DS = builder.DS;
    }

      @Override
    public String toString() {
        return "HoaDon:" + "\nhdheader: " + hdheader + ", \nDS: " + DS.toString();
    }
     public static class hoaDonBuilder{
        HoaDonHeader hdheader;
        ArrayList<CTHD> DS = new ArrayList<>();
        public hoaDonBuilder addHeader(HoaDonHeader hdheader){
            this.hdheader = hdheader;
            return this;
        }
        public hoaDonBuilder addCTHD(CTHD cthd){
            this.DS.add(cthd);
            return this;
        }
        public HoaDon builder(){
            return new HoaDon(this);
        }

      
    }       
}

