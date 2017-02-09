
package com.psl.day6;



/**
 *
 * 
 */
public class Linkedlist<E> implements MyInterface<E> {

    private Node<E> start,end,t1;
    private int size;


    public Linkedlist() {
        start=null;
        end=null;
        size=0;
    }

    public Linkedlist(Node<E> start, Node<E> end, int size) {
        this.start = start;
        this.end = end;
        this.size = size;
    }
    
    public void add(E ele){
        Node<E> n= new Node<E>(ele, null);
        size++;
        if(start==null){
            start=n;
            t1=start;
            end=start;
        }
        else{
           // end=start;
            n.setLink(start);
            start=n;
            
        }
        t1=start;
        
    }
    
    public void remove(E ele){
              if(start.getData().equals(ele)){
                  start= start.getLink();
                  size--;
                  return;
              }
              else if(end.getData().equals(ele)){
                  Node<E> s=start, t=start;
                  while(!(s.equals(end))){
                      t=s;
                      s=s.getLink();
                  }
                  end=t;
                  end.setLink(null);
                  size--;
                  return;
              }
              Node<E> s=start;
              for(int i=1;i<size-1;i++){
                  if(s.getLink().getData().equals(ele)){
                      Node tmp= s.getLink();
                      tmp=tmp.getLink();
                      s.setLink(tmp);
                      break;
                  }
                  s=s.getLink();
              }
              size--;
    }
    public void change(E oldele,E newele){
        
              if(start.getData().equals(oldele)){
                  start.setData(newele);
                  return;
              }
              else if(end.getData().equals(oldele)){
                  end.setData(newele);
                  return;
              }
              Node<E> s=start;
              for(int i=1;i<size-1;i++){
                  if(s.getLink().getData().equals(oldele)){
                      s.getLink().setData(newele);
                      break;
                  }
                  s=s.getLink();
              }
             
        
    } 
    public int size(){
        return size;
    }

    @Override
    public boolean hasNext() {
        
        return !(t1.equals(end.getLink()));
    }

    @Override
    public void reset() {
    start=null;
    end=null;
    size=0;
    t1=null;
    }

    @Override
    public E get() {
         E e=null;
    if(hasNext()){
        
        e=t1.getData();
        t1=t1.getLink();
        
    }
    return e;
        }

    
    
    
}
