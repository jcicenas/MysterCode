import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        CustomString userString = new CustomString("programming is fun");
        try{
        System.out.println(userString.string);
        //call reduce string method
        userString.removeSpaces();
        System.out.println(userString.string);
        //call alternate case method
        userString.alternateCase();
        System.out.println(userString.string);
        // call reduce length method x3 cus too lazy
        userString.reduceLength();
        System.out.println(userString.string);
        userString.reduceLength();
        System.out.println(userString.string);
        userString.reduceLength();
        System.out.println(userString.string);

        }catch(Exception e){
            System.out.println("u suck how u gonna be getting exceptions");
        }
    }
}
