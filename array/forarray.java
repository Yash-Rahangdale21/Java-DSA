

public class forarray {
    public void loop(){
       // int []ages = new int[6];
       String [] names = {"yash","shubham","mangesh","suresh","pankkaj"};
       for(int i = 0;i<names.length;i++){
        System.out.println(names[i] +" " +i);
       }
       

    }
    public static void main(String[] args) {
        forarray obj = new forarray();
        obj.loop();
    }
}
