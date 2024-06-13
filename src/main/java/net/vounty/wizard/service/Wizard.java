package net.vounty.wizard.service;

import net.vounty.wizard.adapter.adapters.*;
import net.vounty.wizard.console.Console;
import net.vounty.wizard.log.Log;

public interface Wizard {

  static Wizard getService() {
    return WizardService.getWizardService();
  }

  void initialize();

  void reload();

  void terminate();

  Boolean isIPv4(String address);

  Log getLog();

  Console getConsole();

  CommandAdapter getCommandAdapter();

  ConfigurationAdapter getConfigurationAdapter();

  TokenAdapter getTokenAdapter();

  RepositoryAdapter getRepositoryAdapter();

  SecureAdapter getSecureAdapter();

}
