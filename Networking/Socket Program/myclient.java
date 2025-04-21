import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class myclient 
{
   public static void main(String[] args) {
    try 
    {
        try (Socket s = new Socket("localhost",6000); DataOutputStream dos = new DataOutputStream(s.getOutputStream())) {
            dos.writeUTF("Hello Server.");
        }
    } 
    catch (IOException e)
    {
        System.out.println(e);
    }
   }   
}
