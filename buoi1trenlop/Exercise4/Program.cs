using System;

namespace Exercise4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Nhap 1 so bat ki trong khoang tu 1 - 7 :");
            String strA = Console.ReadLine();
            int a = Int32.Parse(strA);
            switch (a)
            {
                case 1:
                    Console.WriteLine("Thu Hai");
                    break;
                case 2:
                    Console.WriteLine("Thu Ba");
                    break;
                case 3:
                    Console.WriteLine("Thu Tu");
                    break;
                case 4:
                    Console.WriteLine("Thu Nam");
                    break;
                case 5:
                    Console.WriteLine("Thu Sau");
                    break;
                case 6:
                    Console.WriteLine("Thu Bay");
                    break;
                case 7:
                    Console.WriteLine("Chu Nhat");
                    break;
                default:
                    break;
            }
        }
    }
}