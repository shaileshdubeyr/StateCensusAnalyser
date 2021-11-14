package com.csvandjson;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Assert;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class censusAnalyserTest {
    public static final String CSV_FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JsonAndCsvPractise" +
                                                "\\src\\test\\resources\\IndiaStateCensusData.csv";
    @Test
    public void giveInputFromFileSHoludPrintTheCensusData() throws IOException, CsvValidationException {
        BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE_PATH));
        CSVReader csvReader1 = new CSVReader(csvReader);
        String[] row;
        int counter=0;
        while ((row = csvReader1.readNext()) != null) {
            String[] data = row;
            System.out.println("the data is " + data[0]+","+data[1]+","+data[2]+","+data[3]);
            counter++;
        }
        System.out.println("total states is :- "+counter);
        Assert.assertEquals(30,counter);
    }
}
