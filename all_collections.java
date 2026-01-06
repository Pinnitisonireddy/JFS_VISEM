Java Collection Framework (JCF)
----------------------------------
1️.List Interface – ArrayList
✔ Ordered, allows duplicates
Example 1;
import java.util.*;

public class ArrayListExample 
{
    public static void main(String[] args) 
	{
        List<Integer> nums = new ArrayList<>();
        names.add(7);
        names.add(3);
        names.add(2); 
		names.add(5); 		

        System.out.println(nums);
    }
}


Example-2

import java.util.*;

public class ArrayListExample 
{
    public static void main(String[] args) 
	{
        List<String> names = new ArrayList<>();
        names.add("Virat");
        names.add("Rohit");
        names.add("Virat");   // duplicate allowed

        System.out.println(names);
    }
}

2️.List Interface – LinkedList
✔ Fast insertion & deletion

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addFirst(5);
        list.addLast(20);
		list.add(25);
        System.out.println(list);
    }
}



3️.Set Interface – HashSet
✔ No duplicates, unordered

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);  // duplicate ignored

        System.out.println(set);
    }
}

4️.Set Interface – LinkedHashSet
✔ No duplicates, insertion order preserved
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("A");
        set.add("C");
        set.add("B");

        System.out.println(set);
    }
}

5️.Set Interface – TreeSet
✔ Sorted order
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println(set);
    }
}

6️. Map Interface – HashMap
✔ Key-value pair, no duplicate keys
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "Spring"); // overwrites value

        System.out.println(map);
    }
}

7️.Map Interface – LinkedHashMap
✔ Maintains insertion order
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "C");
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map);
    }
}

8️.Map Interface – TreeMap
✔ Sorted by key
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map);
    }
}

9️.Queue Interface – PriorityQueue
✔ Priority-based ordering
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

10. Deque Interface – ArrayDeque ( Double Ended Queue)

✔ Insert/remove from both ends

import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);
		dq.removeFirst();
		System.out.println("After remove : "+dq);
		
		
    }
}

1️1. Iterator
✔ Traverse collection
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

1️2. Comparable Interface

✔ Natural sorting

import java.util.*;

class Student implements Comparable<Student> 
{
    int age;
    Student(int age) { this.age = age; }

    public int compareTo(Student s) {
        return this.age - s.age;
    }

    public String toString() {
        return age + "";
    }
}

public class ComparableExample 
{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(23));
        list.add(new Student(20));
        list.add(new Student(25));

        Collections.sort(list);
        System.out.println(list);
    }
}

1️3. Comparator Interface
✔ Custom sorting


import java.util.*;

class Employee {
    int salary;
    Employee(int salary) { this.salary = salary; }
}

public class ComparatorExample 
{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(50000));
        list.add(new Employee(30000));

        Collections.sort(list, (a, b) -> a.salary - b.salary);
        list.forEach(e -> System.out.println(e.salary));
    }
}

1️4. Collections Utility Class
✔ Sorting, searching, reversing

import java.util.*;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 1, 3, 2);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}



//
import java.util.*;

class Student implements Comparable<Student> 
{
    int age;
	String name;
	int marks;
    Student(String name,int age, int marks) 
	{ 	this.age = age; 
		this.name = name; 
		this.marks=marks;
	}

    public int compareTo(Student s) {
        //return this.age - s.age;
		//return this.name.compareTo(s.name);
		return this.marks-s.marks;
    }

    public String toString() {
        return "Name : "+ name + "\tAge  "+age + "\tMarks "+marks ;
    }
}

public class ComparableExample 
{
    public static void main(String[] args) 
	{
        List<Student> list = new ArrayList<>();
		
        list.add(new Student("Lenin",20,170));
        list.add(new Student("Madhu",18,200));
        list.add(new Student("Bhageeratha",21,150));

        Collections.sort(list);
		
		for(Student s : list)
		{
		
			System.out.println(s);
		}
    }
}
