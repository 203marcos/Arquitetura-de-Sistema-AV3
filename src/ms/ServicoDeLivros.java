package ms;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import Modelo.DisciplinaImplementador;
import Modelo.LivroImplementador;


public class ServicoDeLivros {
    private final String endpoint = "https://qiiw8bgxka.execute-api.us-east-2.amazonaws.com/acervo/biblioteca";

    // Cliente HTTP para enviar solicitações
    private final HttpClient client = HttpClient.newHttpClient();

    // Parser para converter a resposta JSON em objetos Estudante
    private final JsonParserLivros parser = new JsonParserLivros();

    // Método que recupera os estudantes como uma lista de objetos Estudante
    public List<LivroImplementador> obterLivros() {
        // Constrói a solicitação HTTP GET para o endpoint
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .GET() // Indica que é uma solicitação GET
                .build();

        try {
            // Envia a solicitação e bloqueia até que a resposta esteja disponível
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Usa o JsonParser para converter a resposta JSON em uma lista de objetos Estudante
            return parser.parse(response.body());

        } catch (Exception e) {
            // Em caso de erro, imprime o stack trace e retorna uma lista vazia
            e.printStackTrace();
            return List.of(); // Java 9+ para criar uma lista imutável vazia
        }
    }

    // Método que recupera os dados dos estudantes como uma String JSON
    public String obterDadosLivroComoJson() {
        // Constrói a solicitação HTTP GET para o endpoint
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .GET() // Indica que é uma solicitação GET
                .build();

        try {
            // Envia a solicitação e bloqueia até que a resposta esteja disponível
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Retorna a resposta como uma String JSON
            return response.body();

        } catch (Exception e) {
            // Em caso de erro, imprime o stack trace e retorna uma string vazia
            e.printStackTrace();
            return ""; // Retorna uma string vazia em caso de erro
        }
    }

}
