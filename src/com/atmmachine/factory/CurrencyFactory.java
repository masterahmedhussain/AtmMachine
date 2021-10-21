package com.atmmachine.factory;

public class CurrencyFactory {

        public static Currency createCurrency(String country) {
            if (country.equalsIgnoreCase("Europe")) {
                return new Euro();
            } else if (country.equalsIgnoreCase("US")) {
                return new UsDollar();
            }
            return null;
        }
    
}
