package test1;

import java.util.concurrent.ForkJoinPool;

public class main {

        static boolean foo1()
        {
            System.out.print("foo1()");
            return true;
        }
        static boolean foo2()
        {
            System.out.print("foo2()");
            return false;
        }
        public static void main(String[] args)
        {
            boolean bool;
            bool = foo1()||foo2();
            System.out.print(" ");
            bool = foo1()&&foo2();
            System.out.print(" ");
            bool = foo2()||foo1();
            System.out.print(" ");
            bool = foo2()&&foo1();



            String str="xkgj;xkgjh;xkjh;xkfh";
            for(int i=0; i<1000000;i++){
                str=str + str;
            }
        }
    }


