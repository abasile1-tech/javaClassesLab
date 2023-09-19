package com.codebase;

//Create a Printer class that has a property for number of sheets of paper left.
//Add a method to print that takes in a number of pages and number of copies.
//The print method will only run if the printer has enough paper. If it runs it will reduce the value of the
// paper left by number of copies * number of pages.
//Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page printed.
public class Printer {
    private int sheetsOfPaper;

    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void setSheetsOfPaper(int sheetsOfPaper) {
        this.sheetsOfPaper = sheetsOfPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public void print(int numPages, int numCopies) {
        int pagesToUse = numPages*numCopies;
        if (pagesToUse <= this.getSheetsOfPaper() && pagesToUse <= this.getTonerVolume()) {
            this.setSheetsOfPaper(this.getSheetsOfPaper() - pagesToUse);
            this.setTonerVolume((this.getTonerVolume() - pagesToUse));
        }
    }
}
