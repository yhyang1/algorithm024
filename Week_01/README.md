# 学习笔记
## 作业（Java 12）
### 用 add first 或 add last 这套新的 API 改写 Deque 的代码
文件DequeExample.java
### 分析 Queue 和 Priority Queue 的源码
1. Interface Queue，主要由以下方法组成：
* add(e)/offer(e) - 插入元素
* element()/peek() - 取得头部元素但不移除
* remove()/poll() - 取得并移除头部元素
  这些方法分成两类，分别是抛出异常的add、element、remove和不抛出异常的offer、peek和poll。
2. Class AbstractQueue实现了Queue，提供了一些Queue的实现骨架，实现了以下方法组成：
* add(e) - 插入元素，调用offer()方法，不成功则抛出异常
* remove() - 取得并移除头部元素，调用poll()方法，不成功则抛出异常
* element() - 取得头部元素但不移除，调用peek()方法，不成功则抛出异常
* clear() - 移除所有元素，调用poll()方法，不抛出异常
* addAll(c) - 将c中的元素添加至队列，调用add(e)方法
  AbstractQueue不包含实际存储元素的数据结构，由扩展他的类实现。
3. Class PriorityQueue扩展了AbstractQueue
   balanced binary heap实现，可以看成一个完全二叉树。元素需要可排序（自然序或提供比较方法）。不支持null元素。无边界，通过内部大小维护数组用于存储元素。实现了以下方法：
1) 检索类方法：
* add()/offer(). 向队列中增加元素，若容量不足则通过grow()增加存储数组大小，通过siftUp()将元素放在队列合适位置。
* remove(o). 调用removeAt(), 将指向元素的指针设置为空，通过调用siftDown和siftUp方法移动已有元素。
* peek(). 返回数组位置0的元素（最大的元素）
* poll(). 返回数组位置0的元素（最大元素），删除元素，调用siftDown*调整元素位置

2) 关键内部方法
* grow(). 维护队列大小，增长队列(TODO)
* siftUp(k, e)。将元素e插入队列，从位置k开始向上查找
* siftDown(k, e)。将元素e插入队列，从位置k开始向下查找
### 删除排序数组中的重复项（Facebook、字节跳动、微软在半年内面试中考过）
文件Solution.java，方法removeDuplicates。
### 旋转数组（微软、亚马逊、PayPal 在半年内面试中考过）
文件Solution.java，方法rotate和reverse。
### 合并两个有序链表（亚马逊、字节跳动在半年内面试常考）
文件Solution.java，方法mergeTwoLists.
### 合并两个有序数组（Facebook 在半年内面试常考）
### 两数之和（亚马逊、字节跳动、谷歌、Facebook、苹果、微软在半年内面试中高频常考）
### 移动零（Facebook、亚马逊、苹果在半年内面试中考过）
### 加一（谷歌、字节跳动、Facebook 在半年内面试中考过）