package com.lixing.docker.dockerboot.util;

import java.util.ArrayList;
import java.util.List;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/3 23:27
 * description：二叉链表
 */
public class TwoLinkBinTree<E> {
    public static class TreeNode{
        Object data;
        TreeNode left;
        TreeNode right;
        public TreeNode(){ }
        public TreeNode(Object data){
            this.data=data;
        }
        public TreeNode(Object data, TreeNode left, TreeNode right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    private TreeNode root;
    /** 默认的构造器创建二叉树*/
    public TwoLinkBinTree(){
        this.root=new TreeNode();
    }
    /** 以指定的根节点创建创建二叉树*/
    public TwoLinkBinTree(Object data){
        this.root=new TreeNode(data);
    }
    /**指定节点添加子节点*/
    /** 判断二叉树是否为空*/
    public boolean empty(){
        return root.data==null;
    }
    /** 返回二叉树的根节点*/
    public TreeNode root(){
        if(empty()){
            throw new RuntimeException("二叉树为空,没有根节点哟!");
        }
        return root;
    }
    /** 中序遍历
     * @param root*/
    public static List<TreeNode> inIterrator(TreeNode root){
        return inIterrator(root);
    }
    private  List<TreeNode> inIterator(TreeNode node){
        List<TreeNode> list=new ArrayList<TreeNode>();
        // 处理左子树
        if(node.left!=null){
            list.addAll(inIterator(node.left));
        }
        list.add(node);
        // 处理右子树
        if(node.right!=null){
            list.addAll(inIterator(node.right));
        }
        return list;
    }
    public static void main(String[] args) {
        TwoLinkBinTree<String> tree=new TwoLinkBinTree("10");
    }
}
