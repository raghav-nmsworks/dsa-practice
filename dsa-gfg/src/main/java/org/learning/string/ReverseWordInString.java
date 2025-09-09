package org.learning.string;

public class ReverseWordInString {

    static void reverseWordApproach2(String str){
        String[] words = str.split(" ");
        StringBuilder revSb = new StringBuilder();

        for (String word : words){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            revSb.append(sb + " ");
        }
        str = revSb.reverse().toString();
        System.out.println(str);
    }

    static void reverseWordApproach3(String str){
        String[] words = str.split(" ");
        StringBuilder revSb = new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            revSb.append(words[i] + " ");
        }
        str = revSb.toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "I am a good boy";
        reverseWordApproach2(str);
        reverseWordApproach3(str);
    }
}
