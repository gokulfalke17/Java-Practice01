package gf.custome_collection;


public class NITLinkedList<E> {
	//for storing number of elements stored
	int size = 0;
	//point first Node
	Node<E> first;
	//point last node
	Node<E> last;
	
	 private static class Node<E> {
	        E item;
	        Node<E> next;
	        Node<E> prev;

	        Node(Node<E> prev, E element, Node<E> next) {
	            this.item = element;
	            this.next = next;
	            this.prev = prev;
	        }
	    }
	
	 public boolean add(E e) {
	        final Node<E> newNode = new Node<>(last, e, null);
	        last = newNode;
	        if (last == null)
	            first = newNode;
	        else
	            last.next = newNode;
	        size++;
	        return true;
	    }
	
	public int size() {
		return size;
	}
	
	public String toString() {
		if(size == 0) 
			return "[]";
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Node<E> node = first; node!=null; node=node.next) {
			sb.append(node.item);
			sb.append(", ");
		}
		int index = sb.lastIndexOf(", ");
		sb.delete(index, index+2);
		
		sb.append("]"); 
		
		return sb.toString();
	}
	
	public boolean contains(E e) {
		return indexOf(e) >= 0;
	}
	
	public int indexOf(E e) {
		if(e == null) {
			int index = 0;
			for(Node<E> node = first; node!=null; node=node.next) {
				if(node.item == null)
					return index;
				index++;
			}
		}else {
			int index = 0;
			for(Node<E> node=first; node!=null; node=node.next) {
				if(node.item.equals(node.item))
					return index;
				index++;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(E e) {
		if(e == null) {
			int index = size-1;
			for(Node<E> node=last; node!=null; node=node.prev) {
				if(node.item == null) 
					return index;
				index--;
			}
		}else {
			int index = size-1;
			for(Node<E> node=last; node!=null; node = node.prev) {
				if(node.item.equals(node.item))
					return index;
				index--;
			}
		}
		return -1;
	}
	
	public E get(int index) {
		checkIndex(index);
		
		if(index < (index/2)) {
			Node<E> node = first;
			for(int i=0;i<index;i++) {
				node = node.next;
			}
			return node.item;
		}else {
			Node<E> node = last;
			for(int i=size-1; i>index; i--) {
				node = node.prev;
			}
			return node.item;
		}
	}
	
	//adding and removing remaining
	public void add(int index, Object element) {
	    if (index < 0 || index > size) {
	        throw new IndexOutOfBoundsException();
	    }

	    if (index == size) {
	        add((E) element);
	        return;
	    }

	    Node<E> newNode = new Node<>(null, (E) element, null);
	    if (index == 0) {
	        newNode.next = first;
	        first.prev = newNode;
	        first = newNode;
	    } else {
	        Node<E> pred = getNode(index - 1);
	        newNode.prev = pred;
	        newNode.next = pred.next;
	        pred.next.prev = newNode;
	        pred.next = newNode;
	    }
	    size++;
	}

	
	public boolean remove(Object obj) {
	    if (obj == null) {
	        for (Node<E> node = first; node != null; node = node.next) {
	            if (node.item == null) {
	                removeNode(node);
	                return true;
	            }
	        }
	    } else {
	        for (Node<E> node = first; node != null; node = node.next) {
	            if (obj.equals(node.item)) {
	                removeNode(node);
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	
	private Node<E> getNode(int index) {
	    Node<E> node;
	    if (index < (size / 2)) {
	        node = first;
	        for (int i = 0; i < index; i++) {
	            node = node.next;
	        }
	    } else {
	        node = last;
	        for (int i = size - 1; i > index; i--) {
	            node = node.prev;
	        }
	    }
	    return node;
	}

	private void removeNode(Node<E> node) {
	    if (node.prev == null) {
	        first = node.next;
	    } else {
	        node.prev.next = node.next;
	    }

	    if (node.next == null) {
	        last = node.prev;
	    } else {
	        node.next.prev = node.prev;
	    }
	    size--;
	}

	
	
	public void checkIndex(int index) {
		if(index<0 || index>=size) 
			throw new IndexOutOfBoundsException();
	}
	
}
