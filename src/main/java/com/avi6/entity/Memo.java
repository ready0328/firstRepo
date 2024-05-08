package com.avi6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

// 무조건 자카르타여야함
// 이건 Entity 클래스야 라고 스프링에 등록을 제일 먼저 해줘야 합니다.
// 당연히 어노테이션을 이용
@Entity//엔티티임을 선언함.
// 기본적으로 엔티티 클래스 이름이 곧 테이블명이 됩니다.
// 하지만 테이블 이름을 다른 이름으로 변경하고 싶다면 @Table 이용해서
// 속성에 값을 이용하면 이름을 변경할 수도 있습니다.
@Table(name = "tbl_memo")
@ToString
//현재의 값을 문자열로 출력

//객체를 테이블로 생각

public class Memo {

		//  속성을 추가합니다. 기본적으로 private 으로 선언합니다.
		// 속성은 특별한 일이 없는 한 위 테이블의 컬럼으로 생성됩니다.
		// 당연히, 타입, 제약을 명시할 수 있습니다.
		// 매우 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// --- JPA 를 이용해서 테이블을 구성할때는 반드시 PK 를 지정해줘야 합니다.
		// 그렇지 않으면 에러가 발생
		// PK 설계 방법 : @ID 라는 선언으로 얘가 PK 컬럼이야 하고 선언함
		// 다음엔 PK 이기 때문에 	KEY 값(중복되지 않는 값)을 결정해줘야 합니다.
		// 이 방법은 @GeneratedValue 를 이용해서 그 속성(4종류가 존재함)의 값을 이용해서 결정
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long mno;//메모의 번호.pk
}
