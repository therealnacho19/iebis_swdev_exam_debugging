import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        StringBuffer word = new StringBuffer();
        word.delete(0, word.length());
        String firstLetter = new String();



        switch (random.nextInt(2)) {
            case 0:
                firstLetter = "Y";
                break;
            case 1:
                firstLetter = "F";
                break;
            case 2:
                firstLetter = "T";
                break;
        }

        word.append(firstLetter);
        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
