package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import collections.Emp;

public class Streams {
	public static void main(String[] args) {
		Emp emp = new Emp(8, "raju", "raju@gmail.com");
		Emp emp1 = new Emp(8, "raju", "raju@gmail.com");
		Emp emp2 = new Emp(3, "santha", "santha@gmail.com");
		Emp emp3 = new Emp(4, "ramu", "ramu@gmail.com");
		
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		//List<Emp> ll=list.stream().filter(a->a.getId()%2==0).toList();
		//ll.forEach(a->System.out.println(a) );
		
		List<String> list2 = list.stream().filter(a->a.getId()>=3).map(a->a.getName()+"$$$").toList();
		for (String string : list2) {
			System.out.println(string);
		}
		Set<Emp> collect = list.stream().collect(Collectors.toSet());
		for (Emp emp4 : collect) {
			System.out.println(emp4);
		}
		System.out.println(); 
		Optional<Emp> min = collect.stream().max((a,b)->a.compareTo(b));
		
		System.out.println(min.get());
		System.out.println();
		
		list.stream().sorted((a,b)->b.compareTo(a)).forEach(a->System.out.println(a));
		Set<Emp> set = list.stream().filter(a->a.getId()%2==0).collect(Collectors.toSet());
		System.out.println(set);
		
		list.forEach(System.out::println);
		
		
		


	}}
