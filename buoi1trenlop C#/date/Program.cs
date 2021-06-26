using System;

namespace date
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("currency formating - {0:C} {1:C4}",88.88,888.8);
            Console.WriteLine("interger formating - {0:D5}",88);
            DateTime dt = DateTime.Now;
            Console.WriteLine("today d format:{0:d}",dt);
            Console.WriteLine("today D format:{0:D}",dt);
            Console.ReadLine();
        }
    }
}
