public class Conteudo {
    private final String titulo;
    private final String UrlImagem;
    public  Conteudo(String titulo, String UrlImagem){
        this.titulo =  titulo;
        this.UrlImagem = UrlImagem;
    } 
    public String getTitulo(){
        return this.titulo; 
    }
    public String getUrlImagem(){
        return this.UrlImagem;
    }
}
