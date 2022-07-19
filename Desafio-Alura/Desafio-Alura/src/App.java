import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
       var url = "https://api.mocki.io/v2/549a5d8b";
       var client = HttpClient.newHttpClient();
       URI adress = URI.create(url);
       HttpRequest request = HttpRequest.newBuilder(adress).GET().build();
       var response = client.send(request, BodyHandlers.ofString());
       System.out.println(response.body());
    }
}
