// LibraryItem abstract class
abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void checkIn() {
        this.checkedOut = false;
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Checked Out: " + (checkedOut ? "Yes" : "No"));
    }
}

// Book subclass
class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
}

// LibraryMember class
class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
}
