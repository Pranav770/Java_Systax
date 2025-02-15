import java.util.Scanner;

//Operators 
class Operators {
    public void Arithmetic() {
        System.out.println("Variable 1 + Variable 2");
        System.out.println("Variable 1 - Variable 2");
        System.out.println("Variable 1 * Variable 2");
        System.out.println("Variable 1 / Variable 2");
        System.out.println("Variable 1 % Variable 2");
    }

    public void Assignment() {
        System.out.println("Variable1 = value");
        System.out.println("Variable1 += value");
        System.out.println("Variable1 -= value");
        System.out.println("Variable1 *= value");
        System.out.println("Variable1 /= value");
        System.out.println("Variable1 %= value");
        System.out.println("Variable1 &= value");
        System.out.println("Variable1 |= value");
        System.out.println("Variable1 ^= value");
        System.out.println("Variable1 >>= value");
        System.out.println("Variable1 <<= value");
    }

    public void Rational() {
        System.out.println("Variable1 > Variable2");
        System.out.println("Variable1 < Variable2");
        System.out.println("Variable1 >= Variable2");
        System.out.println("Variable1 <= Variable2");
        System.out.println("Variable1 == Variable2");
        System.out.println("Variable1 != Variable2");

    }

    public void Logical() {
        System.out.println("Variable1>1 && Variable1<10");
        System.out.println("Variable1>1 || Variable1<10");
        System.out.println("!(Variable1>1 && Variable1<10)");
    }

    public void Bitwise() {
        System.out.println("Variable1 & Variable2");
        System.out.println("Variable1 | Variable2");
        System.out.println("Variable1=value << 1 ");
        System.out.println("Variable1=value >> 1 ");
        System.out.println("Variable1=~value");
        System.out.println("Variable1 ^ Variable2");
    }

    public void Ternary() {
        System.out.println("(//Condition)? a:b");
    }
}

// Conditional statment
class Condition {
    public void If() {
        System.out.println("if(//Condition){\n//Statement to be executed\n}");
    }

    public void If_else() {
        System.out.println("if(//Condition){\n//Statement to be executed\n}else{\n//Statement to be executed\n}");
    }

    public void else_If() {
        System.out.println(
                "if(//Condition){\n//Statement to be executed\n}else if(//Condition){\n//Statement to be executed\n}");
    }

    public void _Switch_Case() {
        System.out.println("switch(//key){\ncase value:\n//statement\nbreak;\ndefault:\nbreak;}");
    }
}

// Loops
class Loops {
    public void While() {
        System.out.println("while(//Condition){\n//Statement to be executed\n}");
    }

    public void DoWhile() {
        System.out.println("do{\n/Statement to be executed\n}(Condition)");
    }

    public void ForLoop() {
        System.out.println("for(//initialization;//condition;//increment){\n//statement\n}");
    }
}
//Break & continue
class Break{
    public void _break(){
        System.out.println("while(//Condition){\n//Statement to be executed\nbreak;\n}");
    }
    public void _continue(){
        System.out.println("while(//Condition){\n//Statement to be executed\ncontinue;\n}");
    }
}
// Methods

class Methods{
    public void Methode(){
        System.out.println("public class Main{\nstatic void myMethode(){\n//code to be executed\n   }\npublic static void main(String[] args){\nmyMethode();\n  }\n}");
    }
    public void Methode_Parameter(){
        System.out.println("public class Main{\nstatic void myMethode(parameter1(ex-int 1),parameter2(ex int num2)){\n//code to be executed\n   }\npublic static void main(String[] args){\nmyMethode();\n  }\n}");
        System.out.println("//return type\npublic class Main{\nstatic int myMethode(parameter1(ex-int 1),parameter2(ex int num2)){\n//code to be executed \nreturn value;\n   }\npublic static void main(String[] args){\nmyMethode();}\n}");
    }
    public void Methode_Overloading(){
        System.out.println("int myMethod(int x){\ncode to executed\n}\nint myMethode(int x,int y){\ncode to execute}\n");
    }
}
// Objects and classes
class Obj_Class{
    public void Class(){
        System.out.println("// To create a class \nclass MyClass{\n//class atributes and methodes\n}");
    }
    public void Obj(){
        System.out.println("//To create  objects\npublic class main{\npublic static void main(String[] args){\nMyClass Car=new MyClass //now we can use this object created\n  }\n} ");
    }
    public void Atributes_Method(){
        System.out.println("//atributes & methodes are defined under a class\nclass MyClass{\nString Car;\nint model\n//We can also define methodes inside the classs\n public void MyMethod(){\n   }\n}");
    }
    public void Constructor(){
        System.out.println("//Constructors are special method ");
    }

}



