package com.assignment.targets;

import net.serenitybdd.screenplay.targets.Target;

public class ResultPage {
    public static final Target IMDB_SPOT=Target.the("IMDb link" ).locatedBy("//a[@role='link']/span[@title='IMDb']");
    public static final Target IMDB_RATING=Target.the("IMDb rating" ).locatedBy("//a[@role='link'][@href='https://www.imdb.com/title/tt8398600/']/span[not(contains(text(),'IMDb'))]");
}
