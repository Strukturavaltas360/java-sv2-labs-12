package stringmethods.filename;

public class UrlManager {

    String url;
    String protocol;
    int port;
    String host;
    String path;
    String query;

    public UrlManager(String url) {

        this.url = url;
    }

    public String getProtocol() {
        int i = url.indexOf(":");
        protocol = url.substring(0,i).toLowerCase();;
        return protocol;
    }

    public int getPort() {
        int i = protocol.length()+3;
        i = i + getHost().length()+1;
        int j = url.indexOf("/",i);
        port = Integer.parseInt(url.substring(i,j));
        return port;
    }

    public String getHost() {

        int i = protocol.length()+3;
        int j = url.indexOf(":",i);
        if (j <0) {
            j = url.indexOf("/",i);
        }
        host = url.substring(i,j).toLowerCase();
        return host;
    }

    public String getPath() {

        int i = protocol.length()+3+host.length()+1+ Integer.toString(getPort()).length()+1;
        int j = url.indexOf("?",i);
        if (j<0) {
            path =url.substring(i);
            return path;
        }
        path = url.substring(i,j);
        query = url.substring(j+1);
        System.out.println(query);
        return path;
    }

    public boolean hasProperty(String property){
       property += "=";

       return query.contains(property) ? true : false;
    }

    public String getProperty(String key) {

        if (hasProperty(key) == true) {
            int i = query.indexOf(key) + key.length()+1;
            int j = query.indexOf("&",i);
            if (j<0) { j= query.length(); }
            String value = query.substring(i,j);
            return key +"="+ value;
        }
        return null;
    }

    public static void main(String[] args) {
        String url = "https://earthquake.usgs.gov:460/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPort());
        System.out.println(urlManager.getPath());

        System.out.println(urlManager.hasProperty("endtwime"));
        System.out.println(urlManager.getProperty("format"));
        System.out.println(urlManager.getProperty("endtime"));
        System.out.println(urlManager.getProperty("starttime"));

    }
}
