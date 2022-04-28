import com.network.phone.Phone;

import java.io.*;

public class Client {
    public static void main(String[] args) {

    try(Phone phone = new Phone("127.0.0.1", 8000))
    {
        System.out.println("connect to server");
        String request = "Irkutsk";
        System.out.println("Request: " + request);

        phone.writeLine(request);
        String response = phone.readLine();
        System.out.println("response: " + response);

    }catch (IOException e ){
        e.printStackTrace();
    }



    }
}
