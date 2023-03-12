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
         newly.next= First.next;
         First.next=newly;
         return true;
    }

    public Link DeleteFirst(){
        Link temp = First;
        First=First.next;
        return  temp;
    }

}
