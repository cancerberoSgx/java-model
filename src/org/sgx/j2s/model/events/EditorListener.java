package org.sgx.j2s.model.events;

import org.sgx.j2s.model.events.EditorEvent;
import org.sgx.j2s.model.events.Event;
import org.sgx.j2s.model.events.EventListener;

public abstract class EditorListener<T> implements EventListener{
	public abstract void notifyValueChanged(T val);

	public void notifyEvent(Event e) {
		if(e instanceof EditorEvent)
			notifyValueChanged(((EditorEvent<T>)e).getValue());
	}
}
