using System;

namespace Exercise5
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal n = 1;
            for (int i = 1; i <= 20; i++)
            {
                n *= i;
                Console.WriteLine(n)
;
            }

        }
    }
}
