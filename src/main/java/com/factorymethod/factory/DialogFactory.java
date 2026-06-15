package com.factorymethod.factory;

import com.factorymethod.buttons.Button;

/**
 *
 * @author osmar
 */
public abstract class DialogFactory {

    /**
     * As subclasses substituirão este método para criar um botão específico
     * objetos.
     */
    public abstract Button createButton();
   
    
     /**
     * O método concreto geralmente é escolhido dependendo da configuração
     * ou opções de ambiente.
     */
    public static Button getDialogButton() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            return new WindowsDialog().createButton();
        } else {
            return new HtmlDialog().createButton();
        }
    }

}