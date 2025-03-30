package IniciarSistema.Tipos;

import ConsumoApis.ConsumidorAPIDisciplina;

public class IniciaDisciplina {

    ConsumidorAPIDisciplina apiDisciplina;

    public IniciaDisciplina() {
        this.apiDisciplina = new ConsumidorAPIDisciplina();
    }

    public ConsumidorAPIDisciplina getApiDisciplina() {
        return apiDisciplina;
    }

    public void setApiDisciplina(ConsumidorAPIDisciplina apiDisciplina) {
        this.apiDisciplina = apiDisciplina;
    }

}
