import java.util.*;
import java.io.*;
public class SeatReserve {
    public static List<Integer> reserveSeats(int N, int K, int[] seats) {
        List<Integer> reservedSeats = new ArrayList<>();
        TreeSet<Integer> unreservedSeats = new TreeSet<>();
        for (int i = 1; i <= N; i++) {
            unreservedSeats.add(i);
        }

        for (int i = 0; i < K; i++) {
            if (seats[i] == 0) {
                int seatNumber = unreservedSeats.pollFirst();
                reservedSeats.add(seatNumber);
            } else {
                unreservedSeats.add(seats[i]);
            }
        }

        return reservedSeats;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of seats
        int K = scanner.nextInt(); // Number of operations
        int[] seats = new int[K];
        for (int i = 0; i < K; i++) {
            seats[i] = scanner.nextInt();
        }
        
        List<Integer> result = reserveSeats(N, K, seats);
        for (int seat : result) {
            System.out.print(seat + " ");
        }
    }
}
