using System;

namespace Exercise3
{
    class Program
    {
        static void Main(string[] args)
        {
            // nhap so a
            Console.WriteLine("Nhap so A:");
            String strA = Console.ReadLine();
            int a = Int32.Parse(strA);
            // nhap so b
            Console.WriteLine("Nhap so B:");
            String strB = Console.ReadLine();
            int b = Int32.Parse(strB);
            //nhap so c
            Console.WriteLine("Nhap so C:");
            String strC = Console.ReadLine();
            int c = Int32.Parse(strC);
            Console.WriteLine("============================== ");
            Console.WriteLine(" a = " + a + " b = " + b + " c = " + c );
            int max = 0;
            if( a > b)
            {
                max = a;
            }
            else
            {
                max = b;
            }
            if (max < c )
            {
                max = c;
            }
            Console.WriteLine("gia tri lon nhat la: " + max);

        }
    }
}
