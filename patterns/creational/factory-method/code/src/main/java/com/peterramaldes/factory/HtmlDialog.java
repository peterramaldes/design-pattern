package com.peterramaldes.factory;

import com.peterramaldes.buttons.Button;
import com.peterramaldes.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

  @Override
  protected Button createButton() {
    return new HtmlButton();
  }

}
