class Main{
    public static void main(String[] args) {
        Link st1 = new Link("Nipuna", 53.5);
        Link st2 = new Link("Aravinda", 78.0);
        Link st3 = new Link("Prashani", 69.5);
         
        st1.next =st2;
        st2.next=st3;
        st3.next=null;


        st1.display();
        st1.next.display();
        st1.next.next.display();

        

    }
}