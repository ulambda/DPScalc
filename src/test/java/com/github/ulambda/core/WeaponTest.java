package com.github.ulambda.core;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class WeaponTest {
    /**
    * Weapons.of() Factory Method can create Weapon object from CSV database with a given name
    */
    @Test public void ofMethodWeaponObjectFromCSV(){
        var w = Weapons.of("Ibis Piercer"); //get weapon from database
        //check values are correct
        assertTrue(w.name().equals("Ibis Piercer"));
        assertTrue(w.baseATK() == 565);
        assertTrue(w.mainStatType().equals(Stat.ATKPercent));
        assertTrue(w.mainStatAmount() == 0.276);
    }

    /**
    * Check cached weapons have the same reference
    */
    @Test public void ofMethodPointerEquality(){
        //get the same weapon twice
        var w1 = Weapons.of("Ibis Piercer");
        var w2 = Weapons.of("Ibis Piercer");
        assertTrue(w1 == w2); //check for pointer equality
        var w3 = Weapons.of("Mistsplitter Reforged");
        assertTrue(w1 != w3); //check for pointer inequality
    }
}