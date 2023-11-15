package com.projsisdis.andre;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            InterfaceMonitor serverRAMMonitor = (InterfaceMonitor) Naming.lookup("//localhost/rammonitor");
            RAMMonitorMessage message = new RAMMonitorMessage();
            System.out.println(serverRAMMonitor.getMonitorData(message));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}