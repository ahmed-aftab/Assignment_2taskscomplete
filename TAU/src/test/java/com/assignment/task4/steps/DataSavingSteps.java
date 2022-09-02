package com.assignment.task4.steps;

import com.assignment.task2.steps.iMDbLinkCheckSteps;
import com.opencsv.CSVWriter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.testng.Assert;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.assignment.targets.CastCrewPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class DataSavingSteps {

    @Given("While Ali is at {string} page")
    public void whileAliIsAtPage(String arg0) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(PAGE_HEADING),containsText(arg0))
        );
    }

    @Then("store data in csv file")
    public void storeDataInCsvFile() throws IOException {
        List<String> actorsList = theActorInTheSpotlight().asksFor(
                Text.of(ACTORS_NAMES_LIST).asAList()
        );

        List<String> casteList = theActorInTheSpotlight().asksFor(
                Text.of(CASTE_NAMES_LIST).asAList()
        );
        List<String> episodesList = theActorInTheSpotlight().asksFor(
                Text.of(EPISODES_TIME).asAList()
        );

        for (String actors : episodesList)
            System.out.println(actors.length());
        System.out.println(actorsList.size());
        System.out.println(episodesList.get(1).substring(0,2));

        String outputFilePath = "C:\\Users\\emumba\\Desktop\\TodoMVC_Project\\TAU\\src\\test\\resources\\Data.csv";

        try(CSVPrinter csv = new CSVPrinter(Files.newBufferedWriter(Paths.get(outputFilePath)), CSVFormat.DEFAULT)) {
            csv.printRecord("Name", "Cast Name", "Episodes Appeared In","Time of Appearance"); //uncomment if you want a header row
            for (int i = 0; i < 97; i++) {
                if(episodesList.get(i).length()==22) {
                    csv.printRecord(actorsList.get(i), casteList.get(i), episodesList.get(i).substring(0, 2),episodesList.get(i).substring(12, 22));
                } else if (episodesList.get(i).length()==21) {
                    csv.printRecord(actorsList.get(i), casteList.get(i), episodesList.get(i).substring(0, 2),episodesList.get(i).substring(12, 21));

                } else if (episodesList.get(i).length()==16) {
                    csv.printRecord(actorsList.get(i), casteList.get(i), episodesList.get(i).substring(0, 2),episodesList.get(i).substring(12, 16));

                } else if (episodesList.get(i).length()==15) {
                    csv.printRecord(actorsList.get(i), casteList.get(i), episodesList.get(i).substring(0, 2),episodesList.get(i).substring(10, 15));
                }


            }
        }

//        String[] array = actorsList.toArray(new String[]{});
//        System.out.print(actorsList.get(4));

//        String csv = "C:\\Users\\emumba\\Desktop\\TodoMVC_Project\\TAU\\src\\test\\resources\\Data.csv";
//        CSVWriter writer = null;
//        try {
//            writer = new CSVWriter(new FileWriter(csv));
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
////        for(String: csvInput){
////            writer.writeNext(each);
////        }
//        for (int i = 0; i < 97; i++) {
//            writer.writeNext(array.get(x));
//        }
//        writer.close();
        //end of writeTOCSV

//        CSVWriter file;
//        file=new CSVWriter(new FileWriter(new File("src/test/resources/Data.csv")));
//        file.get
//        final Path path = Paths.get(ClassLoader.getSystemResource(outputFilePath).toURI());
//        return Files.lines(path).skip(1L).count(); // skip(1L) to ignore the titles




    }

    @And("Check check that total caste is {string}")
    public void checkCheckThatTotalCasteIs(String arg0)throws IOException {
        String outputFilePath = "C:\\Users\\emumba\\Desktop\\TodoMVC_Project\\TAU\\src\\test\\resources\\Data.csv";
        try
                (
                        FileReader input = new FileReader(outputFilePath);
                        LineNumberReader count = new LineNumberReader(input);
                )
        {
            while (count.skip(Long.MAX_VALUE) > 0)
            {
                // Loop just in case the file is > Long.MAX_VALUE or skip() decides to not read the entire file
            }

            int result = count.getLineNumber()-1;// +1 because line index starts at 0
            System.out.println("no of lines "+result);
            Assert.assertEquals(Integer.toString(result),arg0,"rating is not equal");
        }
    }
}
