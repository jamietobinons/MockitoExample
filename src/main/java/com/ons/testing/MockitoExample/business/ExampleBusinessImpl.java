package com.ons.testing.MockitoExample.business;

/**
 * Created by tobinj on 10/06/2018.
 */
public class ExampleBusinessImpl {
    // Dependency on this Data Service
    private DataService dataService;

    int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for(int value : data){
            if (value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}


