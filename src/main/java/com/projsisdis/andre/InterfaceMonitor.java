package com.projsisdis.andre;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMonitor extends Remote {
    String getMonitorData(RAMMonitorMessage ramData) throws RemoteException;
}