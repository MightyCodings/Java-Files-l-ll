import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class myserver
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
       try
       {
           try (ServerSocket ss = new ServerSocket(6000)) {
               Socket s = ss.accept();
               DataInputStream dis = new DataInputStream(s.getInputStream());
               String str =(String)dis.readUTF();
               System.out.println(str);
               dis.close();
           }  
       }      
       catch(IOException e)
       {
          System.out.println(e); 
       }
    }
}
