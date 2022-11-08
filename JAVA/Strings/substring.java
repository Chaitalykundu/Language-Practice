package Strings;

public class substring {
    public static void main(String[] args) {

        String sentence = "Chaitaly Kundu" ;


        // substring(beginning index, end index+1)
        String name = sentence.substring(0,8);
        String surname = sentence.substring(9,14);

        System.out.println(name);

        System.out.println(surname);

    }
}
