package com.assignment.targets;
import net.serenitybdd.screenplay.targets.Target;

public class CastCrewPage {
    public static final Target PAGE_HEADING = Target.the("Page Heading").locatedBy("//h1[@class='header']");
    public static final Target DIRECTOR = Target.the("director name").locatedBy("//div[@id='fullcredits_content']/table[1]//td[@class='name']/a");
    public static final Target CASTE = Target.the("cast").locatedBy("(//table[@class='cast_list']//tr[.//img[@title='Ricky Gervais']]//a)[2]");
    public static final Target CASTE_NAME = Target.the("caste name").locatedBy("(//table[@class='cast_list']//tr[@class='odd']/td[@class='character']/a)[1]");
    public static final Target EPISODES =Target.the("No of episodes").locatedBy("(//table[@class='cast_list']//tr[@class='odd']/td[@class='character']/a[@class='toggle-episodes'])[1]");
    public static final Target ACTORS_NAMES_LIST = Target.the("actors names complete list").locatedBy("//tr[./td[contains(@class,'primary_photo')]]/td[not(contains(@class,'primary_photo'))][not(contains(@class,'ellipsis'))][not(contains(@class,'character'))]/a");
    public static final Target CASTE_NAMES_LIST = Target.the("caste names complete list").locatedBy("//tr[./td[contains(@class,'primary_photo')]]/td[contains(@class,'character')]/a[not(contains(@class,'toggle-episodes'))]");
    public static final Target EPISODES_TIME = Target.the("no of episodes and time").locatedBy("//tr[./td[contains(@class,'primary_photo')]]/td[contains(@class,'character')]/a[(contains(@class,'toggle-episodes'))]");
}
