package com.projsisdis.andre;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements InterfaceMonitor {

    protected Server() throws RemoteException {
        super();
    }

    @Override
    public String getMonitorData(RAMMonitorMessage ramData) throws RemoteException {
        return ramData.getRAMMessage();
    }

    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            System.out.println("Registry on port 1099");
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        try {
            Server server = new Server();
            java.rmi.Naming.rebind("//localhost/rammonitor", server);
            System.out.println("RMI server listening...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}