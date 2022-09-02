package com.assignment.targets;
import net.serenitybdd.screenplay.targets.Target;

public class IMDbPage {
    public static final Target MOVIE_TITLE = Target.the("MOVIE TITLE").locatedBy("//h1[contains(@data-testid,'hero-title-block')]");
    public static final Target MOVIE_RATING = Target.the("Movie rating").locatedBy("(//div[contains(@class,'ipc-button__text')]//div[contains(@data-testid,'rating__score')]/span)[1]");
    public static final Target GENRE_COMEDY=Target.the("comedy icon").locatedBy("//a[contains(@class,'ipc-chip--on-baseAlt')][contains(@href,'genres=comedy')]/span");
    public static final Target GENRE_DRAMA=Target.the("comedy icon").locatedBy("//a[contains(@class,'ipc-chip--on-baseAlt')][contains(@href,'genres=drama')]/span");
    public static final Target CAST_CREW_LINK=Target.the("cast and crew button").locatedBy("//div[contains(@data-testid,'hero-subnav-bar-right-block')]//a[contains(text(),'Cast & crew')]");
}
