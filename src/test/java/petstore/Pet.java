package petstore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pet {
    String url = "https://petstore.swagger.io/v2/pet";

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

}
