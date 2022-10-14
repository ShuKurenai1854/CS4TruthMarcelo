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
public class Song {
    String name;
    String genre;
    int fame;
    int impact;
    
    public Song(String n, String g, int f, int i) {
        name = n;
        genre = g;
        fame = f;
        impact = i;
    }
    
    public void overrate(byte overratedness) {
       fame -= overratedness;
    }
    
    public void underrate(byte underratedness) {
        fame += underratedness;
    }
}
