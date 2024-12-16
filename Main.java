
    import java.util.Scanner;
     class Book{
        private String name;
        private String author;
        private double price;
        private int num_of_pages;
        Book(String name,String author,double price,int num_of_pages)
        {
            this.name=name;
            this.author=author;
            this.price=price;
            this.num_of_pages=num_of_pages;

        }
        public String getname()
        {
            return name;
        }
        public void setname(String name)
        {
            this.name=name;
        }
        public String getauthor()
        {
            return author;
        }
        public void setauthor(String author)
        {
            this.author=author;

        }
        public double getprice()
        {
            return price;

        }
        public void setprice(double price)
        {
            this.price=price;
        }
        public int getnum_of_pages()
        {
            return num_of_pages;
        }
        public void setnum_of_pages(int num_of_pages)
        {
            this.num_of_pages=num_of_pages;
        }
        public String toString()
        {
            return ("***BOOK DETAILS***\nName of the Book="+name+"\nAuthor="+author+"\nPrice="+price+"Number of pages="+num_of_pages+"\n");
        }

    }
    public class Main{
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number of books=");
            int n=input.nextInt();
            input.nextLine();
            Book book[]=new Book[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter the details of Book"+(i+1)+":");
                System.out.print("Enter the book name=");
                String name=input.nextLine();
                System.out.print("Enter the author=");
                String author=input.nextLine();
                System.out.print("Enter the price=");
                double price=input.nextDouble();
                System.out.print("Enter the number of pages=");
                int num_of_pages=input.nextInt();
                input.nextLine();
                book[i]=new Book(name,author,price,num_of_pages);
            }
            System.out.println("***************************Book Details****************************");
            for(int i=0;i<n;i++)
            {
                System.out.println(book[i].toString());
            }
        }
    }
