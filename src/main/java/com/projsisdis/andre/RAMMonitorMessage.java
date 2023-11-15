package com.projsisdis.andre;

import java.io.Serializable;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RAMMonitorMessage implements Serializable {

    public String getRAMMessage() {

        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        LocalDateTime currentDateTime = LocalDateTime.now();

        long usedHeapMemory = heapMemoryUsage.getUsed();
        long maxHeapMemory = heapMemoryUsage.getMax();

        DateTimeFormatter dateTimeNow = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedTimestamp = currentDateTime.format(dateTimeNow);
        String heapText = "\nUsed Heap Memory: " + usedHeapMemory + " bytes";
        String maxHeapText = "\nMax Heap Memory: " + maxHeapMemory + " bytes\n";

        return "\n" + formattedTimestamp + heapText + maxHeapText;
    }
}