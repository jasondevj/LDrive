package com.jasondevj.ldrive.monitor;

import com.jasondevj.ldrive.watcher.LocalWatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

@Service
public class LocalChangeMonitor {

    private static final Logger logger = LogManager.getLogger(LocalChangeMonitor.class);

    private LocalWatcher localWatcher;
    @Value("${local.file.path}")
    private String localFilePath;

    public LocalChangeMonitor(LocalWatcher localWatcher) {
        this.localWatcher = localWatcher;
    }

    @EventListener(ApplicationEvent.class)
    public void monitor() {
        Path paths = Paths.get(localFilePath);
        Path fileName = paths.getFileName();
        logger.info(fileName.toAbsolutePath().toFile().getAbsolutePath());
        for (Path aPath : paths) {
            logger.info(aPath.getFileName());
        }
    }
}
