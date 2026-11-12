// Runs the four new IntList methods and prints what each one gives (got)
// next to what it should give (expected). Do not change this file.
//
//     javac *.java
//     java IntListLab2

import java.util.function.Supplier;

public class IntListLab2 {
    static int ok = 0;
    static int total = 0;

    static void check(String what, Supplier<Object> code, Object expected) {
        total = total + 1;
        String got;
        try {
            got = String.valueOf(code.get());
        } catch (NullPointerException e) {
            got = "NullPointerException";
        }
        boolean same = got.equals(String.valueOf(expected));
        if (same) {
            ok = ok + 1;
        }
        System.out.println(what);
        System.out.println("   got:      " + got);
        System.out.println("   expected: " + expected + (same ? "   OK" : "   <-- not yet"));
    }

    // Builds a list with the items in the order given: listOf(4, 8, 15) is 4 -> 8 -> 15.
    static IntList listOf(int... items) {
        IntList list = new IntList();
        for (int i = items.length - 1; i >= 0; i--) {
            list.addFirst(items[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("== Part 4: isEmpty");
        check("new list, isEmpty", () -> new IntList().isEmpty(), true);
        check("4 -> 8 -> 15, isEmpty", () -> listOf(4, 8, 15).isEmpty(), false);

        System.out.println();
        System.out.println("== Part 5: getLast");
        check("getLast of 4 -> 8 -> 15", () -> listOf(4, 8, 15).getLast(), 15);
        check("getLast of 7 (one item)", () -> listOf(7).getLast(), 7);
        check("getLast of the empty list", () -> new IntList().getLast(), -1);

        System.out.println();
        System.out.println("== Part 6: get");
        check("get(0) of 4 -> 8 -> 15", () -> listOf(4, 8, 15).get(0), 4);
        check("get(2) of 4 -> 8 -> 15", () -> listOf(4, 8, 15).get(2), 15);
        check("get(3) of 4 -> 8 -> 15 (no such position)", () -> listOf(4, 8, 15).get(3), -1);
        check("get(0) of the empty list", () -> new IntList().get(0), -1);

        System.out.println();
        System.out.println("== Challenge: removeLast");
        IntList list = listOf(4, 8, 15);
        check("removeLast of 4 -> 8 -> 15 returns", () -> list.removeLast(), 15);
        check("the list after removeLast", () -> list, "4 -> 8 -> null");
        IntList one = listOf(7);
        check("removeLast of 7 (one item) returns", () -> one.removeLast(), 7);
        check("the list after removeLast", () -> one, "null");
        check("removeLast of the empty list", () -> new IntList().removeLast(), -1);

        System.out.println();
        System.out.println(ok + " of " + total + " checks OK");
    }
}
