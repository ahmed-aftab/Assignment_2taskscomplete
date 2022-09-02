package com.assignment.targets;
import net.serenitybdd.screenplay.targets.Target;

public class CastCrewPage {
    public static final Target PAGE_HEADING = Target.the("Page Heading").locatedBy("//h1[@class='header']");
    public static final Target DIRECTOR = Target.the("director name").locatedBy("//div[@id='fullcredits_content']/table[1]//td[@class='name']/a");
    public static final Target CASTE = Target.the("cast").locatedBy("(//table[@class='cast_list']//tr[.//img[@title='Ricky Gervais']]//a)[2]");
    public static final Target CASTE_NAME = Target.the("caste name").locatedBy("(//table[@class='cast_list']//tr[@class='odd']/td[@class='character']/a)[1]");
    public static final Target EPISODES =Target.the("No of episodes").locatedBy("(//table[@class='cast_list']//tr[@class='odd']/td[@class='character']/a[@class='toggle-episodes'])[1]");

}
