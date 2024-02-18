package dev.eva;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DaysManagerTest {

    private DaysManager daysManager;

    @BeforeEach
    public void setUp(){
        daysManager = new DaysManager();
        daysManager.createWeekDays();
    }

    @Test
    public void testGetWeekDays(){
        List<String> expectedDays = Arrays.asList(         
        "Lunes",
            "Martes",
            "Miércoles",
            "Jueves",
            "Viernes",
            "Sábado", 
            "Domingo"
        );
        List<String> actualDays = daysManager.getWeekDays();
        assertEquals(expectedDays, actualDays);
    }

    @Test
    public void testGetWeekDaysLength(){        
        assertEquals(7, daysManager.getWeekDaysLength());
    }

    @Test
    public void testRemoveDay(){
        daysManager.removeDay("Lunes");
        assertFalse(daysManager.dayExits("Lunes"));
    }

    @Test
    public void testGetDay(){
        assertEquals("Martes",daysManager.getDay(1));
    }

    @Test
    public void testDayExits(){
        assertTrue(daysManager.dayExits("Miércoles"));
        assertFalse(daysManager.dayExits("Juernes"));
    }

    @Test 
    public void testSortDaysAlphabeticalOrder(){
        daysManager.sortDaysAlphabeticalOrder();
        List<String> sortDays = Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes");
        assertEquals(sortDays, daysManager.getWeekDays());
    }

    @Test public void testClearList(){
        daysManager.clearList();
        assertTrue(daysManager.getWeekDays().isEmpty());
    }
}




