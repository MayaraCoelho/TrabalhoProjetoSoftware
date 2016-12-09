package trabalhops.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Map;

public class teste implements Serializable {

    public void gravaArquivo(Map catalogo) throws IOException {
// definir o nome do arquivo
        String filename = "catalogo.dat";
// abrir o arquivo que irá receber o objeto serializado
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);
// associar ao arquivo o ObjectOutputStream
        ObjectOutputStream s = new ObjectOutputStream(out);
        s.writeObject(catalogo);
    }

    public Map leArquivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        String filename = "catalogo.dat";
        Map dados;
        File file = new File(filename);
        InputStream in = new FileInputStream(file);
        ObjectInputStream s = new ObjectInputStream(in);
        dados = (Map) s.readObject();
        return dados;
    }
}
