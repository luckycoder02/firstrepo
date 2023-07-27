
import java.util.Random ;
class Event {
    double time ;
    String eventType ;
    Event next ;
    Event(double d, String s){
        time = d ;  
        eventType = s ;
        next = null ;
    }
} 

class LinkedList {
    Event head ;
    public static LinkedList insert(LinkedList list, double data, String s){
        Event event = new Event(data, s) ;
        if(list.head == null){
            list.head = event ;
        }
        else {
            Event last = list.head ;
            while(last.next != null){
                last = last.next ;
            }
            last.next = event ;
        }
        return list ;
    }
        
    public static void printList(LinkedList list){
        Event currEvent = list.head ;
        System.out.println("LinkedList : ") ;
        while(currEvent != null) {
            System.out.println(currEvent.time + "  " + currEvent.eventType) ;
            currEvent = currEvent.next ;
        }
    }
}

public class Simulation
{
	public static void main(String[] args) {
		// System.out.println("Hello World");
		
		prepareLinkedList p = new prepareLinkedList() ;
        LinkedList list1 = p.returnLinkedList1() ;
        LinkedList list2 = p.returnLinkedList2() ;
        LinkedList list3 = p.returnLinkedList3() ;
        LinkedList list5 = p.returnLinkedList5() ;
        
        LinkedList.printList(list1) ;
        System.out.println("-----------------------------------------------") ;
        LinkedList.printList(list2) ;
        System.out.println("-----------------------------------------------") ;
        LinkedList.printList(list3) ;
        System.out.println("-----------------------------------------------") ;
        LinkedList.printList(list5) ;

        // LinkedList m1 = merge(list1, list2) ;
        // LinkedList m2 = merge(list3, list5) ;
        // LinkedList m3 = merge(m1, m2) ;
        
        // LinkedList.printList(m3) ;
         
	}

public static LinkedList merge(LinkedList list01, LinkedList list02) {
        LinkedList mergedList = null;
        if(list01 == null) {
            return list02;
        }
        if(list02 == null) {
            return list01;
        }

        while()

        // if(list01.head.time < list02.head.time) {
        //     //point to smaller element
        //     mergedList = list01;         
        //     mergedList.head.next = merge(list01.head.next, list02);
        // } else { 
        //     //head1 is large, so pass h
        //     //point to smaller element
        //     mergedList = head2;
        //     //head2 is already consider
        //     //now process next node of head2
        //     mergedList.next = merge(head1, head2.next);
        // }
        return mergedList;
}


class prepareLinkedList{
    LinkedList list1 ; LinkedList list2 ;
    LinkedList list3 ; LinkedList list5 ;
    prepareLinkedList(){
        list1 = new LinkedList() ;
        list2 = new LinkedList();
	    list3 = new LinkedList() ;
	    list5 = new LinkedList() ;

        Random r = new Random() ;
        double curr , prev = 0 ;
        for(int i=0; i<10; i++){
            curr = r.nextDouble() ; 
            curr += prev ;
            list1 = LinkedList.insert(list1, curr, "E1") ;
            prev = curr ;
        }
	    for(int i=11; i<20; i++){
            curr = r.nextDouble() ; 
            curr += prev ;
            list2 = LinkedList.insert(list2, curr, "E2") ;
            prev = curr ;
        }
	
	    for(int i=21; i<30; i++){
            curr = r.nextDouble() ; 
            curr += prev ;
            list3 = LinkedList.insert(list3, curr, "E3") ;
            prev = curr ;
        }
	    for(int i=31; i<40; i++){
            curr = r.nextDouble() ; 
            curr += prev ;
            list5 = LinkedList.insert(list5, curr, "E4") ;
            prev = curr ;
        }
    }
    
    LinkedList returnLinkedList1(){
        return list1 ;
    }
	
    LinkedList returnLinkedList2(){
        return list2 ;
    }
    LinkedList returnLinkedList3(){
        return list3 ;
    }
    LinkedList returnLinkedList5(){
        return list5 ;
    }
} 
