/**
 * Ex04_09 - TypeCasting
 *
 * Visar olika sätt att konvertera mellan olika datatyper.
 *
 * @author Robert Jonsson
 */
public class TypeCasting {
    public static void main(String[] args) {
        int    i = 1000000000;          // En miljard
        long   l = 1000_000_000_000L;   // En biljon. Notera användningen av _
        float  f = 12345.678F;          // 8 värdesiffror
        double d = 12345.678912345678D; // 17 värdesiffror
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        // Implicit konvertering (automatisk)
        System.out.println("\nImplicit type casting (auto)");
        long l2 = i;   // int --> long
        double d2 = i; // int --> double
        double d3 = f; // float --> double
        System.out.println("int --> long (l2 = i)     --> " + l2);
        System.out.println("int --> double (d2 = i)   --> " + d2);
        System.out.println("float --> double (d3 = f) --> " + d3);

        // Explicit konvertering (påtvingad)
        System.out.println("\nExplicit type casting (forced)");
        int i2 = (int)l;      // long --> int
        int i3 = (int)d;      // double --> int
        float f2 = (float)d;  // double --> float
        System.out.println("long --> int (i2 = (int)l)       --> " + i2);
        System.out.println("double --> int (i3 = (int)d)     --> " + i3);
        System.out.println("double --> float (f2 = (float)d) --> " + f2);

        // Boxing Conversion (från primitiv typ till motsvarande wrapper-klass)
        System.out.println("\nBoxing");
        Boolean b = true;
        Integer i4 = 100;
        Double d4 = 100.1;
        System.out.println("boolean --> Boolean (Boolean b = true) --> " + b);
        System.out.println("int --> Integer (Integer i = 100)      --> " + i4);
        System.out.println("double --> Double (Double d = 100.1)   --> " + d4);

        // Unboxing Conversion (från wrapper-klass till motsvarande primitiv typ)
        System.out.println("\nBoxing");
        boolean b2 = Boolean.valueOf(false);
        int i5 = Integer.valueOf(-1);
        char c = Character.valueOf('c');
        System.out.println("Boolean --> boolean (Boolean b2 = Boolean.valueOf(false)) --> " + b2);
        System.out.println("Integer --> int i5 = Integer.valueOf(-1)                  --> " + i5);
        System.out.println("Double --> char c = Character.valueOf('c')                --> " + c);
    }
}