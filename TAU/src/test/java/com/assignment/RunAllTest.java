package com.assignment;

import com.assignment.task1.acceptanceCriteria.OpenGoogleTestSuite;
import com.assignment.task3.acceptanceCriteria.CastCrewPageTestSuite;
import com.assignment.task4.acceptanceCriteria.DataSavingTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.assignment.task2.acceptanceCriteria.IMDbLinkCheckTestSuite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        OpenGoogleTestSuite.class,
        IMDbLinkCheckTestSuite.class,
        CastCrewPageTestSuite.class,
        DataSavingTestSuite.class
})
public class RunAllTest {}

