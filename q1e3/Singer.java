/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03truthmarcelo;

/**
 *
 * @author TRUTH
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    
    
    public void performForAudience(byte number) {
        noOfPerformances += 1;
        earnings += number*100;
    }
    
    public void changeFavSong (Song newFavSong) {
        favoriteSong = newFavSong;
    }
}
