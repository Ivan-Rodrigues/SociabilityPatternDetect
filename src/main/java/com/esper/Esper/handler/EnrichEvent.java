package com.esper.Esper.handler;

import com.esper.Esper.model.SocialEvent;
import com.esper.Esper.model.SocialUpdate;
import com.esper.Esper.util.ParametersUtil;
import com.esper.Esper.util.SlotUtil;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//@Component
public class EnrichEvent {

    /** The EventHandler - wraps the Esper engine and processes the Events  */
    //@Autowired

    private SocialUpdate socialUpdate;

    /**
     * Extract time slot.
     * @param event the event to handle
     */
    public SocialUpdate extractContextData(SocialUpdate event, Date dateTime){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateTime);
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String day = dfs.getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
        String week = (dateTime.getDay() >= 6) | (dateTime.getDay()==0)? "Weekend" : "Week";
        return new SocialUpdate(ParametersUtil.UID, dateTime,"Interaction",event.getSlot(), day, week,"All");
    }

    public SocialUpdate enrichSocialEvent(SocialEvent event) {
        int slot = SlotUtil.extractSlotTime(event, ParametersUtil.PARAM_SLOT);
        socialUpdate = new SocialUpdate();
        socialUpdate.setSlot(slot);
        socialUpdate = extractContextData(socialUpdate, event.getStartTime());
        return socialUpdate;
    }

}
