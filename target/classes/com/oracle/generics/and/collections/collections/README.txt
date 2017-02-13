Collections framework (see page 140):
- List:   duplicates         ordered
- Set:    no duplicates      not ordered
- Queue:  duplicates         ordered        stack LIFO (last in first out), queue FIFO (first in first out)
- Map:    duplicate VALUES   not ordered    key value pairs

Collections framework interfaces

     +------------+       +-----+
     | Collection |       | Map |
     +-----+------+       +-----+
           |
   +----------------+
   |       |        |
+--+-+  +--+--+  +--+--+
|List|  | Set |  |Queue|
+----+  +-----+  +-----+

See page 141

List:
- ArrayList
- LinkedList *
- Stack
- Vector --> legacy

Set:
- HashSet (calls hashCode())
- TreeSet (calls compareTo(), no null values)

Queue:
- ArrayDeque (no null values)
- LinkedList *

Map:
- HashMap (calls hashCode())
- Hashtable (calls hashCode(), no null values) --> legacy
- TreeMap (calls compareTo(), no null values)

* LinkedList is special it implements both List and Queue interfaces


Collections interface:
- add(E element)
- remove(int index)
- remove(Object o)  // removes the first match
- isEmpty()
- size()
- clear()
- contains(Object o)

List interface:
- add(E element)
- add(int index, E element)  // insert a value
- get(int index)
- indexOf(Object o)  // calls equals(Object o)
- lastIndexOf(Object o)
- remove(int index)
- set(int index, E element)  // replace a value