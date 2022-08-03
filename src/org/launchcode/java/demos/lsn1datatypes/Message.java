package org.launchcode.java.demos.lsn1datatypes;
//public static returnedDataType methodName(parameterDataType parameterName){}
public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("it")) {
            return "Ciao, mondo!";
        } else {
            return "Hello, World!";
        }
    }
}
