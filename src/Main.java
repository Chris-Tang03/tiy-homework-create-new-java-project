public class Main {
    public static void main(String[] args){
        System.out.println("Hello, " + "there.");
//  Using addition operator, operand Hello string on the left add the operand "there" on the right through concatenation.
        System.out.println("How are you doing?");
//  This syntax prints out the string within the body.
        System.out.println(3 + 5);
//  Operands having values 3 and 5 are added from left to right
        System.out.println(12 % 5);
//  Operands having values 12 and 5 are utilizing the remainder operator to find the remainder after 12/5, which is 2.
        System.out.println("class " + 8);
//  the string "class " is concatenated with value 8 using the addition operator.
        System.out.println(120 / 4);
//  Operand 120 is dividing operand 4 using the division operator
        System.out.println(3 * 5);
//  Operand 3 is multiplying operand 4 using the multiplication operator
        System.out.println(21 - 7);
//  Operand 120 is subtracting operand 4 using the subtraction operator
        System.out.println(((30 - 5) * 5) + 45);
//  The operands and operator (subtraction) in the innermost parentheses are evaluated first, then multiplication operator second, then addition operator last
        System.out.println(35 + 15 * 2 + " dollars");
//  Through the order of operation, multiplication will be evaluated first, then the very left operand (35) will use the addition operator, and finally the addition operator for the string.
    }
}