* always remember to reduce size ,or size++
* allocate memory, set newnode.next=null,set value of newnode,

Q] remove:
        temp.next=temp.next.next 



Q] rever using swap: we can swap using getdata()
        lf=getData(left)
        rtgetData(right);
        swap(lf,rt)
  
Q] Merge SortedList
        addLast()===> 
        size++
                
Q]Remove duplicate:
     getFirst();
   rd=  removeFirst();
     if(size== 0|| reasultList.tail.data!=getFirst())
             resultList.addLast(rd);



Q]Reverse Poineter [prev,curr, fwd]

while(curr!=null)
        Node fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd
* dont forget to interchange tail with head


 
