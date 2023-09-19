
package com.xsystem.events;

import java.util.EventListener;

public interface DataInsertionListener extends EventListener {

    public abstract void onDataInsertion(DataInsertionEvent ev);

}