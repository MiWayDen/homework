package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val tickets = scanner.nextInt()
    print("How many round-trip tickets:  ")
    val round = scanner.nextInt()
    var ticket = ticketcount(tickets,round)
    ticket.print()

}


class ticketcount(var alltickets:Int,var roundtrip:Int) {
    val oneway = 1000;
    val round = 1800;
    val total = (alltickets-roundtrip)*oneway+roundtrip*round
    fun print(){
        println("Total tickets: $alltickets")
        println("Round-trip: $roundtrip")
        println("Total: $total")
        println("Total tickets: $alltickets"+"\n"+"Round-trip: $roundtrip"+"\n"+"Total: $total")

    }
}