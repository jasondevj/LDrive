package com.jasondevj.ldrive.watcher;

import com.jasondevj.ldrive.entity.RemoteChangeEvent;

public interface RemoteWatcher {

    void changed(RemoteChangeEvent remoteChangeEvent);
}
