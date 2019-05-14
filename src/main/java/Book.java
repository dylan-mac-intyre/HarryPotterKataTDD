public class Book {

    int[] bookArray = new int[5];
    private double totalCost;

    public void add(String book){
        switch(book){
            case "Book1":
                bookArray[0]++;
                break;
            case "Book2":
                bookArray[1]++;
                break;
            case "Book3":
                bookArray[2]++;
                break;
            case "Book4":
                bookArray[3]++;
                break;
            case "Book5":
                bookArray[4]++;
                break;
        }
    }

    public double calculate() {
        int maxBookNumber = getMaxBooks();
        while (maxBookNumber > 0) {
            int setOfBooks = 0;
            for (int i = 0; i < bookArray.length; i++) {
                if (bookArray[i] > 0) {
                    bookArray[i]--;
                    setOfBooks++;
                }
            }
            totalCost += addSetToTotal(setOfBooks);
            maxBookNumber--;
        }
        return totalCost;
    }

    private int getMaxBooks() {
        int max = 0;
        for(int i =0; i < bookArray.length; i++){
            if(bookArray[i] > max){
                max = bookArray[i];
            }
        }
        return max;
    }

    private double addSetToTotal(int setOfBooks) {
        switch(setOfBooks){
            case 2: return ((8*2)*0.95);
            case 3: return ((8*3)*0.90);
            case 4: return ((8*4)*0.80);
            case 5: return ((8*5)*0.75);
            default: return 8;
        }
    }
}
