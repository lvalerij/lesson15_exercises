package com.company;

import com.company.package1.Client2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Solution {

    public static void main(String[] args) {
	// write your code here

        List<Client2> clients = new ArrayList<>();
        clients.add(new Client2("John", "Connor",10000, false));
        clients.add(new Client2("T1000", "T1000",27000, true));
        clients.add(new Client2("Sarah", "Connor",80000, true));
        clients.add(new Client2("Marty", "McFly",146000, false));
        clients.add(new Client2("Emmett", "Brown",12000, true));
        clients.add(new Client2("Biff", "Tannen",500000, true));

        long count = clients.stream().filter(c->c.longAmount>50000).count();
        System.out.println(count);

        List<String> surnames = clients.stream().filter(c->c.longAmount>10000).
                map(c->c.surname).sorted().collect(Collectors.toList());
        System.out.println(surnames);

        int totalAmount =  clients.stream().filter(c->c.longAmount>75000&&c.isOverDue).map(c->c.longAmount).
                reduce(0,(a,e)->a+e);
        System.out.println(totalAmount);
    }
}
