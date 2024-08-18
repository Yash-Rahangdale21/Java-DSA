import java.util.ArrayList;
import java.util.List;

public class SubSetsInteger {
    
    static List<List<Integer>> arr;
    public static void sets(int i ,int [] s,ArrayList<Integer> ans){
        if( i == s.length){
             ArrayList <Integer>list = new ArrayList<>();
        for( int j = 0;j<ans.size();j++){
            list.add(ans.get(j));
        }
            arr.add(list);
            return;
        }
       
        sets(i+1,s,ans);    // not take a character
        ans.add(s[i]);
        sets(i+1,s,ans); 
        ans.remove(ans.size()-1); //take a character
    }
    public static void main(String[] args) {
        int []nums ={1,2,3,4};
        arr =new ArrayList<>();
        ArrayList <Integer> ans =new ArrayList<>();
        sets(0,nums,ans);
        System.out.println(arr);
        
    }
        
              
    }


