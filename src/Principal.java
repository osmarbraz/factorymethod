
import com.factorymethod.buttons.Button;
import com.factorymethod.factory.DialogFactory;

public class Principal {

    public static void main(String[] args) {

        /**
         * Retorna o botão do método da fábrica.
         */
        Button okButton = DialogFactory.getDialogButton();

        /**
         * Todo o código do cliente deve funcionar com fábricas e botões
         * através interfaces abstratas. Desta forma não importa em qual fábrica
         * trabalha com e que tipo de botão devolve.
         */
        okButton.render();
    }

}
