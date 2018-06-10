package com.ons.testing.MockitoExample.mock;

import com.ons.testing.MockitoExample.business.DataService;
import com.ons.testing.MockitoExample.business.mock.ExampleBusinessMockImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by tobinj on 10/06/2018.
 */
public class ExampleBusinessMockTest {

    @Test
    public void testFindGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);

        //dataServiceMock.retrieveAllData() => new int[] {10, 20, 30}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {10, 20, 30});

        ExampleBusinessMockImpl businessImpl = new ExampleBusinessMockImpl(dataServiceMock);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(30, result);
    }

    @Test
    public void testFindGreatestFromAllDataForOneValue() {
        DataService dataServiceMock = mock(DataService.class);

        //dataServiceMock.retrieveAllData() => new int[] {10, 20, 30}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        ExampleBusinessMockImpl businessImpl = new ExampleBusinessMockImpl(dataServiceMock);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {10, 20, 30};
    }
}

