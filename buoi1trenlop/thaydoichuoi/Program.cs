using System;

namespace thaydoichuoi
{
    class testA
    {
        public String name;
    }
    class Program
    {
        static void Main(string[] args)
        {
            int z = 10;
            String str = "Hello World!";

            Console.WriteLine("11111111111 test value type:");
            Console.WriteLine("the value of before: :"+z);
            changeValue(z);
            Console.WriteLine("the value of after: :" + z);

            Console.WriteLine("11111111111 test value type:");
            testA a = new testA();
            a.name = "not change";
            Console.WriteLine("the value of str before: :" + a.name);
            changeValue2(a);
            Console.WriteLine("the value of str after: :" + a.name);
            Console.ReadLine();
        }
        public static void changeValue(int k)
        {
            k = 100;
        }
        public static void changeValue2(testA v)
        {
            v.name = "change it";
        }
    }
}
