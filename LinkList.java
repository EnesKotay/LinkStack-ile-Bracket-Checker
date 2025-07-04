    public class LinkList {
        private Link head;
        public LinkList(){
            head=null;
        }
        public boolean isEmpty(){
            return (head==null);
        }
        public void insertFirst(long d){
            Link newLink=new Link(d);
            newLink.next=head;
            head=newLink;
        }
        public long deleteFirst(){
            Link temp=head;
            head=head.next;
            return temp.data;
        }
        public long displayHead(){
            return head.data;
        }
        public void displayList(){
            Link curret=head;
            while (curret!=null){
                curret.displayLink();
                curret=curret.next;
            }
        }

    }


