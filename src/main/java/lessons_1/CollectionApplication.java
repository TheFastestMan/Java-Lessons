package lessons_1;

import java.lang.reflect.Member;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

public class CollectionApplication {

    public static void main(String[] args) {
        List <String> members = List.of("Members 1","Members 2","Members 3");
        Set <String> membersSet = Set.of("Members 1","Members 2","Members 3");
        Set<String> membersSet2 = new HashSet<>(asList("Members 1","Members 2","Members 3", "Members 3"));
        List<String> membersList2 = asList("Members 1", "Members 2", "Membe", "Members 3");
        List<String> membersList3 = new ArrayList<>(membersSet2);
        List <String> emptyMembers = emptyList();
        List <String> oneMemberList = singletonList("OneMember");
//        oneMemberList.add("TwoDicks");
//        emptyMembers.add("WWW");




        Iterator<String> iterator = membersSet2.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (String member : membersSet2) {
//            System.out.println(member);
//        }
//        for (int i = 0; i < members.size(); i++) {
//            System.out.println(members.get(i));
//        }

//        for (String s : membersList2) {
//            membersList2.add("members 4");
//            System.out.println(s);
//        }

//        membersList3.removeIf(member -> member.equals("Members 2"));
//        System.out.println(membersList3);

//        Iterator<String> iterator1 = membersList3.iterator();
//
//        while (iterator1.hasNext()){
//            iterator1.next();
//            iterator1.remove();
//        }
//        System.out.println(membersList3);
//
//        Cat cat1 = new Cat("Two", 3);
//        Cat cat2 = new Cat("One", 4);
//        Cat cat3 = new Cat("One", 4);
//
//        Set <Cat> cats = new HashSet<>(asList(cat1,cat2,cat3));
//
//        System.out.println(cats);

        Map <String, Integer> map =Map.of("Sean", 12,"Lord", 21,"Jon", 43);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
//            System.out.println(stringIntegerEntry);
        }
        Map <String, Integer> peopleIds = new HashMap<>();
        peopleIds.put("Ian", 12);
        peopleIds.put("Ivan", 21);
        peopleIds.put("Ires",54);

        peopleIds.putIfAbsent("Ivan1", 666);
        peopleIds.remove("RRR", 666);
//        System.out.println(peopleIds);

        membersList2.stream()
                .filter(member -> member.length() >= 6)
                .map(member -> member + "_zaebal")
                .collect(toList());

        String s = membersList2.stream()
                .reduce((a, b) -> a + "____" + b)
                .orElse("nihua net");

        System.out.println(s);

        System.out.println();

        int sum = IntStream.range(0, 50)
                .reduce((el, ac) -> el + ac)
                .orElse(0);

        System.out.println(sum);

        short r = 654;
        System.out.println((int) r);


    }
}
