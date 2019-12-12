# Recursion  notes

##  What is recursion ?

 search(root,valueToSearch){
 if(root equals null) return null
else if(root.value equals valueToSearch) return root
else if(valueToSearch < root.value) search(root.left,valueToSearch)
else search(root.right,valueToSearch)
}

## Properties of recursion
* Same operation is performed multiple times

* In every step problem gets smaller

* Base condition is a must for terminating the recursion

###  Why we should learn recursion
* Because it makes code easy to write **whenever** a given problem can be broken down into **similar** sub-problems.
* It is heavily used in **Tree** and **Graph** ADTs.
* It is heavily used in **Divide and Conquer**, **Greedy** and **Dynamic Programming.**


### Format of Recursive Function
* Recursive case: Cases where the function needs to recur.
* Base case: Cases where the function does not occur.(Stop the recursive calls, stop and exit)

    sampleRecursion(parm){
	    if(basecase) return base case value
	    else sampleRecursion(modified params)
	    }

### When to use recursion
* when we can easily breakdown a problem into similar sub-problems
* when we are ok with extra overhead in time and space
* when we need a quick working solution instead of efficient one.
### When not to use recursion
* if the response to any of the above statements is No. We should not go with recursion.

###  Practical use of recursion
* Stack
* Tree - traversal/search/insertion/deletion
* Sorting - quick sort, merge sort
* Divide and Conquer
* Dynamic programming


# What and Why of 'Algorithm Run Time Analysis'
* It is a study of given algorithm run time
* How much time will be given algorithm will take to run

## Why should we learn it
* Measure efficiency of a given algorithm
* Improve based on result obtained


## Notation for 'Algo run time analysis'
* omega gives Lower bound of a given algorithm
	* For any given input,running time of a given algorithm will not be **less than** given time.
	* **Minimum run time required for given algorithm**
* Big O gives upper bound of a given algorithm
	* **Max run time **
* Theta : decides upper and lower bound of given algorithm is same or not
	* **Average run time**

### Notations:

* O(1)
	* constant
* O(log(n))
	* logarithmic
* O(n)
	* linear
* O(nlog(n))
	* linear logarithmic
* O(n^2)
	* quadratic
* O(n^3)
	* cubic
* O(2^n)
	* exponential



## Array
### Why we need array
* Problem statement: we want to store 1 million similar data types in memory
	* declare array with size of 1 million
	
### Array in memory
* stored as flat 1D array even it was declared 2D or 3D

### Common operations
* Insert a value - O(1)
* Traversing -O(n)
* accessing given cell - O(1)
* search given value - O(n)
* delete value given index - O(1)
* 
### When to use array
* When similar data needs to be stored
* Dynamic programming



## LinkedList
### What is LinkedList
* linear data structure where each element is a separate object, each node contains two items: data, and reference to next node.
* Cannot be random accessed
* Does not need consecutive memory space

### Single Linked List
* Each node in the list stores the data and the reference to the next node.
* It does not store the reference to the previous node.
* Advantages
	*  Has flexibility to add/remove node at **run time**
	
### Circular Single Linked List
* Same as Link List
* The last node in the **Circular Single Linked List** stores the reference to the first node.
* Why do we want to do this ?
	* If we need to travel from last node to the first node
		* eg, chess player iteration

### Double Linked List
* Each node contains two references.
	* previous and next node
* Why
	* Goes both ways in traversing operation

### Circular Double Linked List
* Same as Double Linked List
	* The last node in the **Circular Double Linked List** stores the reference to the first node.
* Why
	* flexibility of traversing from the last node to the first node and from the first node to the last node.


## Stack
* LIFO
### Implementation
* Array
	* Easy to implement but fix size
	* 
* LinkedList
	* Variable size
	* Moderate to implement

### When to use stack
* Helps manage the data in particular way(LIFO)
* Cannot be easily corrupted (No one can insert data in middle)
### When to avoid stack
* Random access not possible - if we have done some mistake, it costly to rectify.

## Quene
* FIFO
* Common operations in queue
	* createQueue
	* enqueue
	* dequeue
	* peekInQueue
	* isEmpty
	* isFull
	* deleteQueue

### Implementation
* Array
	* Linear array
	* circular array 
* LinkedList
	* space efficient
### When to use /avoid queue

* when to use
	* helps manage particular way FIFO
	* not easily corrupted
* when to avoid
	* random access is not possible
 

## Tree
*	Properties
	*	Used to represent data in **hierarchical form**.
	*	every node has components (data and reference)
	*	it has **Root node** and 2 disjoint binary tree called **left sub-tree** and **right sub-tree**.
