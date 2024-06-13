package net.vounty.wizard;

import net.vounty.wizard.service.WizardService;

public class Bootstrap {

  public static void main(String[] args) {
    final var wizard = new WizardService();
    wizard.initialize();
  }

}
