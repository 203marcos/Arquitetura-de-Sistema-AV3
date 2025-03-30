package ms;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import Modelo.DisciplinaImplementador;

public class ServicoDeDisciplina {
    private final String endpoint = "https://sswfuybfs8.execute-api.us-east-2.amazonaws.com/disciplinaServico/msDisciplina";

    // Cliente HTTP para enviar solicitações
    private final HttpClient client = HttpClient.newHttpClient();

    // Parser para converter a resposta JSON em objetos Estudante

    private final JsonParserDisciplina parser = new JsonParserDisciplina();

    // Método que recupera os estudantes como uma lista de objetos Estudante
    public List<DisciplinaImplementador> obterDisciplina() {
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
    public String obterDadosDisciplinaComoJson() {
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
