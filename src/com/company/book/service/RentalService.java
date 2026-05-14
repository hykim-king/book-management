package com.company.book.service;


public class RentalService {

    public boolean rentBook(int bookId, String userId) {
        // 1. 도서 존재 여부 및 대여 가능 여부 확인 로직 (Repository 활용)
        // 예시: repository.findBookById(bookId);
        
        System.out.println(bookId + "번 도서를 " + userId + "님에게 대여 처리를 시작합니다.");
        
        // 2. 실제 대여 처리 (성공 시 true 반환)
        // 이 부분은 Repository의 데이터를 업데이트하는 로직이 추가되어야 합니다.
        return true; 
    }
}