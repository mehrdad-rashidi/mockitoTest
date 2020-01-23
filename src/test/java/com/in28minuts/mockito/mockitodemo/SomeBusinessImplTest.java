package com.in28minuts.mockito.mockitodemo;


import org.junit.jupiter.api.Test        ;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {
    @Test
    public void TestFindGreatestFromAllData(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStob());
        int result  = someBusiness.findTheGreatestFromAllData();
        assertEquals(24,result);


    }

}
  class DataServiceStob implements DataService{
    @Override
    public int[] retrieveAllData(){
        return new int[]{24,6,15};
    }
 }