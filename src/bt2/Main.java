/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author ADMIN
 */
public class Main {
      public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("Van Phung 59131908 ")
        .addFloat(22).addbool(true);
        System.out.println(builder.toString());

    }
}
