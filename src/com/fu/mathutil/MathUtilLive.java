/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author USER
 */
public class MathUtilLive {

    public static void main(String[] args){
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = " + result);
        System.out.println("6! = " + MathUtil.getFactorial(6));
        System.out.println("6! = " + MathUtil.getFactorial(0));
    }
    
    
}
