package com.csvandjson;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class censusAnalyserTest {
    public final String CSV_FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JsonAndCsvPractise" +
            "\\src\\test\\resources\\IndiaStateCensusData.csv";
    public final String CSV_FILE_PATH_wrong = "C:\\Users\\Admin\\IdeaProjects\\JsonAndCsvPractise" +
            "\\src\\test\\resources\\myfolder\\IndiaStateCensusData.csv";
    public final String CSV_FILE_Extension_PATH = "C:\\Users\\Admin\\IdeaProjects\\JsonAndCsvPractise" +
                                                    "\\src\\test\\resources\\IndiaStateCensusData.txt";



    @Test
    public void givenFilePathIncorrectShoultresultFalse() throws IOException, CsvException {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(CSV_FILE_PATH_wrong);
            Assert.assertEquals(29, numOfRecords);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
        }
    }

    @Test
    public void givenFileTypeIncorrectShoultresultFalse(){
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(CSV_FILE_Extension_PATH);
            Assert.assertEquals(29, numOfRecords);
        } catch (CensusAnalyserException | IOException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.WRONG, e.getStackTrace());
        }
    }
}
