import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratoraConteudoIMDB implements ExtratoraConteudo {
    public List<Conteudo> extraiConteudos(String json){
        var Json  = new JsonParser();
        List<Map<String, String>> ListaDeAtributos  = Json.parse(json);
        List<Conteudo> conteudos = new ArrayList<>();
        for(Map<String, String> atributos: ListaDeAtributos){
            String titulo = atributos.get("title");
            String urlImagem  = atributos.get("image");
            Conteudo conteudo = new Conteudo(titulo,urlImagem);
            conteudos.add(conteudo);
        }
        return conteudos;
    }
}
