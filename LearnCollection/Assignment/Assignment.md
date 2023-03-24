# Question 1 :- What is the Collection framework in java
**Answer** :- Collection framework has a number of inbuilt classes and inerfaces which is used to store and manipulate data So that they can work in a similar manner with a high degree of interoperability.
It provides classes link  ArrayList , LinkedList , ArrayDeque , TreeSet , PriorityQueue and iterfaces like :- List, Queue , Set etc.

# Question 2 :- Differencce between ArrayList and Linked List.
**Answer** :- 
| ArrayList             |  Linked List
|-----------------------|---------------|
| It uses dynamic array | it uses doubly linked list |
| better for storing and fetching data | better for manipulating data |
| Don't implements Deque | implements Deque |
| An ArrayList is backed by an array, which means that accessing an element at a specific index is very fast because it can be done in constant time|LinkedList requires traversing the list from the beginning or end, which can be slow |
| takes less memory over head| takes more memory overhead beacause it stores address of previous and next node |

# Question 3 :- Difference between ListIterator and Iterator
**Answer** :- 
| Iterator | ListIterator |
|----------|--------------|
| can be use with List, set and Queue | It can only be used with List |
| Forward traversing only | can traverse in forward as well as backward direction |
| Only remove method | we ca use set , add and another methods also |

# Question 4 :- Difference between Enumeration and Iterator ?
**Answer** :- 
| Iterator | Enumeration |
|-----------|-------|
| Universal cursor | Only for legacy classes |
| can read and remove | can only read |
| fail fast | not fail fast |
| slow in speed then Enemuration (because can remvove as well) | fast in speed |

# Question 5 :- What is the difference between list and set.
**Answer** :- 
| List | Set |
|------|------|
| Index based accessing is allowed | Index based accessing is not allowed |
| Duplicates allowed | Duplicates not allowed |
| can insert between any index | can insert only at first or last |
| Order of insertion is Preserved | Order of insertion is not preserved|
| more than one null values allowed | Only one null value allowed |

# Question 6 :- What is the difference between HashSet and TreeSet ?
**Answer** :- 
| HashSet | TreeSet |
|---------|----------|
| Not sorted | Sorted|
| uses hash table |uses tree structure |
| High perforamce ( time complexity O(1) ) | Slow than HashSet (Can be upto O(n) ) |
| Uses Less memory because order is not preserved | High memory usage because order is preserved |
| not implements sorted set | implements sorted set |

# Question 7 :- What is the difference between Array and ArrayList ?
**Answer** :- 
| Array | ArrayList |
|-------|-----------|
| Fixed in size | Dynamic in size |
| Can't use iterators | Can use iterators |
| can store primitive data and objects | ArrayList can only store objects |
|  Better performance than ArrayList due to fixed size| Low Performance than  Array Due to dynamic size |
| We can provide values while initalising | Need to use methods to provide value | 