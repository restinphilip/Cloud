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
class Tree_CH
        
 {
     private Node root;
 

     public Tree_CH()
     {
         root = null;
     }
     
     public Tree_CH(String rootN)
     {
         root = new Node(rootN);
     }
     
     public boolean isEmpty()
     {
         return root == null;
     }

     public void insert(String data)
     {
         root = insert(root, data);
     }

     private Node insert(Node node, String data)
     {
         if (node == null)
             node = new Node(data);
         else
         {
             if (node.getRight() == null)
                 node.right = insert(node.right, data);
             else
                 node.left = insert(node.left, data);             
         }
         return node;
     }     
     
     
     public boolean search(String val)
     {
         return search(root, val);
     }
     
     private boolean search(Node r, String val)
     {
         if (r.getData().equals(val))
             return true;
         if (r.getLeft() != null)
             if (search(r.getLeft(), val))
                 return true;
         if (r.getRight() != null)
             if (search(r.getRight(), val))
                 return true;
         return false;         
     }
     
     public boolean isRoot(String val)
     {
         //System.out.println("CHECK :: "+root.data+"\t"+val);
         if(root.data.equals(val)){
             return true;
         }else{
             return false;
         }
     }
 }
