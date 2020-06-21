package challenge;

public class Main {

    public static void main(String[] args) {

        String TEXTO_CRIPTOGRAFADO = "vhmdp ehp ylqgrv dr dfhohud eudvlo 2019";
        String TEXTO_DESCRIPTOGRAFADO = "sejam bem vindos ao acelera brasil 2019";
        Criptografia criptografia;

        criptografia = new CriptografiaCesariana();
        System.out.println(criptografia.criptografar(TEXTO_DESCRIPTOGRAFADO));
        System.out.println(criptografia.descriptografar(TEXTO_CRIPTOGRAFADO));

    }
}
