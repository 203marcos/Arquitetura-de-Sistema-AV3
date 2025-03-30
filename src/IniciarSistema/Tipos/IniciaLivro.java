package IniciarSistema.Tipos;

import ConsumoApis.ConsumidorAPILivro;

public class IniciaLivro {
    ConsumidorAPILivro apiLivro;

    public IniciaLivro() {
        apiLivro = new ConsumidorAPILivro();
    }

    public ConsumidorAPILivro getApiLivro() {
        return apiLivro;
    }

    public void setApiLivro(ConsumidorAPILivro apiLivro) {
        this.apiLivro = apiLivro;
    }
}
