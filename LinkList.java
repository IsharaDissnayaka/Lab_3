public class LinkList {
    private Link First;

    public  LinkList(){
        First =null;
    }

    private boolean isEmpty(){
        return(First==null);
    }


    public void DisplayaLinkList(){
        Link cur = First;
        while(cur != null){
            cur.display();
            cur = cur.next;
        }
    }

    public boolean FirstInsert(String name , double avag){
        Link newly = new Link(name, avag);
         newly.next= First;
         First=newly;
         return true;
    }

    public Link DeleteFirst(){
        Link temp = First;
        First=First.next;
        return  temp;
    }

    public Link DeleteFind(String name){
        Link curr = First;
        Link prew =First;
        if(curr.next==null){
            return null;
        }


        while(! curr.name.equals(name)){
            prew=curr;
            curr=curr.next;     
        }

        prew.next=curr.next;

        if(curr ==First){
            First=First.next;
        }else{
            prew.next=curr.next;
        }

        return curr;
          

    }

    

}
