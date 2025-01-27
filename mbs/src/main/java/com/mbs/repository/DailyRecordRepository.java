package com.mbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.entity.DailyRecord;

public interface DailyRecordRepository  extends JpaRepository<DailyRecord, Long>{

	

	List<DailyRecord> findByUserIdAndMonthAndYear(Long userId, int month, int year);


	

}
