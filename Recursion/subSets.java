import java.util.ArrayList;
public class subSets {
    // ex : abc
   static ArrayList<String> arr = new ArrayList<>();  // global 
    public static void sets(int i ,String s,String ans){
        if( i == s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        sets(i+1,s,ans);    // not take a character
        sets(i+1,s,ans+ch);  //take a character
    }
    public static void main(String[] args) {
        String str = "yash";
        arr = new ArrayList<>(); // it is use for the ressett the list
        sets(0,str,"");
        System.out.println(arr);
    }
}
