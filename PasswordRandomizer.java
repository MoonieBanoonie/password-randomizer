import java.util.Random;

public class PasswordRandomizer {
    // definieren van variabelen
    private Random random = new Random(); //randomizer
    private int passwordLength; //lengte van password
    private int amountAlphabet; //hoeveelheid van letters in alfabet
    String newPassword = ""; //de password

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        this.amountAlphabet = 26;
    }

    public String createPassword() {
        String temppass = ""; //tijdelijke paswoord aanmaken, zodat we steeds bij het oproepen van de methode een nieuw paswoord hebben
        int i = 0;
        while (i < passwordLength) {
            char letter = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(this.amountAlphabet)); // random letter kiezen uit alfabet
            temppass += letter; //tijdelijke paswoord krijgt elke keer een letter toegevoegd
            i++;
        }
            this.newPassword = temppass; //de volledige paswoord word in de variabel gezet die returned wordt.
            return newPassword;
        }

    }





//        ArrayList<String> letters = new ArrayList<>();
//
//        int i = 0;
//        while (i < passwordLength){
//            char letter = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(passwordLength)); //chooses random letter from the alphabet
//            String newPassword = String.valueOf(letter);
//            letters.add(newPassword);
//            i++;
//        }
//
//        return letters.toString();
//    }

