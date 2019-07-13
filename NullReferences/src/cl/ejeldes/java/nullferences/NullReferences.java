package cl.ejeldes.java.nullferences;

import cl.ejeldes.kotlin.model.Address;
import cl.ejeldes.kotlin.model.Bank;
import cl.ejeldes.kotlin.model.Country;

/**
 * Created by ejeldes on Jul 13, 2019
 */
public class NullReferences {

    public static void main(String[] args) {

        Country country = new Country(1002, "Chile");
        Address address = new Address(country, 1234, "Sandalo Oriente");
        Bank bank = new Bank(address, "BCI");

        if (bank != null) {
            Address mAddres = bank.getAddress();
            if (mAddres != null) {
                Country mCountry = address.getCountry();
                if (mCountry != null) {
                    System.out.println("The country is " + mCountry.getName());
                } else {
                    System.out.println("country is null");
                }
            } else {
                System.out.println("address is null");
            }
        } else {
            System.out.println("Bank is null");
        }
    }
}
