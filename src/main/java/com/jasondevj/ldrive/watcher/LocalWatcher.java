package com.jasondevj.ldrive.watcher;

import com.jasondevj.ldrive.entity.LocalChangeEvent;

public interface LocalWatcher {

    void changed(LocalChangeEvent localChangeEvent);
}
