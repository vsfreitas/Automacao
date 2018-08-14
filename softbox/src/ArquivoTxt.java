import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class ArquivoTxt {

    public static void main(String[] args) throws IOException {

        String textoQueSeraEscrito = "Endpoint: " + "Requisição: " + "Resposta: ";
        FileWriter arquivo;
        try {
          arquivo = new FileWriter(new File(".txt"));
          arquivo.write(textoQueSeraEscrito);
          arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
