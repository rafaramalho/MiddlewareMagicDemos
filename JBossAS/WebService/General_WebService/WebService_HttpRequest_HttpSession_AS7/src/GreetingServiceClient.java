package client;
public class GreetingServiceClient
{
   public static void main(String ar[]) throws Exception
     {
        //String WSDL_URL=ar[0];
        GreetingService service=new GreetingService();
        Greeting port=service.getGreetingPort();
        System.out.println("**********************************");
        System.out.println("\n\n\tport.hello(\"Jack\") = "+port.hello("Jack"));
        System.out.println("\n\n**********************************");
        System.out.println("\n\n\tport.getRequestHeaders() = "+port.getRequestHeaders());
     }
}

