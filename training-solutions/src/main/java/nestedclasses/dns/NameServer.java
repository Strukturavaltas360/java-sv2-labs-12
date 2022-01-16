package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    List<DnsEntry> dnsEntryList = new ArrayList<DnsEntry>();

    public static class DnsEntry {
        private String name;
        private String ipAddress;

        public DnsEntry(String name, String ipAddress) {
            this.name = name;
            this.ipAddress = ipAddress;
        }
    }

    public void addEntry(String hostName, String hostIp) {
        for (DnsEntry s: dnsEntryList) {
            if (hostName.equals(s.name) || hostIp.equals(s.ipAddress)) {
                throw new IllegalArgumentException("Already exists");
            }
        }
        dnsEntryList.add(new DnsEntry(hostName,hostIp));
    }

    public void removeEntryByName(String hostName) {
        for (DnsEntry s: dnsEntryList) {
            if (s.name.equals(hostName)) {
                dnsEntryList.remove(s);
                return;
            }
        }
    }

    public void removeEntryByIp(String hostIp) {
        for (DnsEntry s: dnsEntryList) {
            if (s.ipAddress.equals(hostIp)) {
                dnsEntryList.remove(s);
                return;
            }
        }
    }

    public String getIpByName(String hostName) {
        for (DnsEntry s: dnsEntryList) {
            if (s.name.equals(hostName)) {
                return s.ipAddress;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp) {
        for (DnsEntry s: dnsEntryList) {
            if (s.ipAddress.equals(hostIp)) {
                return s.name;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
