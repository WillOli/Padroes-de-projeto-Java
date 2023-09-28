import subSistema1.crm.CrmService;
import subSistema2.cep.CepApi;

public class Facade {
    public void migrationCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
