package challenge;

import java.util.ArrayList;

public class CriptografiaCesariana implements Criptografia {

    public String cripto (String message, String key){
        ArrayList<String> alphabet = new ArrayList<>();
        for (int i=0; i < message.length(); i++) {
            if (Character.isDigit(message.charAt(i))){
                alphabet.add(Character.toString(message.charAt(i)));
            }
            else if(message.codePointAt(i) > 96 && message.codePointAt(i) < 123){
                if(key.equals("on")){
                    alphabet.add( Character.toString((char)(message.codePointAt(i)+3)) );
                } else {
                    alphabet.add(Character.toString((char)(message.codePointAt(i)-3)));
                }
            } else if (message.codePointAt(i) == 32) {
                alphabet.add(Character.toString((char) 32));
            }
        }
        return message = String.join("",alphabet);
    }

    @Override
    public String criptografar(String texto) {
        if(texto.isEmpty()){
            throw new IllegalArgumentException();
        } else {
            return cripto(texto.toLowerCase(), "on");
        }
    }

    @Override
    public String descriptografar(String texto) {
        if(texto.isEmpty()){
            throw new IllegalArgumentException();
        } else {
            return cripto(texto.toLowerCase(), "off");
        }
    }

}
