1.Add CountStringwithtrim to count split strings
import java.util.*;

public class Main{
    public static void main(String[] args){
         String str="       Hello-------Hi ";
        str=str.trim();
        String[] s=str.split("-+");
        int count=0;
        for(String c:s){
            count++;
        }
        System.out.println(count);
    }
}

//2.Add Countwithinbuilt.java to count split strings
import java.util.*;

public class Main{
    public static void main(String[] args){
        String str="Hi-Hello-how-are-you";
        String[] s=str.split("-");
        int count=0;
        for(String c:s){
            count++;
        }
        System.out.println(count);
    }
}

//3.Add Countwithoutinbuilt.java to count words
import java.util.*;
public class Main{
  public static void main(String[] args){
    String str = "Hi Hello Great";
    boolean flag = true;
    for(int i=0;i<str.length();i++){
       char ch = str.charAt(i);
      if(ch!=' '){
       if(flag){
         count++;
         flag=false;
       }
      }
      else{
        flag = true;
      }
    }
    System.out.print(count);
  }
}
//4.Add character frequency counting in Frequency
import java.util.*;
public class Main{
    public static void main(String[] args){
        String str="Hi_Guys_Hello_Hi_Guy";
        int[] freq=new int[256];
        for(char c:str.toCharArray()){
            freq[c]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                System.out.println((char)i+": "+freq[i]); //used type casting
            }} }}
//5.Create Frequencywithoutarray

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "Hi Hello Great";
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;
            int count = 1;
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }}
            if (str.charAt(i) == ' ') {
                System.out.println("space : " + count);
            } else {
                System.out.println(str.charAt(i) + " : " + count);
            }
        }
    }
}