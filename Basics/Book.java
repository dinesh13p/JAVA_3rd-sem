public class Book {

            // Data Members
            String Title;
            String Author;
            float Price;
        
            // Parametarized Constructor
            Book(String _title, String _author, float _price){
                this.Title = _title;
                this.Author = _author;
                this.Price = _price;
            }
        
            void Result(){
                System.out.println("Name: "+ Title);
                System.out.println("Age: "+ Author);
                System.out.println("Salary: "+ Price);
            }
        
            public static void main(String[] args) {
                Book book1 = new Book("Eyes of God", "Hari" , 555);
                book1.Result();
        
                Book book2 = new Book("Understand Womens", "Sunil",660);
                book2.Result();
            }
            
        }
        
    