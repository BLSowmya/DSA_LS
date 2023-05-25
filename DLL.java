public class DLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
         }
         public Node(){
            this.data=data;
            this.next=null;
            this.prev=null;
         }
    }
    
    Node head;
    Node tail;

    public void addEle(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           return;
        }else{
           newNode.next=head;
           head.prev=newNode;
           newNode.prev=null;
           head=newNode;
        }
      }

    public void addLast(int data){
        Node newOne=new Node(data);
        Node fortail=head;
        if(head==null){
           head=newOne;
           tail=newOne;
           return;
        }else{
          while(fortail.next !=null){
           
           fortail=fortail.next;
          }
          newOne.prev=fortail;
          fortail.next=newOne;
          newOne.next=null;
          tail=newOne;
        }
      }
      public void insert(int data,int ind){
        Node newOne=new Node(data);
        Node temp=head;
        for(int i=1;i<ind;i++){
          temp=temp.next;
        }
        temp.next.prev=newOne;
        newOne.next=temp.next;
        temp.next=newOne;
        newOne.prev=temp;
      }
      public void printLast(){
        Node temp=head;
        Node last=temp;
        while(temp!=null){
          last=temp;
          temp=temp.next;
        }

        while(last!=null){
          System.out.print(last.data+"<-");
          last=last.prev;
        }
      }

      public void printEle(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
       }


    public static void main(String[] args) {
        DLL item=new DLL();
        item.addEle(10);
        item.addLast(20);
        item.addLast(30);
        item.addLast(40);
        item.insert(25, 2);
        item.printEle();
        //item.printLast();
    }
}
