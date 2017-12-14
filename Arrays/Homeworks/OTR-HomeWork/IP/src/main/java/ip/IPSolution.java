package ip;

import java.util.Scanner;

public class IPSolution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый адрес:");
        String ipBegin = scanner.next();
        long first = IpToInt(ipBegin);
        System.out.println("Введите конечный адрес");
        String ipEnd = scanner.next();
        long end = IpToInt(ipEnd);
        while (first < end - 1) {
            first++;
            System.out.println(intToIp(first));
        }
    }

    public static String intToIp(long value) {
        return ((value >> 24) & 0xFF) + "."
                + ((value >> 16) & 0xFF) + "."
                + ((value >> 8) & 0xFF) + "."
                + (value & 0xFF);
    }

    public static long IpToInt(String ip) {
        Long ipAsInt = Long.valueOf(0);
        for (String s : ip.split("\\."))
            ipAsInt = ipAsInt * 256 + Integer.parseInt(s);
        return ipAsInt;
    }
}
