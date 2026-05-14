package com.company.book.domain;

import java.util.Date;

public class RentalVO {
    private int bookId;      // 대여된 도서 번호
    private String userId;   // 대여한 사용자 ID
    private Date rentalDate; // 대여 일자

    public RentalVO(int bookId, String userId, Date rentalDate) {
        this.bookId = bookId;
        this.userId = userId;
        this.rentalDate = rentalDate;
    }

    // Getter 및 Setter
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public Date getRentalDate() { return rentalDate; }
    public void setRentalDate(Date rentalDate) { this.rentalDate = rentalDate; }
}