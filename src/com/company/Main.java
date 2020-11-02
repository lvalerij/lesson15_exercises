package com.company;

import com.company.package1.Client2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Client> clients = new ArrayList<>();
        //Client client1 = new Client();
        //client1.
        clients.add(new Client("John", "Connor",10000, false));
        clients.add(new Client("T1000", "T1000",27000, true));
        clients.add(new Client("Sarah", "Connor",80000, true));
        clients.add(new Client("Marty", "McFly",146000, false));
        clients.add(new Client("Emmett", "Brown",12000, true));
        clients.add(new Client("Biff", "Tannen",500000, true));
        //Count how many people took loan in the amount of greater than 50000
        //1.find clients that >= 50000 and filter them
        //2.count elements
        long count = clients.stream().
                filter((client) -> client.loanAmount>=50000).count();
//        long count = clients.stream().
//                filter(Client -> Client.loanAmount>=50000).count();
        System.out.println(count);
        //Make list of people’s surname in alphabetic order that took loan greater than 10000
        //1. find all clients with loans >=10000
        //2. from clients take surnames

//        List<Client> modifiedClients = clients.stream().
//                filter((client) -> client.loanAmount>=10000).
//

    }
}
