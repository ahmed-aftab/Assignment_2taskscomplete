package com.assignment.targets;

import net.serenitybdd.screenplay.targets.Target;

public class GooglePage {
    public static final Target GOOGLE_ICON = Target.the("Google icon").locatedBy("//img[@alt=\"Google\"]");
    public static final Target SEARCH_BAR = Target.the("Search bar").locatedBy("//input[@title='Search']");

}
