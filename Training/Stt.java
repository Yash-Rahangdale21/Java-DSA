public class Stt{
    // in that we are using the static method the static method ont rrequired any call to it it is run automatially
    // when there class is running
    public static void main(String[] args) {
        int a = 10;int b = 4;int c = 25;
        if(a>b && a>c){
            System.out.println("A is Greater");
        }else if(b>c){
            System.out.println("B is Greater");
        }else{
            System.out.println("C is Greater");
        }
    }
}