public class PSyntax {
    static void Basic() {
        System.out.println(
                "public class YourClass{\npublic static void main(String[]args){\n System.out.println(\"Hello world\")\n    }\n}");
    }

    public static void main(String[] args) {
        // Objects
        Scanner sc = new Scanner(System.in);
        Operators OP = new Operators();
        Condition Con = new Condition();
        Loops l = new Loops();
        Break B=new Break();
        Methods M=new Methods();
        Obj_Class O=new Obj_Class();

        System.out.println("1)Basic syntax for java");
        System.out.println("2)Operators");
        System.out.println("3)if conditions in java");
        System.out.println("4)Loops");
        System.out.println("5)Break and Continue");
        System.out.println("6)Methods");
        System.out.println("7)OOPs");
        System.out.println("Enter your response");
        int value = sc.nextInt();
        // while (true) {
        switch (value) {
            // Basic syntax
            case 1:
                Basic();
                break;
            // Operators in java
            case 2:
                System.out.println("Which  type of operattion you want to perform");
                System.out.println(
                        "1)Aritmetic operators\n2)Assignment operators\n3)Rational operators\n4)Logical operators\n5)Bitwise operator\n6)Unary operator");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        OP.Arithmetic();
                        break;
                    case 2:
                        OP.Assignment();
                        break;
                    case 3:
                        OP.Rational();
                        break;
                    case 4:
                        OP.Logical();
                        break;
                    case 5:
                        OP.Bitwise();
                        break;
                    case 6:
                        OP.Ternary();
                        break;

                    default:
                        System.out.println("invalide input");
                        break;
                }
                break;
                // If statements in java

            case 3:
                System.out.println("1)if \n2)else\n3)else if");
                int con = sc.nextInt();

                switch (con) {
                    case 1:
                        Con.If();
                        break;
                    case 2:
                        Con.If_else();
                        break;
                    case 3:
                        Con.else_If();
                        break;
                    case 4:
                        Con._Switch_Case();
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                System.out.println("1)while loop\n2)do while loop\n3)for loop");
                int L = sc.nextInt();
                switch (L) {
                    case 1:
                        l.While();
                        break;
                    case 2:
                        l.DoWhile();
                        break;
                    case 3:
                        l.ForLoop();
                        break;
                    default:
                        break;
                }
                break;
                case 5:
                System.out.println("1)break\n2)continue");
                int S=sc.nextInt();
                switch (S) {
                    case 1:
                    B._break();
                    break;
                    case 2:
                    B._continue();
                    break;
                    default:
                        break;
                }
            break;
                case 6:
                System.out.println("1)Method \n2)Method parameter\n3)Method Overloading");
                int m=sc.nextInt();
                switch (m) {
                    case 1:
                    M.Methode();
                        break;

                    case 2:
                    M.Methode_Parameter();
                    break;
                    case 3:
                    M.Methode_Overloading();
                    default:
                        break;
                }
                break;
                case 7:
                System.out.println("1)Class\n2)Objects\n3)atributes & methode\n4)Constructor");
                int o=sc.nextInt();
                switch (o) {
                    case 1:
                        O.Class();
                        break;
                    case 2:
                    O.Obj();
                    break;
                    case 3:
                    O.Atributes_Method();
                    break;
                    case 4:
                    O.Constructor();
                    break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        // }
        sc.close();
    }
}