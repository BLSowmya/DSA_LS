
public class LL{
   public class Node{
      int value;
      int size=0;
      Node next;
      public Node(){  
         this.value=value;
         this.next=null;
        }
     
     public Node(int value){  
      this.value=value;
      this.next=null;
     }
  }
    Node head;
    Node tail;
    int size=0;

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
        fortail.next=newOne;
        tail=newOne;
      }

    }
   public void insert(int data,int inds){
      Node newNode=new Node(data);
      Node temp=head;
      for(int i=0;i<inds;i++){
        temp=temp.next;
      }
      newNode.next=temp.next;
      temp.next=newNode;
   }   
   public void addEle(int data){
      Node newNode=new Node(data);
      if(head==null){
         head=newNode;
         return;
      }else{
         newNode.next=head;
         head=newNode;
      }
    }
    public void delFirst(){    
      head=head.next;
    }
    public void delLast(){
      Node templast=head.next;
      Node last=head;
      while(templast.next!=null){
         templast=templast.next;
         last=last.next;
      }
      last.next=null;
      tail=last;
    }
    public void delAt(int val){
       Node curr=head.next;
       Node seCurr=head;
      for(int i=0;i<val-1;i++){
         curr=curr.next;
         seCurr=seCurr.next;
      }
      seCurr.next=curr.next;

    }
   public void printEle(){
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.value+"->");
          temp=temp.next;
      }
      System.out.println("null");
     }
public static void main(String[] args) {
    LL item=new LL();
    item.addEle(10);
    item.addEle(20);
    item.addEle(30);
    item.addLast(50);
    item.insert(22, 2);
    //item.delFirst();
    //item.delLast();
    item.delAt(1);
    item.printEle();
   }
}
