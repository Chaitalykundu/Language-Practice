package Strings;

public class printAllCharacters {
    public static void main(String[] args) {

        String firstName = "Chaitaly" ;
        String lastName = "Kundu";

        // concatenation
        String fullname = firstName + lastName;

        for(int i=0;i<fullname.length();i++)
            System.out.println(fullname.charAt(i));             // charAt function
    }
}
