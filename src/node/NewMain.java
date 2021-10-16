/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author KHANYA_YOLANDA
 */
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n6 =new Node(6);
        Node n5 = new Node(5);
        n5.setLeft(n6);
        Node n13 =new Node(13);
        Node n1=new Node(1);
        n1.setright(n5);
        n1.setLeft(n13);
        Node n3=new Node(3);
        n3.setLeft(n1);
        Node n9=new Node(9);
        Node n4=new Node(4);
        Node n15=new Node(15);
        n15.setLeft(n9);
        n15.setright(n4);
        Node n2=new Node(2);
        Node n16=new Node(16);
        n16.setLeft(n15);
        n16.setright(n2);
        Node n11=new Node(11);
        Node n10=new Node(10);
        n10.setLeft(n11);
        n10.setright(n16);
        n3.setright(n10);
        
         
         
        BinaryTree bt=new  BinaryTree (n3);
        bt.DispTree();
        
        
    }
    
}

