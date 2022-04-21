package com.factorymethod.factory;

import com.factorymethod.buttons.Button;
import com.factorymethod.buttons.WindowsButton;

/**
 *
 * @author osmar
 */
public class WindowsDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}