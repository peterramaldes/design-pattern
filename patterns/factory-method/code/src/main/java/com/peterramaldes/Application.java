package com.peterramaldes;

import com.peterramaldes.factory.Dialog;
import com.peterramaldes.factory.HtmlDialog;
import com.peterramaldes.factory.WindowsDialog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  private static Dialog dialog;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    configure();
    runBusinessLogic();
  }

  static void configure() {
    if (System.getProperty("os.name").equals("Windows 10")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  /**
   * All of the client node should work with factories and products through
   * abstract interfaces. This way it does not care which factory it works
   * with and what kind of product it returns.
   */
  static void runBusinessLogic() {
    dialog.renderWindow();
  }

}
