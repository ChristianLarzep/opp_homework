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
public class Television extends Electrodomestic{
    private int channel;
    private int display_size;
    
    public Television(){
        super();
    }
    public Television(int channel, int d_size){
        super();
        this.channel = channel;
        this.display_size = d_size;
    }

    public void changeChannel(int channel) {
       this.channel = channel;
    }
    
    public int checkChannel(){
        return this.channel;
    }
}
