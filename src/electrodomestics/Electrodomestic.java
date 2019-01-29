/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestics;

/**
 *
 * @author christian
 */
public class Electrodomestic {
    private float price;
    private String color;
    private float weight;
    
    public Electrodomestic(){
        this.price = 100;
        this.color = "White";
        this.weight = 5;
    }
    
    public Electrodomestic(float weight, float price){
        this.price = price;
        this.weight = weight;
    }
    
    public Electrodomestic(float price, String color, float weight){
       this.price = price;
       this.color = color;
       this.weight = weight;
    }
    
    public String checkColor(){
        return this.color;
    }
    
    public void changePrice(float price){
        this.price = price;
    }
    
    public float checkPrice(){
        return price;
    }
    
    public void changeColor(String color){
        this.color = color;
    }
}
