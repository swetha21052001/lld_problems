package LibraryManagementSystem.Entities;

import java.time.LocalDateTime;

public class LoanItem {
    private Copy copy;
    private LocalDateTime borrowedTime;

    public LoanItem(Copy copy, LocalDateTime borrowedTime) {
        this.copy = copy;
        this.borrowedTime = borrowedTime;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public LocalDateTime getBorrowedTime() {
        return borrowedTime;
    }

    public void setBorrowedTime(LocalDateTime borrowedTime) {
        this.borrowedTime = borrowedTime;
    }
}
