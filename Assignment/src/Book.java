public class Book {
    public String title;
    public String description;
    public int numCopiesAvailable;
    public String branchLocation;


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", numCopiesAvailable=" + numCopiesAvailable +
                ", branchLocation='" + branchLocation + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumCopiesAvailable() {
        return numCopiesAvailable;
    }

    public void setNumCopiesAvailable(int numCopiesAvailable) {
        this.numCopiesAvailable = numCopiesAvailable;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public Book(String title, String description, int numCopiesAvailable, String branchLocation) {
        this.title = title;
        this.description = description;
        this.numCopiesAvailable = numCopiesAvailable;
        this.branchLocation = branchLocation;
    }






}
