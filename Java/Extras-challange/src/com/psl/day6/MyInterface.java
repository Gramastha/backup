/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.psl.day6;

/**
 *
 * @author Gramastha
 */
public interface MyInterface <T> {
    public boolean hasNext();
    public void reset();
    public T get();
    
}
