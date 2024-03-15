# Ovedrview

Containers can be described as the objects that hold the data of the same type.

Containers are used to implement different data structures for example ***arrays, list, trees***, etc.

&nbsp;

The container manages the storage space for its elements and provides member functions to access them, either directly or through iterators (reference objects with similar properties to pointers).

&nbsp;

&nbsp;

# Classification of containers

1. Sequence containers
2. Associative containers
3. Derived containers or Container Adaptors
4. Unordered Associative Containers

&nbsp;

## ***Sequence containers***

implement data structures that can be accessed in a sequential manner.

|Sequence containers|Description|
|-|-|
| ***arrays***|   Static contiguous array (class template)
| ***vector***|  Dynamic contiguous array (class template)
| ***deque***| Double-ended queue (class template)
| ***list***| Doubly-linked list (class template)
| ***forward_list***| Singly-linked list (class template)
  
&nbsp;

## ***Associative containers***

implement sorted data structures that can be quickly searched (O(log n) complexity).

|Associative containers|Descriptions|
|-|-|
| ***set***| Collection of unique keys, sorted by keys (class template)
| ***multiset***| Collection of keys, sorted by keys (class template)
| ***map***| Collection of key-value pairs, sorted by keys, keys are unique (class template)
| ***multimap***| Collection of key-value pairs, sorted by keys (class template)

&nbsp;

## ***Derived containers or Container Adaptors***

provide a different interface for sequential containers

|Derived containers or Container Adaptors|Descriptions|
|-|-|
| ***stack***| Adapts a container to provide stack (LIFO data structure) (class template)
| ***queue***| Adapts a container to provide queue (FIFO data structure) (class template)
| ***priority_queue***| Adapts a container to provide priority queue (class template)

&nbsp;

## ***Unordered Associative Containers***

implement unordered data structures that can be quickly searched


|Unordered Associative Containers|Descriptions|
|-|-|
| ***unordered_set*** |Collection of unique keys, hashed by keys. (class template)|
| ***unordered_multiset*** |Collection of keys, hashed by keys (class template)|
| ***unordered_map*** |Collection of key-value pairs, hashed by keys, keys are unique. (class template)|
| ***unordered_multimap*** |Collection of key-value pairs, hashed by keys (class template)|

&nbsp;

&nbsp;
