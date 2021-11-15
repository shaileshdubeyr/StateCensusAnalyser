package com.csvandjson;

import com.opencsv.CSVReader;
import java.io.*;

public class CensusAnalyserException extends Exception{
    public  ExceptionType type;

    public enum ExceptionType {
        CENSUS_FILE_PROBLEM, CSV_FILE_INTERNAL_ISSUES,WRONG;
    }

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
    /*int counter = 0;

    public CensusAnalyserException(String wrong_file_input) {
        super(wrong_file_input);
    }

    public void custonException(String filePath)  {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(filePath));
            String[] row;
            counter++;
            while ((row = csvReader.readNext()) != null) {
                String[] data = row;
                System.out.println("the data is " + data[0]+","+data[1]+","+data[2]+","+data[3]);
                counter++;
            }

        }
        catch (Exception e){
            new CensusAnalyserException("with me guys ");
            System.out.println(e.getMessage());

        }
    }*/
}
