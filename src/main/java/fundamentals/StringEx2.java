package fundamentals;

import java.util.Scanner;

public class StringEx2 {
    //Write an application that "stutters", that is, reads the user's text (type String), and prints
    //the given text, in which each word is printed twice.
    //For example, for the input: "This is my test" the application should print "This This is is
    //my my test test".
    public static void shutters(){
        System.out.println("Type your word");
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        String[] words =text.split("");//intializam stringul
        for(int i =0; i < words.length; i++){
            System.out.println(words[i] + " " + words[i] + " ");
        }
        System.out.println(words[words.length -1] + "" + words[words.length-1]);


    }
    public void TestStrings(){
        String s1 = "abc", s2="abc", s3= new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }

public void testObjects(){
        Dog dog1 = new Dog("Azorel");
    //    dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
    //    dog2.setName("Azorel");

    System.out.println(dog1 == dog2);
    System.out.println(dog1.equals(dog2));
}
}

