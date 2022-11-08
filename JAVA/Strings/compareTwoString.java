package Strings;

public class compareTwoString {
    public static void main(String[] args) {

        String firstName = "Chaitaly" ;
        String lastName = "Kundu";


            // s1 > s2  : +ve value
            // s1 == s2 : 0 
            // s1 < s2  : -ve value

        if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
