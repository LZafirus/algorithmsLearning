package org.walaszczyk;

public class WarmUpSecond {

    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".
    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
    */
    public String stringSplosion(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp = temp + str.substring(0, i + 1);
        }

        return temp;
    }

}
