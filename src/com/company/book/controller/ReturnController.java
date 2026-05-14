/**
 * 파일명	: ReturnController.java  <br>
 * 설명	: 반납 기능 실행 <br>
 * 작성자	: jinyoung <br>
 * 작성일	: 2026. 5. 14. <br>
 * 버전 	: 1.0
 */
package com.company.book.controller;

import com.company.book.service.ReturnService;

public class ReturnController {

    ReturnService service = new ReturnService();

    public void returnBook() {

        System.out.println("반납 기능 실행");

        service.returnBook();

    }

}
