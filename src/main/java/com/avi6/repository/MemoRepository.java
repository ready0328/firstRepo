package com.avi6.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.avi6.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long>{

	
// <>안의 파라미터로는 emtity type, entity 의 pk 타입을 줘야함
	
	
}
