package com.ons.testing.MockitoExample;

import com.ons.testing.MockitoExample.business.DataService;
import com.ons.testing.MockitoExample.business.ExampleBusinessImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tobinj on 10/06/2018.
 */
public class ExampleBusinessImplTest {


    @Test
    public void testFindGreatestFromAllData() {


        ExampleBusinessImpl businessImpl
                = new ExampleBusinessImpl(new DataServiceStub());

        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(30, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {10, 20, 30};
    }
}

