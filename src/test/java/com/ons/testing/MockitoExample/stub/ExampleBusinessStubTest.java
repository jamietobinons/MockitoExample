package com.ons.testing.MockitoExample.stub;

import com.ons.testing.MockitoExample.business.DataService;
import com.ons.testing.MockitoExample.business.stub.ExampleBusinessStubImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tobinj on 10/06/2018.
 */
public class ExampleBusinessStubTest {

    @Test
    public void testFindGreatestFromAllData() {


        ExampleBusinessStubImpl businessImpl
                = new ExampleBusinessStubImpl(new DataServiceStub());

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

