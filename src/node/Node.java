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
public class Node {
    int value;
    Node left;
    Node right;
    
    public Node(int value){
        this.value=value;
        left=null;
        right=null;   
    }
    public int getValue(){
        return value;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void setValue(int v){
        value=v;
    }
    public void setLeft(Node l){
        left=l;
    }
    public void setright(Node r){
        right=r;
    }
    public void Output(){
        System.out.println(value + " ");
        if(left!=null){
            left.Output();
        }
        else{
            System.out.println("#");
        }
        if(right!=null){
            right.Output();
        }
        else{
            System.out.println("#");
        }
            
        }
            
    }
    

