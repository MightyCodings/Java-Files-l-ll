import java.net.MalformedURLException;
import java.net.URL;

class url
{
    public static void main(String[] args) throws MalformedURLException
    {
        @SuppressWarnings("deprecation")
        URL u = new URL("https://www.w3schools.com/");
        System.out.println("Protocol..="+u.getProtocol());
        System.out.println("URL..="+u.toString());
        System.out.println("Port..="+u.getPort());
        System.out.println("Host Name..="+u.getHost());
        System.out.println("Authority.="+u.getAuthority());
        System.out.println("File Name..="+u.getFile());
        System.out.println("Hashcode.."+u.hashCode());
    }
}