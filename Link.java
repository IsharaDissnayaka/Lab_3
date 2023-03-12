class Link{
    public String  name;
    public double Avarage;
    public Link  next;

    public Link(String  name,double Avarage ){
        this.name=name;
        this.Avarage=Avarage;
        next=null;
    }

    public void display(){
        System.out.println("Name is :- "+name);
        System.out.println("Avarage is :- "+Avarage);
    }


}