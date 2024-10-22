package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList mockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = mockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = mockCityList();
        assertFalse(list.hasCity(new City("Estevan", "SK")));
        list.addCity(new City("Estevan", "SK"));
        assertTrue(list.hasCity(new City("Estevan", "SK")));
    }

    @Test
    public void deleteCityTest() {
        list = mockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertTrue(list.hasCity(new City("Estevan", "SK")));
        list.deleteCity(new City("Estevan", "SK"));
        assertFalse(list.hasCity(new City("Estevan", "SK")));
    }
}
