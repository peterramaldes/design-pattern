package com.peterramaldes.factory;

import com.peterramaldes.buttons.Button;
import com.peterramaldes.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

  @Override
  protected Button createButton() {
    return new WindowsButton();
  }

}
