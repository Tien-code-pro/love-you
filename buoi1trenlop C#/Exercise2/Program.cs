using System;

namespace Exercise2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Nhap ten :");
            String fullname = Console.ReadLine();

            Console.WriteLine("Nhap dia chi :");
            String diachi = Console.ReadLine();

            Console.WriteLine("Nhap so dien thoai:");
            int numbernew = System.Int32.Parse(Console.ReadLine());

            Console.WriteLine("=============================" );
            Console.WriteLine("ten ban la:  " + fullname);
            Console.WriteLine("dia chi cua ban la:  " + diachi);
            Console.WriteLine("so dien thoai cua ban la:  "+numbernew );
        }
    }
}
