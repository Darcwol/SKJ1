import com.oracle.jrockit.jfr.management.FlightRecorderMBean;
import com.oracle.jrockit.jfr.management.FlightRecordingMBean;
import com.sun.applet2.Applet2;
import com.sun.jmx.snmp.daemon.CommunicatorServerMBean;
import sun.plugin2.jvm.ProcessLauncher;

import javax.management.monitor.MonitorMBean;
import javax.swing.text.html.HTMLDocument;
import java.net.Socket;
import java.util.HashMap;
import java.util.regex.MatchResult;

public class PortMapperThread extends Thread {
    private Socket client;
    HashMap<String, String>
    public PortMapperThread(Socket client) {
        super();
        this.client = client;
    }

    @Override
    public void run() {

    }
}
