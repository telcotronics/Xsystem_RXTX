package com.xsystem.events;

import com.xsystem.Xsystem_DataBuffer;
import java.util.EventObject;

public class DataInsertionEvent extends EventObject {
    Xsystem_DataBuffer buffer;

    public DataInsertionEvent(Object source, Xsystem_DataBuffer buffer) {
        super(source);
        this.buffer = buffer;
    }
}