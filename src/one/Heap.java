package one;

import java.util.ArrayList;

/**
 * Heap 实现堆添加一个节点和删除根节点
 * 
 * @author cdl
 *
 */
public class Heap<E extends Comparable<E>> {
	private ArrayList<E> list = new ArrayList<>();

	public Heap() {

	}

	/**
	 * 从objects数组中创建一个堆
	 * 
	 * @param objects
	 */
	public Heap(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}

	/**
	 * 添加元素到堆中
	 * 
	 * @param newObject
	 */
	public void add(E newObject) {
		list.add(newObject); // 添加元素到堆中
		int currentIndex = list.size() - 1; // 最后一个节点

		while (currentIndex > 0) {// currentIndex > 0 控制父子节点循环
			int parentIndex = (currentIndex - 1) / 2;

			// 如果currentIndex索引元素 > parentIndex索引元素，互相交换
			if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);
			} else
				break; // 树已成堆

			currentIndex = parentIndex;
		}
	}

	/**
	 * 注：暂停下
	 * 
	 * 删除堆根节点
	 * 实现思想：
	 * 1.删除根节点
	 * 2.用最后一个节点替换根节点
	 * 3.重新构建这棵树保持堆的属性
	 * @return
	 */
	public E remove() {
		if(list.size() == 0) {
			return null;
		}
		
		E removedObject = list.get(0);
		
		list.set(0, list.get(list.size() - 1)); //用最后一个节点替换根节点
		list.remove(list.size() - 1); //删除最后一个节点
		
		int currentIndex = 0;
		while(currentIndex < list.size()) {
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2* currentIndex + 2;
			
			// 在左右子节点找到最大的节点
			if(leftChildIndex >= list.size()) {
				break; 
			}
			int maxIndex = leftChildIndex;
		}
		return removedObject;
	}
}

























