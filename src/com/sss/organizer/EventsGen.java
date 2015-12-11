package com.sss.organizer;

import java.util.ArrayList;
import java.util.List;

public class EventsGen {
    public static List<String> events(){
        List<String> event = new ArrayList<String>();
            event.add("Футбольний матч");
            event.add("Модуль");
            event.add("Репетитор з англійської");
            event.add("Спортзал");
            event.add("Зустріч з друзями");
        return event;
    }
    public static List<String> tasks() {
        List<String> task = new ArrayList<String>();
        task.add("Підготуватися до модуля");
                task.add("Прибрати в домі");
                task.add("Сходити в магазин");
                task.add("Викинути сміття");
                task.add("Помити посуд");
        return task;
    }
    public static List<String> notes(){
        List<String> note = new ArrayList<String>();
            note.add("День народження у Васі");
            note.add("Новорічні свята");
            note.add("День народження мами");
        return note;
    }
}
