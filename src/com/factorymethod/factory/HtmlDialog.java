package com.factorymethod.factory;

import com.factorymethod.buttons.Button;
import com.factorymethod.buttons.HtmlButton;

/**
 *
 * @author osmar
 */
public class HtmlDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}