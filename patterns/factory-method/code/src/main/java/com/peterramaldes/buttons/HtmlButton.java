package com.peterramaldes.buttons;

/**
 * HTML Button Implementation.
 */
public class HtmlButton implements Button {

  @Override
  public void render() {
    System.out.println("<button>Hello World Button</button>");
    onClick();
  }

  @Override
  public void onClick() {
    System.out.println("Click! Button says - 'Hello World!' ");
  }
}
