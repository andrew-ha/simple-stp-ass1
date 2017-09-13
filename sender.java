import java.io.*;
import java.net.*;

public class Sender {

    public static void main(String[] args) {
        
        // Parsing arguments into variables
        InetAddress receiver_host_ip = InetAddress.getByName(args[0]);
        int receiver_port = Integer.parseInt(args[0]);
        String input_file = args[2];
        int max_win_size = Integer.parseInt(args[3]);
        int max_seg_size = Integer.parseInt(args[4]);
        int timeout = Integer.parseInt(args[5]);
        float pdrop = Float.parseFloat(args[6]);
        int seed = Integer.parseInt(args[7]);

    }

}