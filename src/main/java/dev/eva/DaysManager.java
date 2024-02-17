package dev.eva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysManager {
    
    private List<String> weekDays;

    
    //Constructor
    public DaysManager() {
        this.weekDays = new ArrayList<>();
    }

    //Método para crear la lista de los días de la semana
    public void weekDays() {
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miércoles");
        weekDays.add("Jueves");
        weekDays.add("viernes");
        weekDays.add("Sábado");
        weekDays.add("Domingo");        
    }

    //Método que retorna los días de la semana
    public List<String> getWeekDays(){
        return weekDays;
    }

    //Método que retorna el largo de la lista
    public int getWeekDaysLength() {
        return weekDays.size();
    }

    //Método para eliminar un día de la semana
    public void removeDay(String day) {
        weekDays.remove(day);
    }

    //Método que retorna el día de la semana solicitado
    public String getDay(int day) {
        return weekDays.get(day);
    }

    //Método que retorne si el día solicitado existe en la lista
    public boolean dayExits(String day) {
        return weekDays.contains(day);
    }
    
    //Método para ordenar la lista de días por orden alfabético
    public void sortDaysAlphabeticalOrder() {
        Collections.sort(weekDays);
    }
    
    //Método para vaciar la lista
    public void clearList() {
        weekDays.clear();
    }
}
