package com.austinzeller.tsunami;

class Event {

    /** Title of the earthquake event */
    final String title;

    /** Time that the earthquake happened (in milliseconds) */
    final long time;

    /** Whether or not a tsunami alert was issued (1 if it was issued, 0 if no alert was issued) */
    final int tsunamiAlert;

    /**
     * Constructs a new {@link Event}.
     *
     * @param eventTitle is the title of the earthquake event
     * @param eventTime is the time the earthquake happened
     * @param eventTsunamiAlert is whether or not a tsunami alert was issued
     */
    Event(String eventTitle, long eventTime, int eventTsunamiAlert) {
        title = eventTitle;
        time = eventTime;
        tsunamiAlert = eventTsunamiAlert;
    }
}
