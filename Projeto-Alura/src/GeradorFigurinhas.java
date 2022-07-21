import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import javax.imageio.ImageIO;

public class GeradorFigurinhas {
    public void Create(InputStream inputStream,String nomeArquivo) throws Exception{
    
            BufferedImage image = ImageIO.read(inputStream);
            int largura = image.getWidth();
            int altura =  image.getHeight();
            int novaAltura = altura  + 200;
            var novaImagem = new BufferedImage(largura,novaAltura, BufferedImage.TRANSLUCENT);
            Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
            graphics.drawImage(image, 0, 0, null);
            Font fonteTeste = new Font(Font.SANS_SERIF,Font.ITALIC,65);
            graphics.setFont(fonteTeste);
            graphics.setColor(Color.red);
            graphics.drawString("Topzera", 100, novaAltura - 100);
            ImageIO.write(novaImagem,"png", new File(nomeArquivo));
        }
    
}
