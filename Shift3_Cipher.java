
public class Shift3_Cipher {

    String let = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypting(String cipher, int keyz){
        char c;
        char d;
        int index;
        int new_index;
        char[] encrypted = new char[cipher.length()];
        for (int i=0;i<cipher.length();i++) {
            c = cipher.charAt(i);

            if(c>= 'A' && c <= 'Z') {
                index = let.indexOf(c);
                int newindex = ((index + keyz) % let.length());
                d = let.charAt(newindex);
                encrypted[i] = d;
            }
        }
        String cipher_text = new String(encrypted);
        return cipher_text;
    }

    public String decryption(String cipher_text, int keyz ){
        char c;
        char d;
        int index;
        int new_index;
        char[] decrypted = new char[cipher_text.length()];
        for (int i=0;i<cipher_text.length();i++){
            c= cipher_text.charAt(i);

            if(c>= 'A' && c <= 'Z') {
                index = let.indexOf(c);
                int newindex = ((index - keyz) % let.length());
                if (newindex<0){
                    newindex += 26;
                }
                d = let.charAt(newindex);
                decrypted[i] = d;
            }
        }

        String deciphered_text = new String(decrypted);
        return deciphered_text;
    }

    public static void main(String[] args) {
        Shift3_Cipher cipher = new Shift3_Cipher();
        String c_text = cipher.encrypting("CRYPTOCURRENCY", 3);
        System.out.println("\nCiphered text: " + c_text);

        String d_text = cipher.decryption(c_text, 3);
        System.out.println("Deciphered text: " + d_text);
    }
}