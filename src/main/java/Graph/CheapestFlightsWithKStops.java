package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Flight{
    int destination;
    int cost;

    public Flight(int destination, int cost) {
        this.destination = destination;
        this.cost = cost;
    }
}
class FlightDetails{
    int nextCity;
    int stops;
    int cost;

    public FlightDetails(int nextStop, int stops, int cost) {
        this.nextCity = nextStop;
        this.stops = stops;
        this.cost = cost;
    }
}
public class CheapestFlightsWithKStops {

    private static int getCheapestFlight(int cities, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Flight>> adjLst=new ArrayList<>();
        for (int i = 0; i < cities; i++) {
            adjLst.add(new ArrayList<>());
        }
        for (int[] it:flights){
            adjLst.get(it[0]).add(new Flight(it[1],it[2]));
        }
        int[] ticketCost=new int[cities];
        Arrays.fill(ticketCost,(int) 1e9);
        ticketCost[src]=0;
        PriorityQueue<FlightDetails> queue=new PriorityQueue<>((a, b) ->a.cost-b.cost );
        queue.add(new FlightDetails(src,-1,0));

        while (!queue.isEmpty()){
            FlightDetails flightDetails=queue.poll();
            int city=flightDetails.nextCity;
            int steps=flightDetails.stops;
            int cost=flightDetails.cost;
            if (city==dst && steps<=k){
                return cost;
            }
            for (Flight details:adjLst.get(city)){
                int nextCity=details.destination;
                int price=details.cost;
                if (cost+price < ticketCost[nextCity]){
                    ticketCost[nextCity]=cost+price;
                    queue.add(new FlightDetails(nextCity,steps+1,cost+price));
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int cities=4;
        int[][] flights={
                {0,1,100},
                {1,2,100},
                {2,0,100},
                {1,3,600},
                {2,3,200}
        };
        int src=1;
        int dest=3;
        int k=3;
        System.out.println(getCheapestFlight(cities,flights,src,dest,k));
    }
}
