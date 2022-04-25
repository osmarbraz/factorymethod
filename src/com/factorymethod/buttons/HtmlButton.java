package com.factorymethod.buttons;

/**
 *
 * @author osmar
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Botao de teste</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Botao diz - 'Alo Mundo!'");
    }
}
