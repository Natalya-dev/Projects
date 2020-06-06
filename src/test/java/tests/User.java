package tests;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import steps.ContactUsSteps;
import steps.MainSteps;

// Описываем пейджы, для удобства
  public class User extends ScenarioSteps {

    // Аннотация:
    // чтобы серенити мог добавить шаги в репорт при его генерации:
    @Steps
    public MainSteps mainPage;

    @Steps
    public ContactUsSteps contactUsPage;
}

