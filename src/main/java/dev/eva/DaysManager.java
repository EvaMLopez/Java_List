package dev.eva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysManager {
    
    private List<String> weekDays;
    
    public DaysManager() {
        this.weekDays = new ArrayList<>();
    }

    public void createWeekDays() {
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miércoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sábado");
        weekDays.add("Domingo");        
    }

    public List<String> getWeekDays(){
        return weekDays;
    }

    public int getWeekDaysLength() {
        return weekDays.size();
    }

    public void removeDay(String day) {
        weekDays.remove(day);
    }

    public String getDay(int day) {
        return weekDays.get(day);
    }

    public boolean dayExits(String day) {
        return weekDays.contains(day);
    }
    
    public void sortDaysAlphabeticalOrder() {
        Collections.sort(weekDays);
    }
    
    public void clearList() {
        weekDays.clear();
    }
}
