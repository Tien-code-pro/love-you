using System;

namespace vidu2
{
    class Program
    {
        static void Main(string[] args)
        {
            var p1 = new { Name = "A", Price = "3" };
            Console.WriteLine("Name = {0}\n Price= {1}",
            p1.Name.ToLower(),p1.Price);

            var i = 5;
            var s = "hello";
            Console.WriteLine("type of is: "+i.GetType());

            Console.WriteLine("first letter of s: "+s.Substring(1,1));
            Console.ReadLine();


        }
    }
}
