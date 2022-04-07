
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 001001895
 */
public class operatingHours {
    
    private Date weekday;
    private Date timeOpen;
    private Date timeClosed;

    public operatingHours(Date weekday, Date timeOpen, Date timeClosed) {
        this.weekday = weekday;
        this.timeOpen = timeOpen;
        this.timeClosed = timeClosed;
    }

    public Date getWeekday() {
        return weekday;
    }

    public void setWeekday(Date weekday) {
        this.weekday = weekday;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Date getTimeClosed() {
        return timeClosed;
    }

    public void setTimeClosed(Date timeClosed) {
        this.timeClosed = timeClosed;
    }
    
}
