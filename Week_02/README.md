# 学习笔记
## Homework
### 写一个关于 HashMap 的小总结。
说明：对于不熟悉 Java 语言的同学，此项作业可选做。
1. new HashMap()
   通过一个数组存储键值对，以2的指数方式扩展。其中元素是Node<K, V>，实现了接口Map.Entry<K, V>，对元素定义了以下操作：
    * getKey()
    * getValue()
    * setValue()
    * equals()
    * hashCode(). 使用Objects.hashCode(key) ^ Objects.hashCode(value)生成，返回int。
    通过两个参数初始化：
      * initialCapacity
      * loadFactor。 默认为 0.75
2. map.set(key, value)
3. map.get(key)
   查找key是否存在，返回null或值。通过getNode(hash(key), key)实现。
   
4. map.has(key)
6. map.clear()
### 有效的字母异位词（亚马逊、Facebook、谷歌在半年内面试中考过）
https://leetcode-cn.com/problems/valid-anagram/description/
文件Solution.java，方法isAnagram
### 两数之和（近半年内，亚马逊考查此题达到 216 次、字节跳动 147 次、谷歌 104 次，Facebook、苹果、微软、腾讯也在近半年内面试常考）
https://leetcode-cn.com/problems/two-sum/description/
文件SOlution.java，方法twoSum
### N 叉树的前序遍历（亚马逊在半年内面试中考过）
https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
文件Solution.java，方法preorder
### HeapSort ：自学 https://www.geeksforgeeks.org/heap-sort/