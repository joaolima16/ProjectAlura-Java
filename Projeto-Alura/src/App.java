import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Requisição na Api de filmes
        String url ="https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response  =  client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // Separando os dados do JSON
        JsonParser Json = new JsonParser();
        List<Map<String,String >>ListaDeFilmes =  Json.parse(body);
        
        //Exibindo os dados;
        for (Map<String,String> filme: ListaDeFilmes) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
        }
    }
    
}
