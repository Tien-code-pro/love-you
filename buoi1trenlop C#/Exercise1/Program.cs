using System;

namespace Exercise1
{
    class Program
    {
        public static void Main()
        {

            Console.Write("\n");
            Console.Write("In bang cuu chuong trong C#:\n");
            Console.Write("----------------------------");
            Console.Write("\n\n");

            int num, so_nhan;

            num = 2;

            do
            {

                so_nhan = 1;
                do
                {
                    Console.WriteLine("{0} x {1} = {2}",
                        num, so_nhan, num * so_nhan);
                    so_nhan++;
                }
                while (so_nhan <= 10);

                Console.WriteLine();
                num++;

            } while (num <= 9);

            Console.ReadKey();
        }
    }
}