package StepDefinitions.GeneralSteps;

import lombok.Getter;


/**
 * Class responsible for capture and maintain the maven input execution parameters
 */
public class InputExecutionParameters {
    @Getter
    private static String tags;

    public static void setTags() {
        InputExecutionParameters.tags = System.getProperty("cucumber.filter.tags");
    }

}


