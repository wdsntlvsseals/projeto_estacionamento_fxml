package ifpr.pgua.eic.exemplo;

import java.util.ArrayList;

import ifpr.pgua.eic.exemplo.models.Estacionamento;
import io.github.hugoperlin.navigatorfx.BaseAppNavigator;
import io.github.hugoperlin.navigatorfx.ScreenRegistryFXML;
import io.github.hugoperlin.navigatorfx.ScreenRegistryNoFXML;


/*A classe App extende a classe BaseAppNavigator, o que
 * permite fazer a navegação entre telas.
 */
public class App extends BaseAppNavigator{


    /*gerenciador do estacionamento que será compartilhado com as diferentes telas
     * da aplicação.
     */
    private Estacionamento gerenciador;


    /*método utilizado para inicializar dependências da aplicação. Este
     * método é executado sempre uma vez no início da aplicação.
     */
    @Override
    public void init() throws Exception {
        super.init();

        gerenciador = new Estacionamento("SuperEstac", "1234-1234");
    }

    /*método para indicar qual é a tela inicial da aplicação */
    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    /*método para indicar o nome da aplicação */
    @Override
    public String getAppTitle() {
        return "Quiz App";
    }

    /*método para registrar as telas da aplicação*/
    @Override
    public void registrarTelas() {
        
    }
    
}
