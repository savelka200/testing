public class Author {
        String FIO;
        int DateofBirth;
        int numberofBooks;

        public Author(String FIO, int DateofBirth,int numberofBooks){
            this.FIO=FIO;
            this.DateofBirth=DateofBirth;
            this.numberofBooks=numberofBooks;
        }
    public String toString(){
            return FIO +", дата рождения: "+DateofBirth+", кол-во книг: "+numberofBooks;
    }
}
