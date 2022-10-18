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

public class Ex03TruthMarcelo {
    
    public static void main(String[] args) {
        Food food1 = new Food("Golden Shrimp Balls", "Appetizer");
        Food food2 = new Food("Chilibrew", "Drink");
        Food food3 = new Food("Golden Chicken Burger", "Perfection");
        
        Song song1 = new Song("Let the Wind Tell You", "Masterpiece", 6, 30);
        Song song2 = new Song("Of Liyue, Clouds and Seas", "Is gonna get stuck inside your head", 10, 10);
        
        Singer mystia = new Singer("Mystia Lorelei", 1, 900, song1);
        
        mystia.performForAudience(12);
        mystia.changeFavSong(song2);
        
    }
}
