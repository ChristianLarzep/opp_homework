/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_homework;

import electrodomestics.Electrodomestic;
import electrodomestics.Television;
import electrodomestics.Washer;

/**
 *
 * @author christian
 */
public class Oop_homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestic electrodomestic = new Washer();
        electrodomestic.changePrice(34);
        
        System.out.println("Washer price: "+electrodomestic.checkPrice());
        
        Television tv = new Television();
        tv.changePrice(56);
        
        System.out.println("Tv price: "+tv.checkPrice());
        
        tv.changeChannel(67);
        
        System.out.println("Channel: "+tv.checkChannel());
    }
    
}
