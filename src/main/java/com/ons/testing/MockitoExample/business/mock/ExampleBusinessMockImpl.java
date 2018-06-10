package com.ons.testing.MockitoExample.business.mock;

import com.ons.testing.MockitoExample.business.DataService;

/**
 * Created by tobinj on 10/06/2018.
 */
public class ExampleBusinessMockImpl {
    // Dependency on this Data Service
    private DataService dataService;

    public ExampleBusinessMockImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData(){
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


