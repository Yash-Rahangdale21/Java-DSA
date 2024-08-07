

public class passbyvalue {

    static void change_val(int a) {
        a = 100;
    }

    public static void main(String[] args) {
        int a = 5;
        change_val(a);
        System.out.println(a);
    }
}

//in this code only a value change in change_value function it is cant pass main 
