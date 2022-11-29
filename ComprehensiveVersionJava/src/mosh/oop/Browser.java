package mosh.oop;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
    }

    private String sendHttpRequest(String ip) {
        return "<html>" + ip + "</html>";
    }

    private String findIpAddress(String address) {
        return "195.50.65.2";
    }
}
