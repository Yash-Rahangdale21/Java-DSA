public class subSets {
    // ex : abc
    public static void sets(int i ,String s,String ans){
        if( i == s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        sets(i+1,s,ans+ch);  //take a character
        sets(i+1,s,ans);    // not take a character
        }
    public static void main(String[] args) {
        String str = "yash";
        sets(0,str,"");
    }
}
