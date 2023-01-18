import java.util.Arrays;

import static java.util.List.copyOf;

public class LotteryTickets {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;
        printTicketNumbers(ticket, "Ticket 1");
        printTicketNumbers(ticket2, "Ticket 2");
    }

    public static void printTicketNumbers(int[] ticket, String ticketType) {
        System.out.print(ticketType + " numbers: ");
        for(int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.print("\n\n");
    }
}
