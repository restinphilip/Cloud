/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sse;

/**
 *
 * @author resti
 */
class Node
 {    
    
     Node left, right;
     String data;
     public Node()
     {
         left = null;
         right = null;
         data = null;
     }
     
     public Node(String n)
     {
         left = null;
         right = null;
         this.data = n;
     }
     
     public void setLeft(Node n)
     {
         left = n;
     }
     
     public void setRight(Node n)
     {
         right = n;
     }
     
     public Node getLeft()
     {
         return left;
     }
     
     public Node getRight()
     {
         return right;
     }
     
     public void setData(String d)
     {
         data = d;
     }
     public String getData()
     {
         return data;
     }     
 }
