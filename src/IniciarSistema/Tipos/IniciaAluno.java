package IniciarSistema.Tipos;

import ConsumoApis.ConsumidorAPIAluno;

public class IniciaAluno {
    ConsumidorAPIAluno apiAluno;

    public IniciaAluno() {
        this.apiAluno = new ConsumidorAPIAluno();
    }

    public ConsumidorAPIAluno getApiAluno() {
        return apiAluno;
    }

    public void setApiAluno(ConsumidorAPIAluno apiAluno) {
        this.apiAluno = apiAluno;
    }


}
