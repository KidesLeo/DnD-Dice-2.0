/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dnd;

import java.util.Random;

public class Generate {
    
    Random gen = new Random();
    
    int Generate(int x)
    {
        
        return gen.nextInt(x)+1;
        
    }
    
}


