/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author mflaschberger
 */
public interface TipCalculator {

    static final double GOOD_RATE = 0.20;
    static final double FAIR_RATE = 0.15;
    static final double POOR_RATE = 0.10;
    static final double MIN_BILL = 0.00;

    public abstract double getTip();

}
