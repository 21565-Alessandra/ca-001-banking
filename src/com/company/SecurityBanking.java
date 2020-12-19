// STUDENT NAME: Alessandra Silva dos Reis * ID: 21565

package com.company;

import java.util.ArrayList;
import java.util.List;

public class SecurityBanking extends Security{
    private List<String> pins = new ArrayList();

    public void addPin(String pin){
        pins.add(pin);
    }

    public boolean login(String pinNumber) {
        // login to check if pinNumber is correct

        for(String pin: pins){
            if(pinNumber == pin){
                return true;
            }
        }
        return false;
    }
}