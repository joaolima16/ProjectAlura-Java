import java.io.InputStream;
import java.net.URL;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        // Requisição na Api de filmes
        
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
        // Separando os dados do JSON
        JsonParser Json = new JsonParser();
        var http = new ClienteHttp();
        var json = http.BuscaDados(url);

        // Exibindo os dados;
        ExtratoraConteudo extrator = new ExtratoraConteudoNasa();
        var gerador = new GeradorFigurinhas();
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        for (int i = 0;i<1;i ++)
        {
            Conteudo conteudo = conteudos.get(i);
            InputStream inputStream = new URL(conteudo.getUrlImagem())
                    .openStream();
            String nomeArquivo = conteudo.getTitulo() + ".png";
            gerador.Create(inputStream, nomeArquivo);
        }
    }

}