### Tree terminology
* root
	* node with no parent
* edge
	* link from parent to child
* leaf
	* node with no children
* sibling
	* children of same root
* ancestor
	* if there is a path from root to a and b appears on the path.
* depth of node
	* length of path from root to node
* height of node
	* length of path from that node to the dephest node
* height of tree
	* max height among all node
* depth of tree
	* max depth among all the nodes

* Predecessor 
	* predecessor of a node is the immediate previous node in **inorder taversal** of the binary tree.
	
* Successor
	* successor of a node is the immediate next node in **inorder traversal**
	* 

### What & Why of Binary tree

* What is binary tree
	* a tree is called a binary tree if each node has zero, one or two child
	* It is a family of Data Structure(BST,Heap Tree,AVL, Red-Black,Syntax tree, huffman coding tree etc,,)
	* 
* Why should we learn binary tree
	* Prerequites for more advanced trees ((BST,Heap Tree,AVL, Red-Black,Syntax tree etc..)
	* Is used in solving specific problems like
		* huffman coding
		* heap(Priority queue)
		* expression parsing

* Types of binary tree
	* Strict binary tree
		* each node has either 2 children or none
	* Full binary tree
		* each non-leaf node has two children
	* Complete binary tree
		* if all levels are completely filled except possibly the last level and the last level has all keys as left as possible.

* Tree representation in code
	* Using Linked List
		* node:{data,left,right}
		* Pointer of root and 
	* Using array
		* left is 2*index
		* right is 2*index+1

* Common operations
	* Creation of Tree
	* Insertion of node
	* deletion of node 
	* searching node in tree
	* traversing entire tree
	* delete tree
* **Linked List implementation**
	* createBinaryTree()
		* create an object of binary tree class
	* Traversals
		* inorder
			* left root right
			*  inorder(root)
				if(root==null)return
				else
				inorder(root.left)
				print(root)
				inorder(root.right)
		* preorder
			* root left right
			*  preorder(root)
				if(root==null)return
				else
				print(root)
				preorder(root.left)
				preorder(root.right)
	
		* post-order
			* left right root
			* postorder(root)
				if(root==null)return
				else
				postorder(root.left)
				postorder(root.right)
				print(root)
	
		* breadth first search
			* levelOrderTraversal()
				* createQueue
				* enque(root)
				* while(queue is not empty)
					* enque(children of first element)
					* dequeue and print
					* 
    * Search for a node in Binary tree
	        * search(val)
		        * if(root ==null) return error
		        * else
			        * do levelOrdertraversal
				        * if(value found)
					        * return value
				* return value not found error

		* Insert value in Binary tree
			* Insert(val)
				* if(root==null)
					* creat node and set value = val
				* else 
					* do levelOrdertraversal
					* find first vacant space and insert the node there

	* delete of node from binary tree
		* if we cannot find value, return err
		* else, do levelOrderTraversal find the last node in the tree, replace it with the node to be deleted, and delete the last node.


	*	delete the entire binary tree
		*	delete the root node
		*	deleteBinaryTree()
			*	root=null


* **Array implementation**
	* let index;
	* leftchildIndex = 2*index;
	* rightChildIndex = 2*index +1
	* createBinaryTree()
		* create a blank array of SIZE
		* update lastUseIndex = 0
	* insertNodeInBinaryTreee
		* if arr is full, return err
		* insert at the first vacant cell in the array
		* update lastusedindex
	*  search for a node in binary tree
		* doLevelOrder traversal (from index 1 to lastUsedIndex)
		* when the value to be searched does not exist, return
		* return the value when found
	* Inorder traversal
		* if(index>lastUseIndex) return
		* else
			* inorder(2*index)
			* print(arr[index])
			* inorder(2*index+1)
	* preOrder Traversal
		* if(index>lastUseIndex)	return
		* else
			* print(arr[index])
			* preorder(2*index)
			* preoder(2*index+1)
	* postOrder traversal
		*  if(index>lastUseIndex)	return
		* else
			* postOrder (2*index)
			* postOrder (2*index+1)
			*  print(arr[index])
	* breadth first / level order traversal
		* just traverse from first cell to the last used cell

	* delete of node in array implementation
		* find the element and swap the value with the deepest node
		* and delete the deepest node

	* Delete the entire binary tree 
		* set array to null

## Binary Search Tree

 * Properties
	 * it is a binary tree with more properties
		 * left sub tree  of a node has key less than or equal to the its parent node key
		 * right sub tree of a node has key greater or equal to its parent node key

* create and search in BST
	* creation of BST
		* initialize root =null
	* search for a value
		* search(root,value)
			* if(root==null)return null
			* if(root.value==value)
				* return root
			* else
				if(value<root.value)
					search(node.left,value)
				if(value>root.value)
					search(node.right,value)
	* traversal all nodes
		* same as binary tree
	* insertion of a node
		* BST_insert(currentNode,valueToInsert)
			* if(currentNode=null) create node and set value = valueToInsert
			* else if(valueToInsert <= currentNode.value)
				* currentNode.left =  BST_insert(currentNode.left,valueToInsert)
			*	else
				*	currentNode.right = BST_insert(currentNode.right,valueToInsert)
			return currentNode
	* deletion of a node
		* cases 1
			* Node to be deleted is a leaf node
				* start from root and traverse to find the node, and delete it from the binary tree
		* case 2
			* node to be deleted has one child
				* connect parent of node and child of node.
		 *	case 3
			 *	node to be deleted has two children
				 *	find successor of that node
					 *	successor is the least value on the right sub-tree
				* if successor does not have children ,replace the value with the successor, then delete the successor value.
				* if successor has children, then make successor's parent point to its children.
				* **algo as follows**
					* deleteNodeOfBinarySearchTree(root, valueToBeDeleted)
						* if(root==null) return null
						* if(valueToBeDeleted < root.value)
							* then root.left = deleteNodeOfBST(root.left,valueToBeDeleted)
						* else if(valueToBeDeleted > root.value)
							* then root.right = deleteNodeOfBST(root.right,valueToBeDeleted)
						* else // current node is the node to be deleted
							* if root has two children
								* then find the minimum element from right sub-tree of currentNode/root, replace currentNode/root with the minimum node and delete the minimum node(if the minimum node has children then make its parent point to its children, if it does not has any children then make its parent point to null)
							* if root has one children
								* connect root's parent with its children 
							* else // if node has no children
								* remove node.( root =null)
					
	* deletion of BST
		* root = null


## AVL Tree
* balanced binary search tree
	* Height of left subtree and right sub tree cannot be greater than 1
* common operations in the tree
	* createAVL()
		* initialize root = null
	* AVL_search(root,val)
		* if(root==null) return null
		* if(root==val) return root
		* else if(val<root) 
			* AVL_search(root.left,val)
		* else
			* AVL_search(root.right,val)

* ** insertAVL(node)**
	* case 1
		* no rotation required
	* case 2
		* rotation required
	* rotation condition
		* LL
			* 
			* Rotate right
			* rightRotate(currentDisbalancedNode)
				* newRoot = currentDisbalancedNode.left
				* currentDisbalancedNode.left  = currentDisbalancedNode.left.right
				* newRoot.right = currentDisbalancedNode
				* currentDisbalancedNode.Height = calculateHeight(currentDisbalancedNode)
				* newRoot.Height = calculateHeight(newRoot)
		* LR
			* do a left rotation with currentDisbalancedNode.left
			* do a right rotation on currentDisbalancedNode
			* leftRotate(currentDisbalancedNode.left)
				* newRoot = currentDisbalancedNode.left.right
				* currentDisbalancedNode.left.right.= currentDisbalancedNode.left.right.left
				* newRoot.left = currentDisbalancedNode.left
				* calHeight(newRoot)
				* return newRoot
				
			* rightRotate(currentDisbalancedNode)
		* RR
			* do left rotation
			* leftRotate(currentDisabledNode)
				* newRoot = currentDisabledNode.right
				* currentDisabledNode.right = currentDisabledNode.right.left
				* newRoot.left = currentDisabledNode
				* calculateHeight......
		* RL
			* rightRotate(currentDisabledNode.right)
			* leftRotate(currentDisabledNode)
		*	Final combined
		*	node Insert(root,val)
			*	if(root ==null)  return new Node(data)
			*	else if(val<root.val) 
				*	root.left = insert(root.left,val)
			* else 
				* root.right = insert(root.right,val)
			* int balance = height(root.left) - height(root.right)
			* if(balance>1)
				* if(height(root.left.left)>=height(root.left.right))
					*	rightRotation(root) //LL condition
				*	else
					*	LeftRotation(root.left) //LR
					*	rightRotation(root)
			*	else if(balance<-1)
				*	if(height(root.right.right>root.right.left)
					*	leftRotation(root) //RR
				* else
					* rightRotation(root.right);
					* leftRotation(root) //RL

			*	root.height = max(root.left,root.right) + 1
			*	return root.
			*	
* **Deletion of node from AVL tree**
	* cases
		1. tree does not exit
		2. rotation is not required
			* node to be deleted is leaf node
			* node to be deleted is having 1 child
			* node to be deleted have two children
		3. rotation is required
			* LL
				* left and left node is causing the dis-balance
			* LR
			* RR
			* RL
			
	* Algo
		* deleteNodeOfAVLTree(root, valueToBeDeleted)
			* if(root==null) return null
			* if(valueToBeDeleted < root.value)
				* then root.left = deleteNodeOfAVLTree(root.left,valueToBeDeleted)
			* else if(valueToBeDeleted > root.value)
				* then root.right = deleteNodeOfAVLTree(root.right,valueToBeDeleted)
			* else // current node is the node to be deleted
				* if root has two children
					* then find the minimum element from right sub-tree of currentNode/root, replace currentNode/root with the minimum node and delete the minimum node(if the minimum node has children then make its parent point to its children, if it does not has any children then make its parent point to null)
				* if root has one children
					* connect root's parent with its children 
				* else // if node has no children
					* remove node.( root =null)
 int balance = height(root.left) - height(root.right)
		* if(balance>1)
			* if(height(root.left.left)>=height(root.left.right))
				*	rightRotation(root) //LL condition
			* else
				*	LeftRotation(root.left) //LR
				*	rightRotation(root)
			*	else if(balance<-1)
				*	if(height(root.right.right>root.right.left)
					*	leftRotation(root) //RR
				* else
					* rightRotation(root.right);
					* leftRotation(root) //RL

			*	root.height = max(root.left,root.right) + 1
			*	return root.

* Deletion of AVL tree
	* root = null

## Binary Heap
* Binary tree with special properties
	* value of any given node must be <= its children, we call this Min Heap
	* value of any given node must be >= its children, we call this Max Heap
	*	complete tree
		*	all level are completely filled except possibly last level and last level has all keys as left as possible
	 * this makes binary heap ideal for array implementation
### Why should we learn binary heap
* find min/max in log(n) time. Also inserting does not take more than log(n) time
* possible solutions
	* Store number in sorted array
		* insertion will take O(n)
	*	Store number in linkedlist
		*	insertion takes O(n) time
	*	Binary heap
		* insertion will take O(log(n))
		* find min/max will take O(1) 
		* Practical use
			* Prim's algorithm
			* heap sort
			* priority queue
### Types of binary heap
*	Min-heap: if the value of each node is less than or equal to value of both of its children
*	Max-heap : if the value of each node is more than or equal to value of both of its children
### Common operations

* Implementation options
	* Array
		* left child index = 2i
		* right child index = 2i+1
	* Reference or pointer
	
* createHeap
	* create blank array of size + 1
		* avoid of using index 0 for ease of computation later
		* 
* peekTopOfHeap
	* return the value at the top of the heap
* extract MAX/MIN 
	* * extractMin()
				* if tree does not exist
					* return error
				* else
					* extract val from first cell
					* move value from last cell to the first cell
					* heapifyBottomToTop
					* sizeOfHeap --
* sizeOfHeap
	* return the size of cells that are used for the heap
* insert
		* insertValueToArray(val)
				* if tree does not exist
					* return error
				* else
					* insert val in the first unused cell
					* heapifyBottomToTop
					* sizeOfHeap ++
* deleteHeap
	* set array to null

## Trie
* Data structure for storing strings
* Common operations
	* insert
		* case1
			* Trie is blank
		* case 2
			* new string prefix is common with another string prefix
		* case 3
			* new String prefix is already present as complete string
		* case 4
			* string to be inserted already present in Trie

	*	search a string in trie
		*	case 1 string does not exit in trie
		*	case 2 string exits in trie
		*	case 3 current string is a prefix of another string, but this string does not exits in trie


	* delete string from trie
		* case 1 
			* some other word's prefix is same as prefix of this word(bcde,bckg)
		* case 2	
			* this word is a prefix of some other word(bcde,bcdef)
				* mark node e end of word to false
		* case 3
			* some other word is a prefix of this word
		* case 4
			* no one is dependent on this word


### Use Case
* auto complete
* spell check


## Hashing
* Definition
	* hashing is a method of sorting or indexing of data, the idea behind hashing is to allow large amount of data to be indexed using keys commonly created by formulas

* Hashing
	* change string to number with algorithm
	* use number as index in an array and store data,
#### why learn hashing
* search operation takes O(1) ideally,O(n)
#### Terminologies
* hashing function
	* hash function is any function that can map data of arbitrary size to fixed size
		* eg. convert string to number
	* key
		* input data given by user
	* hash value
		* value returned by hash function
	* hash table
		* data structure maps key to values
	* collision
		* different key produce same hash value
#### Hash functions
* simple mod function (int inputs)
	* eg smod(int n)
		* return m % 16
* characteristics of good hash functions
	* it distributes hash value uniformly across hash table
	* it uses all input data
	* 
#### Collision Resolution Techniques
* Direct chaining
	* each cell in the hash table is an reference to a linked list
* Open addressing
	* Linear probing
		* go to next cell of collided cell
		* 
	* Quadratic probing
		* add to hash value  1^2 ,2^2 ,3^2 ,4^2 etc,,
	* Double hashing
		* two hash functions
			* primary hash functions
			* secondary hash functions
				* hash again if there is collision
				* add primary hash value to the second hash value
				* if there is **still collision**
					* multiply the hash value by 2,3,4,5,6,...  returned from secondary hash function
					* 
#### What happens when hash table is full
* Direct chaining
	* Hash table will never be full
* Open addressing
	* solutions
		* create new hash table with double the size and repeat insertion used by the hash table

#### Pros and Cons of different Collision Techniques
* Direct chaining
	* no fear of exhausting the hash table bucket
	* fear of big linked list, can affect performance

* Open addressing 
	* easy implementation
	* might exhaust all bucket in the hash table
		* this operation takes O(n) time

* If input size is know, we should go for **"Open addressing"**.
* In case input size is not know, we could use either open addressing or direct chaining
* if deletion rate is high, we should use direct chaining
	*	open addressing needs re-structuring when there is many 'holes' in the hash table

#### Practical use of hashing
* Password verification on server
* file system
* Use path as key and get hash value and use it as physical address on the hard disk
#### Pro and Cons of hashing
* **Pros**
	* on an average insertion/deletion/search takes O(1)
* **Cons**
	* in worst case insertion/deletion/search takes O(n), when hash function is not good enough, eg. lots of collisions



## Sorting
* Arrange data in particular format
	* ascending
	* descending
* Sorting
	* On the basis of Space used
		* in-place
			* Does not require any extra space for sorting
			* eg. bubble sort
		* out of place
			* require extra space for sorting
			* eg. merge sort
	* on the basis of stability
		* stable
			* if a sorting algorithm after sorting the contents does not change the sequence of similar content in which they appear, is called stable sorting
			* eg. insertion sort
			* eg. group by uses stable sort
		* un-stable
			* vice versa of stable sort
			* eg . quick sort
		

#### Terminologies in sorting
* Increasing order
	* if successive element is greater than the previous one.
	* eg. 1,2,3,4,5,6,7
* decreasing order
	* if successive element is less than the previous one
* non- increasing order
	* eg. 9,8,7.6,5.4
	* if successive element is less than or equal to its previous number when contains duplicated value
	* example 9.8.7.3.3.1
	* 
* non- decreasing order
	* the successive element is greater or equal to its previous element when contains duplicated value.

#### sorting algorithms
* why we need so many sorting algorithms?
	* each algorithm comes with pros and cons
* 
* **Bubble sort**
	* Repeatedly steps go through the list to be sorted,compare each adjacent element, swap if they are in the wrong order
	* in place sorting . space complexity O(1)
	* when to use
		* space is a concern
		* input already sorted
		* easy to implement
	* when not to use
		* if input data is huge
* **Selection sort**
	* based on the idea of finding the min/max element in an array.
	* take min element and put it at first position of unsorted array
	* algo:
		* loop i to arr.size
		* int min = arr[i]
		* loop j=i+1 to arr.size
			* if(arr[j]<arr[i])
				* min = j;
		* if(j!=i)
			* swap(min,arr[j])
	* time O(n^2), space O(1)
	* when to use
		* when we do not have additional memory
		* easy implementation
* **Insertion sort**
	* take a given array divided into sorted and unsorted array
	* from unsorted array, we pick the first element and find its correct position in an array
	* algo:
		* loop 1 to n
		* currentNumber =  arr[i], i=j
		* while(arr[j-1]>currentNumner && j>0)
			* arr[j]=arr[j-1] //push arr[j-1] to the right
			* j-- // jump to next previous cell
		* arr[j]= currentNumber; //insert current number

	* When to use
		* best when we have continuous inflow of numbers and we want to keep the list sorted
	* When not to use
		* average case is bad O(n^2) 

* **Bucket sort**
	* distribute elements of an array into a number of buckets
	* each bucket is then sorted individually
	* merge all buckets and then we get sorted list
	* algo:
		* create numOfBucket = ceil/floor(sqrt of total number of items)
		* iterate through each number and place it in appropriate buckets
		* appropriate bucket =  ceil( val * (number of buckets) / max val in array)
		* sort all buckets
		* merge all buckets
	* Time O(nlogn), space O(n)
	* When to use
		* input is uniformly distributed
	* When not to use
		* when space is a concern
* **Merge Sort**
	* Divide and conquer
	* when to use
		* need stable sort
		* average sort time is O(nlogn)
	* When not to use
		* space is a concern
	* Practical use
		* Java 6 uses merge sort

* **Quick sort**
	* Divide and conquer
	* at each step, we find pivot then make sure that all smaller elements are left of pivot and all bigger elements are right of pivot
	* does not require extra space
	* When should we use quick sort
		* Average case is desired to be O(nlogn)
	* When not to use
		* space is a concern
		* not stable

	* Practical use
		* C#
		* JAVA
		* ANDRIOD


* **Heap sort**
	* algo:
		* for i to A.length -1
			* insertInHeap(A[i])
		* for i to A.length-1
			* extactHeap()
	* when to use
		* when space is a concren
	* when not to use
		* when we need sort to be stable


## Graph

#### What and Why of graph
* solve specific problems
* graph can have circles

#### Terminalogies
* vertices
	* nodes of graph
* edge
	* arcs that connect pairs of vertices
* unweighted Graph
	* a graph not having a weight associated with any edge.
	* weighted graph
		* each edge has associated weight withit
* undirected graph 
	* edges do not have a direction associated with them
* cylic graph
	* at least one loop in the graph
* asyclic graph
	* no loops in the graph
* tree
	* tree is a special case of directed acyclic graph

#### Types of graph

* directed 
	* weighted
		* positive
		* negative
	* unweighted
		
* undirected
	* weighted 
		* positive
		* negative
	* unweighted
	
#### How is graph can be represented in code
* adjacency matrix (2D array)
	* if the graph is complete or near to complete
* adjacency list
	* array of linked list with length equal to number of vertices
	* if number of edges are few

#### Graph traversal - BFS 
* process of visiting each and every vertices in the graph
* Breadth first search
	* starts at some arbitrary node of a graph and explores the neighbor nodes (at current level) first, before moving to the next level neighbors.
	* similar to level order traversal with tree DS
	* algo:
		* BFS()
			* while all vertices are not explored
				* enque(any vertex)
				* while( Q is not Empty)
					* q = dequeue()
					* if(q is not visited)
						* mark q visited
						* enque(adjacent unvisited vertex of q)
						* 
	* Handle disconnected graph
		* cannot perform BFS or DFS.


#### Graph traversal - DFS
* Depth first search
	* start selecting some arbitrary node and explores as far as possible along each edge before backtracking
	* algo
		* DFS
			* while( all vertex are not visited)
				* push(vertex)
					* while(stack is not empty)
						* s = pop()
						* 
						* if(s!visited)
							* print s and mark it as visited
							* push(adjacent node to stack)

#### BFS vs DFS
* if we know target vertex is burried deep
	* use DFS
* if we know that target vertex is close to the starting point
	* use BFS

#### Topological sort
* Topological sort sorts given actions in such a way that if there is a dependency of one action on another,then the dependent comes later than its parent action.
* algo: simplified
	* if(some other vetex is depent on current vertex)
		* go to the vertex and then come back to this vertext
	* else
		* push vertex to stack

* algo: detailed
	* topologicalSort(G)
		* for each node in G
				* if(node is not visited)
					* topologicalVisit(node)

		* pop stack to get sorted value;

	* topologicalVisit(node)
		* for each neibor of current node
			* if neibor are not visited
			* topologicalVisit(node.neibor)
		* mark as visited
		* push to stack

#### What is single source shortest path? (SSSP)
* Definition
	* find the shortest path from given node to all the node in the graph
* **BFS**
	* each node should have a parent variable in which stores its parent node
	* algo
		* BFS-SSSP
			* enque(sourceNode)
			* while queue is not empty
				* q = dequeue()
				* for each adjacent node of q
					* if they are not visited
					* enqueue(node)
					* node.parent = q
					* mark q as visited
	* Does not work for weighted graph
* DFS 
* **dijkstra**
	* Dijkstra(G)
		* initialize the distance of all node to infiniti
		* set sourceNode distance to 0
		* save all nodes in minHeap DS
		* while minHeap is not empty
			* currentNode = extractMin()
			* for each neibor of currentNode
				* if currentNode distance + currentEdge  < node Distance
					* update node parent to currentNode
					* set node distance = currentNode distance + currentEdge
	* Time : O(V^2)
	* does not work for negative cycle
		* there is a cycle
		* total weight of cycle should be negative
		* we can never find the minimum distance in a negative cycle
* **Bellman Ford**
	* report existence of negative cycle
	* algo
		* BellmanFord
		* set all vertice's distance to infiniti except source to 0.
		* for 1 to v-1
			* for each edge (u,v)
				* if d(v) > d(u) + w(u,v)
					* d(v) = d(u) + w(u,v)
					* update parent to u
		*  for each edge(u,v)
				* if d(v) != d(u) + w(u,v)
					* report error. negative cycle found


#### When to use which algorithm for SSSP
#### All pair shortest path problem
* Find shortest path of all nodes in the graph
* floyed warshall
	* D distance
	* u source
	* v destination
	* for each edge
		*  if D[u][v]  > D[u]['via X'] + D['via X'] [v]
			* D[u]['via X']  where via X is destination
			* D['via X'] [v] where via X is source
	* FloyedWarshall(G)
		* create table with V*V to D
		* initialize all cells to infiniti
		* fill in the values based on edges
		* for 0 to n - 1 //via vertex
			* for i to n-1
				* for j to n-1
					* if D[i][j] > D[i][k] + D[k][j]
						* D[i][j] = D[i][k] + D[k][j]
		* return D
		* time complexiti
			* O(v^3)
		* Space complexiti
			* O(V^2)
	* Why floyed warshall works
		* with given 2 nodes(src,dest) , there can be only 3 possiblities to find distance between them:
			* they are unreachable
				* not possible as it is given in the problem statement
			* they are directly connected
				* if this is best solution
				* if this can be improvised via some other vertex
			* they are reachable via some other node
				* nodes that are not reachable directly but are accessible via other nodes.
	* why floyd warshall does not work for negative cycles
		* to go through a cycle, we need to go through cycle at least twice.
		* we never visit same node twice in our algorithm

#### Minimum spanning tree
* a MST is a subset of edges of a connected, weighted and un-directed graph that
	* connects all the vertices together
	* without any cycles
	* with minimum total edge weight
#### Disjoint set
* What is disjoint set
	* it is an data structure that keeps track of set of elements which are partitioned into a number of disjoint and non-overlapping sets
	* each set has 'representative', which helps in identifying that set
* why should we learn disjoint set
	* it is used in various algorithms. One of which is kruskal algorith where it is used to detect cycle in undirected graph
 * Standard operations
	 * makeset(N)
		 * Used only once to create initial set
		 * O(n) for time & space
	* Union
		* merge two sets
		* union(s1,s2)
			* if s1 and s2 is the same set, return
			* if s1 > s2 merge s2 to s1
			* else merge s1 to s2
		* O(n) for time and O(1) space complexity
	* findSet(x)
		* return the set contains x
		* return representative of Set
		* O(1) for time and space
	#### Kruskal algorithm
	* concentrate on edge
	* is greedy algorithm
	* steps
		1.	adding increasing cost arcs at each step
		2.	also avoiding cycle in every step
	 * algo
		 * for each vertex makeSet(X)
		 * sort each edge by weight in non-decreasing order
		 * for each edge  (u,v) in the graph
			 * if findset(u) != findset(v)
				 * union(u,v)
				 * cost += edge weight
#### Prim algorithm
* concentrate on vertices
* a greedy algorithm
	* take any vertex as source and mark its weight to 0, and mark all other vertex weight to inifinti
	* for every unvisited adjacent vertex 
	* if current weight of this 'adjacent vertex' is more than current edge. then update 'adjacent vertex'.
		* mark current vertex as visited
	* do above steps for every vertices in increasing order of weights.
* formal algorithm
	* prims(G)
	* create PriorityQueue(Q)
	* insert all vertices into Q such that key value of starting vertex is 0 and all other is infiniti
	* while Q is not empty
		* currentVertex = dequeue(q)
		* for each unvisited adjacent vertex of current vertex
			*  if current weight of this 'adjacent vertex' is more than current edge. then update 'adjacent vertex' with current edge and parent to current node.
		* mark currentVertex as visited
## Magic framework
* Flow chart in helping to solve a problem
* Picture*

## Greedy algorithm
* What is greedy algorithm
	* is an algorithmic paradigm that builds up a solution piece by piece
	* it always chooses the next piece that offers the most obvious and immediate benefit.
	* locally optimal solution leads to global optimal solution (greedy choice)
* Common greedy algorithms
	* insertion sort
	* selection sort
	* topological sort
	* prims
	* krush kal
* **Activity selection problem**
	* we are given n activities with start and finish times. Select the maximum activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
		* sol: sort the finish time
		* select the first activity and print it
			* if the start time of this activity is greater or equal to the finish time of previous activity,then select this activity and print it.
* **Coin change problem**
	* given a value V, we want to make a change of V, given infinite supply of { 1,2,5,10,20,50,100,500.1000}, find minimum number of coins needed to make such change
	* arr[9] = { 1,2,5,10,20,50,100,500.1000};
	* result[9] = {0..0}
	* loop from 1000 to 1 with variable i
		* while (V - 	arr[i]) >  arr[i]
			* 	result[i]++
	* print from result
	* 
* ** Fractional kanapsack problem**
	* container has weight capacity of W, we need to fill it with items such that it contains max value. Note, items has weight and value property
	* loop through item and calculate 'density' of each item
	* sort the item by density in descending order
	* go through this list 1 by 1
		* if w - carried >= arr[i].weight   //consume all
			* carried = carried + arr[i].weight
		* else
			* consume fractional of item
			* remained = w - carried
			* value = remained * densityOfItem

## Divide and Conquer
* Divide and conquer is an algorithm design paradigm which breaks down problems into sub-problems of similar type recursively, until these become simple enough to be solved directly. The solution to the sub-problem are then combined to give a solution to the original problem.
* Optimal substructure
	* its overall optimal solution can be constructed from the optimal solutions of sub problem.
* Common divide and conquer problems
	* Binary search
	* Merge sort
	* Quick sort
	* Finonacci series
	* Number factor
		* given N, count the number of ways to express N as sum of 1,3,4
	* House thief
		* there are n houses in a line
		* a thief is going to steal the maximal value of these houses
		* but he cannot steal adjacent houses
		* what is the maximum stolen value?
	* Convert one string to another
		* we are given s1 and s2
		* we need to convert s2 into s1 by deleting inserting or replacing chars
		* write a function count the minimum number of edit operations
	*	Zero/one knapsack
		* given weights and profits of N items
		* we can put items in knapsack with capacity C
		* we cannot break item into fractional
		* challenge is to find the maximum profit from the items in the knapsack
	* longest common subsequence
		* we are given s1 and s2
		* we need to find the length of the longest sub-sequence which is common in both the strings.
		* sub-sequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remain elements.
		* func(s1Start,s1End,s2Start,s2End)
		* if(s1start==s1End || s2start==s1End)
			* return 0
		* if s1[s1Start] == s2[s2Start]
			* int x = 1 + func(s1Start+1,s1End,s2Start+1,s2End)
	 
		* int y = 0 + func(s1Start+1,s1End,s2Start,s2End)
		* int z = 0 + func(s1Start,s1End,s2Start+1,s2End)
		* return max(x,y,z)

	* Longest Palindromic Subsequence(LPS)
		* We are given a string S
		* we need to find the LPS in given string S
		* palindromic is a string that reads the same backward as well as forward and can be of odd or even length
		*  func(p1,p2,str)
			 * if(p1>p2)
			* return 0 // finished
			* if(p1==p2)
			* return 1
			* int x =0;
			* if(str[p1]==str[p2])
			*  	x = 2 + func(p1+1,p2-1,str)
			* int y = func(p1+1,p2,str)
			* int z = func(p1.p2-1,str)
			* return max(x,y,z)
	* Longest palindromic substring
	* 	*  func(p1,p2,str)
			 * if(p1>p2)
			* return 0 // finished
			* if(p1==p2)
			* return 1
			int x =0
			* if(str[p1]==str[p2])
				* int remaining = p2-p1-1
				* if(remaining == func(p1+1,p2-1,str)
				*  	x = 2 +remaining 
			* int y = func(p1+1,p2,str)
			* int z = func(p1.p2-1,str)
			* return max(x,y,z)
	* Min cost to reach last cell
		* we given 2d matrix
		* each cell have a cost associated with it
		* we need to start (0,0) and go till(n-1,n-1)
		* we can go only right or down from current cell
		* challenge is to do the traversal in minimum cost

	* Num of Path
		* numOfPath(arr[][],row,col,cost)
	

## Dynamic programming
* DP is a method for solving a complex problem by breaking it down into a collection of simpler sub-problems,solving each of those sub-problems just once, and storing their solutions
* the next time same problem occurs, instead of recomputing the solution, one simply look up the previous computed solution, thereby saving computation time at the expense of a modest expenditure in the store space
* dynamic programming is mainly an optimization over plain Divide and Conquer
* property
	* optimal substructure
	* overlapping subproblem
#### Aprroaches of Solving DP
* top down approach
	* start from bigger problem and break down to smaller problem
* bottom up approach
	* start from smaller problem and solve to top