package com.avi6.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
// 이게 있어야 테스트가 가능함(유닛)
public class MemoRepositoryTest {

		@Autowired
		MemoRepository memoRepository;
	
		@Test
		// 이 메서드가 테스트 메서드임을 선언함
		//기본적으로 한 클래스에 unit 테스트 메서드는 하나여야함
		public void testCls() {
			System.out.println(memoRepository.getClass().getName());
		}
}
