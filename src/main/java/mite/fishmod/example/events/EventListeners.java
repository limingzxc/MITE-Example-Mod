package mite.fishmod.example.events;

import net.xiaoyu233.fml.reload.event.MITEEvents;

public class EventListeners {
    public static void registerAllEvents() {
        MITEEvents.MITE_EVENT_BUS.register(new MITEModEvents());
    }
}
